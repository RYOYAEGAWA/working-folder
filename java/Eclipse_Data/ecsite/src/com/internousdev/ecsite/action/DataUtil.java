package com.internousdev.ecsite.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class DataUtil {

	public String getData(){
		Date date = new Date();
		SimpleDateFormat simpleDataFormat = new SimpleDateFormat("yyyy/MM/ddHH:mm:ss");

			return simpleDateFormat.format(date);
		}

	}

public String getLoginPassword() {
	return loginPassword;
}

public void setLoginPassword(String loginPassword) {
	this.loginPassword = loginPassword;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

@Override
public void setSession (Map<String, Object> session) {
	this.session = session;
}
