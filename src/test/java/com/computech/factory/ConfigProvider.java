//package com.computech.factory;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
//public class ConfigProvider {
//	
//	protected Properties pro;
//
//	public ConfigProvider() {
//
//	pro=new Properties();
//
//	try {
//	pro.load(new FileInputStream(new File(System.getProperty("user.dir")+"/Config/config.properties")));
//	} catch (FileNotFoundException e) {
//
//	} catch (IOException e) {
//
//	}
//
//	}
//
//	public String getValue(String key) {
//
//	return pro.getProperty(key);
//	}
//
//
//	}
//
//}
