package TestBase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver driver;  

	static Properties property;
	public static void loadproperty() {
	try {
	File f=new File(".\\src\\main\\java\\Configuration\\OR.properties");
	FileReader fr=new FileReader(f);
	property =new Properties();
	property.load(fr);
	} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block    
	e.printStackTrace();
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	}
	public static By getElement(String Key){
	loadproperty();
	By loc = null;
	String Value=property.getProperty(Key);
	String loctype=Value.split(":")[0];
	String locval=Value.split(":")[1];
	if(loctype.equals("id")){
	loc=By.id(locval);
	}
	else if(loctype.equals("xpath")){
	loc=By.xpath(locval);
	}
	else if(loctype.equals("className")){
	loc=By.className(locval);
	}
	else if(loctype.equals("cssSelector")){
	loc=By.cssSelector(locval);
	}
	else if(loctype.equals("linkText")){
	loc=By.linkText(locval);
	}
	else if(loctype.equals("name")){
	loc=By.name(locval);
	}
	else if(loctype.equals("partialLinkText")){
	loc=By.partialLinkText(locval);
	}
	else if(loctype.equals("tagName")){
	loc=By.tagName(locval);
	}
	return loc;



	}

	public static void loadpropertyConfig(){

	    try {
	File f=new File(".\\src\\main\\java\\Configuration\\conig.properties");
	FileReader fr=new FileReader(f);
	property =new Properties();
	property.load(fr);
	} catch (Exception e) {
	// TODO Auto-generated catch block \src\main\java\Configuaration\Config.properties
	e.printStackTrace();
	}
	}

	    public static String getConfig(String Key){
	    
	    loadpropertyConfig();
	   	String k =property.getProperty(Key);
	return k;
	   	

			
		     	
		}
	}





