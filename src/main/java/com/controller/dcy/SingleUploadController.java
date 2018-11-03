package com.controller.dcy;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.entity.muban;
import com.service.dcy.mubanservice;



@Controller
@RequestMapping("single")
public class SingleUploadController {
	@Autowired
	mubanservice ms;
	@RequestMapping("upload")
	public String upload(MultipartFile photo,HttpSession session,String name,String url) throws IOException {
		System.out.println("photo:" + photo);
		// 获取表单提交时文件得name属性名
		System.out.println("getName:" + photo.getName());
		// 文件类型
		System.out.println("getContentType:" + photo.getContentType());
		// 文件大小（字节）
		System.out.println("getSize:" + photo.getSize());
		// 文件（字节数组）
		System.out.println("getBytes:" + photo.getBytes());
		// 获取上传文件得原名
		String originalFilename = photo.getOriginalFilename();
		System.out.println("getOriginalFilename:" + originalFilename);

		// 判断是否选择了上传文件
		if (null != originalFilename && !originalFilename.equals("")) {
			// 1.重命名
			UUID uuid = UUID.randomUUID();

			String saveFileName = uuid.toString()
					+ originalFilename.substring(originalFilename
							.lastIndexOf("."));
			// 2.保存路径
			String savePath = "E:/AAA课程/毕业项目/AdCenter/src/main/webapp/img/dcy/" + saveFileName;
			int uid= (int) session.getAttribute("uid");
			String uurl="img/dcy/"+saveFileName;
			muban mb=new muban();
			mb.setMname(name);
			mb.setMurl(url);
			mb.setMimg(uurl);
			mb.setUid(uid);
			mb.setUudit("0");
			ms.insert(mb);
			System.out.println(savePath);

			File saveFile = new File(savePath);
			// 3.文件保存，另存为
			photo.transferTo(saveFile);
		}
		return "muban/query";
	}
}
