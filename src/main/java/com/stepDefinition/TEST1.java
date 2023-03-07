package com.stepDefinition;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.codehaus.plexus.util.IOUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.UserDataHandler;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.it.Data;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseLogSpec;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TEST1 {
	
	ThreadLocal<String > repost = new InheritableThreadLocal<String>();
			
    @Given("^I want to write a step with (.+)$")
    public void i_want_to_write_a_step_with(String url) throws Throwable {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\kedar\\eclipse-workspace\\CucumberSample\\chromedriver.exe");
		 * 
		 * WebDriver driver= new ChromeDriver();
		 * 
		 * driver.get(url); driver.manage().window().maximize(); Thread.sleep(10000);
		 * 
		 * driver.close();
		 */
    	
		/*
		 * RestAssured.baseURI =url; RequestSpecification req= RestAssured.given();
		 * Response response = req.get();
		 * 
		 * System.out.println("api Response is "+response);
		 * System.out.println("API STatus code"+response.statusCode());
		 */
    	
    	
    	RestAssured.baseURI="https://reqres.in/api/users";
    	File fl= new File("./Json/Test.json");
    	
    	System.out.println(fl);
    	
    	//System.out.println(repost.get())   
    	
    	//String st = new String(repost.get());
    	
     Response res = RestAssured.given().
    		 header("Content-Type", "application/json").
    		 //contentType(ContentType.JSON).
    		 when().body(fl).post();
 					//Response tes = res.post();
     String abc = res.asString();
    
    	System.out.println(res.getStatusCode());
    	System.out.println(res.asString());
    	
    	System.out.println("ABCDDD");
    	
    	JsonPath ob= new JsonPath(abc);
    	
    
    
    	
    	String ab = ob.get("job");
    	System.out.println("JSon IDDDD"+"::::::::::: "+ab);
    	System.out.println(ab);
    	

    //for (int i = 0; i < ob.getInt(Data.); i++) {
    	//ABCD EFG
		
	//}
    	

    }
}
