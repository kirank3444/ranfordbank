package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import TestBase.Base;

public class Repository extends Base{
	
	
	public void launch() {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get(getConfig("build1"));
		}

		public void login(String username,String password){

		Loginpage.username_editbox().sendKeys(username);
		Loginpage.password_editbox().sendKeys(password);
		
		Loginpage.login_btn().click();
		driver.findElement(By.xpath("")); 
		}

		public void Branch(){
		Admin.Branches_btn().click();
		}

		public void BranchesField(){
		Branches.country_drop().sendKeys(getConfig("Branches_country"));
		Branches.state_drop().sendKeys(getConfig("Branches_state"));
		Branches.city_drop().sendKeys(getConfig("Branches_city"));
		Branches.Search_btn().click();
		}
		public void NewBranch(){
		Branches.Newbranch_btn().click();
		}

		public void NewBranchField(){
		NewBranch.branchname_editbox().sendKeys(getConfig("Branch_Name"));
		NewBranch.adress1_editbox().sendKeys(getConfig("Address1"));
		NewBranch.address2_editbox().sendKeys(getConfig("Address2"));
		NewBranch.address3_editbox().sendKeys(getConfig("Address3"));
		NewBranch.area_editbox().sendKeys(getConfig("Area"));
		NewBranch.zipcode_editbox().sendKeys(getConfig("Zipcode"));
		NewBranch.country_drop().sendKeys(getConfig("country"));
		NewBranch.state_drop().sendKeys(getConfig("state"));
		NewBranch.city_drop().sendKeys(getConfig("city"));
		NewBranch.submit_btn().click();

}
}
