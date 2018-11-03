package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092000551471";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCUfclfzYIeNOa8UTOWaZMlCWnRuIAkcO2BxjxUDEbRXbDHY7QMUMokzLNHa9ZVz5IX7MKop1mOl0Y3/+ZXKI+ZTDtAPD3VicQ3z9v7Kkw5MNzlO25+kLvOBzYoo3JEmA2R4hlvYQiRHY3SlEfsZNkX62l2jM63UfnXT+qBC3GRYjTQn0egx48LYuEGWomSUrsm6v8wBADih6ysgkroci4Hosh6vXeATw6LDNJvEj/JIf4L3MTuDPfACyICJKoW0IgbRNQzX+oz2SaTxRuYlbrQPDeEYWUtFmrlmlf3IjeM9FfKR5CIEi0RS5SGSqI8g/WPHgxAogW/UhmMvbojsfozAgMBAAECggEAfOsY5oR/ayP72/6/1FB6nhS+NdTt0DpERAFdrSMqzGTyG7sPs7CfbbfbNkFM7aGSeJgP5kvqtl8ijme0Aiy4KTGNQuuq5SJhtMYjfLdHqnEl055cxRLDO36rnCJsNbJo8AnyddV+nH3tWnKt0vu/+jRr43RvTp8i/HRZhjf3UWKvhY/b05jpGoHyyw2139Pg30Ttk3xmZt6oyFhqE4x/YIjF4Z3aKtoPWHtTF0SN4Y96P9BN2u6eoh47OA+FS9q8xES2jd0IvDQV4n3Er7x7NgQ1XtcNaprrEcoiIeows4NSeVfU9jnrYwuoqkAH7bHpD17BvtbJqCAcYDLIF8Tw4QKBgQDaNO+p3jgjYWRJIAB47OJVnElatY5ctKcr+pS4YkfBgNEDlWBkHsFVmkGliyIbRQtxJg8OtZPteMANLApwhJ79ykRLNy4YrtOPoGW+WIOpi7+kttM9+buIXBPfEaxbyS9eeVaB1kuzcWkzQoEh47pUO9Tr9vH9uEFDFogEsOMMMQKBgQCuNb1+SkWNKePJPVxQDro3rcXhMURcwSO1AbHUWRExRxuWLq/7rtX+pyEDgaLTecJ6t71B5lbxD9WJ9UBC43JfPrboJuHtaTH9F3ilc5Zf1uSiDlduMaF7wQyThVjMNzPCRD2hAU1LrKho0xTPe/FjLFj/FwpdYteOMkXPefHnowKBgQC6MKtDxfMe9W5uGxlsFa03IalR9lNodVmj5ChcgLf7vCAdL6vVIo0TrxFO4T6UCEEwJip5AaUc34j4dFjgE7nakmndyFLUCvFIv7OxTLPjyvQW502ut1Y2j2MBV4I7u5powZ54IVPs5NvAOoIXWcrXL0qKoedw+HTvet1LK2hBMQKBgBfWsr99WlcezFTVWLR7z2+fD9zo6PnoVAKI4NS1+2xK1rOOX/aIzi+ynwnjy2w01TAFxJgn9O23xPjD3q9IgHYYFt9dsrzSEE0Z0SCS2Jj0xwSGAeDKWdadbCMjtCr9ws9qlyRZEUKxtbniaI6b30Q65VLCzGBLDkQfDP5/KWMRAoGACDbNPR+tqk+GVEo+gv120VWTDESR2FSRHQt+GgkOCL8OOYVO2VNLhYwKlqgaItUva0ssTsMe/L2A62R433/moKwYBsLWP0wYpOlf/fcusAT6IvRmwYOmjpS1MCXKerFgrpIA3Hkg91iYVM0u/hWNCGtg+8FrxJJBraXW0bxyhsQ=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzvPJbqdO+CZtCbYPtPmbtwjaa/Ge2vpektvEEzuRH35xx2ckxvJyzvPavym1DfvNuWKjbI0b3BVswxLncNESNSkGlpA3ySK7Xnmia5z70uJR7JTLzACzMzwcktc7mDrkf6tZhSW4WM7nXeH9cwWxhH5eJTMD410PVlLv/NXvGCb7cVkK4+cIr8RGA2+gZMREGD1mgyIzfuxN8OxQqISPbuJLO1cAnJtbRR5hFHC5yqsTMXUOuzNkVCUFnpe7y8AO+MAyKd7G8sT4I67NA6342Fa4oQHRBB120hebT7D04+oNMEmtkVl6fyh5M4iQI3XNXpeFyBWqzrnFlizAr7bW+wIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/AdCenter/notifyUrl";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/AdCenter/returnUrl";

	// 签名方式
	public static String signtype = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";


    public static String format = "json";
	// 支付宝网关
	public static String url = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";
}

