package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebElement;


import TestBase.Base;

public class Admin extends Base {
	public static WebElement Branches_btn(){
		return driver.findElement(getElement("Branches"));
		}
		public static void Roles_btn(){
		driver.findElement(getElement("Roles"));
		}
		public static void Users_btn(){
		driver.findElement(getElement("Users"));
		}
		public static void Employee_btn(){
		driver.findElement(getElement("Employee"));

}
}