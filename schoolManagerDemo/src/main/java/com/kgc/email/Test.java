package com.kgc.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Test {
	/**
	 * 
	 * @param emailAddress	收件人地址
	 * @return true发送成功	false发送失败
	 * @throws Exception
	 */
	public static boolean sendEmail(String emailAddress) throws Exception {
		Properties props = new Properties();
		//163邮箱的协议是：smtp.163.com //smtp.exmail.qq.com
		props.setProperty("mail.host", "smtp.163.com");// 设置邮件服务器地址
		props.setProperty("mail.smtp.auth", "true"); // 设置邮件服务器是否需要登录认证
		Authenticator auth = new Authenticator() { // 创建认证器
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("liu1367423614@163.com",
						"YFDIPPUIUDECYHEC"); // 用户名和授权码密码
			}
		};
		Session session = Session.getInstance(props, auth); // 获取Session对象

		/*** 2.创建邮件对象MimeMessage ***/
		MimeMessage msg = new MimeMessage(session); // 创建邮件对象
		msg.setFrom(new InternetAddress("liu1367423614@163.com")); // 设置发件人
		msg.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress(
				emailAddress)); // 设置收件人
		msg.addRecipient(MimeMessage.RecipientType.CC, new InternetAddress(
				emailAddress)); // 设置收件人（抄送）
		msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(
				emailAddress));// 设置收件人（暗送）
		msg.setSubject("当然是在想你啊 超级想你");// 设置发送的邮件的标题
		//String sendcontent="<a href>dianjie</a>"
		msg.setContent("想你想你想你", "text/html; charset=gb2312");
		Transport.send(msg);
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		//收件人的邮箱账号
		boolean bo=sendEmail("1367423614@qq.com");
		System.out.println(bo);		
	}
	
	public boolean senEmail(String address) throws Exception {
		//收件人的邮箱账号
				boolean bo=sendEmail(address);
				return bo;	
	}
}
