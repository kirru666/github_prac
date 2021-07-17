package com.hrms.libs;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	
//Test Data
	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	public String un = "admin";
	public String pw = "admin";
	//public String ad = "";
	public String fn= "Janabai";
	public String ln= "Malge";
	public String en="0002";
	
//objects
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	//public String btn_add ="rightMenu";
	public String link_pim= "PIM";
	public String link_add="Add Employee";
		public String txt_lastname="txtEmpLastName";
		public String txt_firstname="txtEmpFirstName";
		public String btn_save ="btnEdit";
			public String txt_search="loc_name";
			
		public String link_logout = "Logout";
		//public String txt_add="plainbtn";
	
}
