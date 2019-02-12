package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewBranch extends Base {
	public static WebElement branchname_editbox(){
		return driver.findElement(getElement("Branch"));
		}
		public static WebElement adress1_editbox(){
		return driver.findElement(getElement("NewBranch_Address1"));
		}
		public static WebElement address2_editbox(){
		return driver.findElement(getElement("NewBranch_Address2"));
		}
		public static WebElement address3_editbox(){
		return driver.findElement(getElement("NewBranch_Address3"));
		}
		public static WebElement area_editbox(){
		return driver.findElement(getElement("NewBranch_Area"));
		}
		public static WebElement zipcode_editbox(){
		return driver.findElement(getElement("NewBranch_Zipcode"));
		}
		public static WebElement country_drop(){
		return driver.findElement(getElement("NewBranch_country"));
		}
		public static WebElement state_drop(){
		return driver.findElement(getElement("NewBranch_state"));
		}
		public static WebElement city_drop(){
		return driver.findElement(getElement( "NewBranch_city"));
		}
		public static WebElement submit_btn(){
		return driver.findElement(getElement("NewBranch_submit"));
		}
	


}
