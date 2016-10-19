package com.zygy.web.shrio;

import org.apache.shiro.authc.UsernamePasswordToken;

public class CustomUsernamePasswordToken extends UsernamePasswordToken {
	//用于存储用户输入的校验码  
    private String validCode;  
  
    public CustomUsernamePasswordToken(String username, char[] password,boolean rememberMe, String host, String validCode) {  
        //调用父类的构造函�?  
        super(username,password,rememberMe,host);  
        this.validCode=validCode;  
    }  
  
    public String getValidCode() {  
        return validCode;  
    }  
  
    public void setValidCode(String validCode) {  
        this.validCode = validCode;  
    }
}
