package com.util;

import io.goeasy.GoEasy;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.service.yjh.operationservice;

/**
 * 定时任务类
 * 
 * @author her
 * 
 */
@Component
public class ScheduledTest {

	@Resource
	operationservice ose;
	// 调用消息推送接口
	
	GoEasy goEasy = new GoEasy("rest-hangzhou.goeasy.io",
			"BC-d28d9b29a88a4676875adacee352444a");

	private static final Logger logger = LoggerFactory
			.getLogger(ScheduledTest.class);

	/*0 0 10,14,16 * * ? 每天上午10点，下午2点，4点
			0 0/30 9-17 * * ? 朝九晚五工作时间内每半小时
			0 0 12 ? * WED 表示每个星期三中午12点
			"0 0 12 * * ?" 每天中午12点触发
			"0 15 10 ? * *" 每天上午10:15触发
			"0 15 10 * * ?" 每天上午10:15触发
			"0 15 10 * * ? *" 每天上午10:15触发
			"0 15 10 * * ? 2005" 2005年的每天上午10:15触发
			"0 * 14 * * ?" 在每天下午2点到下午2:59期间的每1分钟触发
			"0 0/5 14 * * ?" 在每天下午2点到下午2:55期间的每5分钟触发
			"0 0/5 14,18 * * ?" 在每天下午2点到2:55期间和下午6点到6:55期间的每5分钟触发
	*/
	@Scheduled(cron = "0 0/1 9-17 * * ?")
	public void executeUploadTask() {
		// 间隔1分钟,执行工单上传任务
		Thread current = Thread.currentThread();

		List<Map<String, Object>> list = ose.findadvet(null, 0);// 查询正在执行的订单
		System.out.println(list);
		for (Map<String, Object> map : list) {
			// 当前点击量*单价 =现在已经消费的金额
			double nowsum = Double.parseDouble(map.get("hits").toString())
					* Double.parseDouble(map.get("unit").toString());
			  int oid=Integer.parseInt(map.get("orderid").toString());
			// 总价格
			double sum = Double.parseDouble(map.get("sum").toString());
			// 如果消费金额达到总金额的10%
			if (sum < sum * 0.1 + nowsum) {
				int uid = Integer.parseInt(map.get("uid").toString());
				Integer wid=ose.findbyid(oid);
				if(wid==null){ 
					goEasy.publish("user"+uid, "有未读消息");//发送通知
					//添加到消息提醒表
					ose.addmsg("您的订单即将完成，您可续费继续进行此订单","订单续费提醒", uid, 0,oid);
					System.out.println("ok");	
				}
			} else {
				System.out.println(nowsum);
			}
		}

		logger.info("ScheduledTest.executeUploadTask 定时任务:" + current.getId()
				+ ",name:" + current.getName());
	}
	
}
