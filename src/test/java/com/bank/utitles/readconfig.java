package com.bank.utitles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readconfig {
	Properties pro;
	
	public readconfig() {
		File scr = new File("F:\\Testing\\Part1\\configuration\\config.properties");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(scr);
			pro = new Properties();
			pro.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getApplicationUrl() {
		String url = pro.getProperty("baseURL");
		return url;
		
	}
	public String getusername() {
		String username = pro.getProperty("username");
		return username;
		
	}
	
	public String getpassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	
	
	public String getchromepath() {
		String cpath = pro.getProperty("chromepath");
		return cpath;
		
	}
	

}
