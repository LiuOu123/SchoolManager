package com.kgc.email;

public class sendEmail {
public static void main(String[] args) {
	Email e=new Email();
	try {
		//登录或注册给用户发送验证码
		//e.fasong("1367423614@qq.com", "234234");
		//管理员回复用户提交的意见
		/*e.glyfasong("1367423614@qq.com", "管理员通知","给您带来的不便很抱歉，我们会在以后的版本里修复 感谢您的反馈");*/
		e.fasong("2789501979@qq.com","找回密码");
	} catch (Exception e2) {
		// TODO: handle exception
	}
	

}
}
