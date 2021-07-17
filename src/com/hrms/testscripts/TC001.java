package com.hrms.testscripts;

import com.hrms.libs.General;

public class TC001 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 //coz of accessing the function from general
		General obj = new General();
		obj.openApp();
		obj.login();
	//	obj.addEmp();
		obj.delEmp();
		obj.logout();
		obj.closeApp();
		
	}

}
