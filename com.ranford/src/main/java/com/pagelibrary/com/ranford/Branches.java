package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Branches extends Base {

		public static WebElement country_drop(){
		return driver.findElement(getElement("Branches_country"));
		}

		public static WebElement state_drop(){
		return driver.findElement(getElement("Branches_state"));
		}
		public static WebElement city_drop(){
		return driver.findElement(getElement("Branches_city"));

		}
		public static WebElement Search_btn(){
		return driver.findElement(getElement("Branches_Search"));
		}

		public static WebElement Newbranch_btn(){
		return driver.findElement(getElement("Newbranch"));
		}

}
