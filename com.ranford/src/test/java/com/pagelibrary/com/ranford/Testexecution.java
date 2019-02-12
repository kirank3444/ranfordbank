package com.pagelibrary.com.ranford;

import org.testng.annotations.Test;

import Excel.Excelclass;

public class Testexecution extends Repository {

	@Test(priority=0)
	public void verify_launch(){
	launch();


	}
	@Test(priority=1)
	public void verify_login(){
		Excelclass.excelconnection("data.xls","Sheet1");
		for(int r=1;r<Excelclass.rowcount();r++)
		{
			String username=Excelclass.readdata(0, r);
			String password=Excelclass.readdata(1, r);
			login(username,password);
		}
	
	}


	@Test(priority=2)
	    public void verify_Branches(){
	   	Branch();
	    }

	@Test(priority=3)
	public void verify_BranchesField(){
	BranchesField();
	}

	@Test(priority=4)
	public void verify_NewBranch(){
	NewBranch();

	}

	@Test(priority=5)
	public void verify_NewBranchField(){
	NewBranchField();
	}
	


}
