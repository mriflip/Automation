package com.planit.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Configuration {
	
	private static Logger logger = LoggerFactory.getLogger(Configuration.class);
	private Properties properties = new Properties();
	private String env;
	public static String firstName;
	public static String lastName;
	public static String postCode;
	public static String password;
	public static String email;
	
	 public Configuration() {
	        BasicConfigurator.configure();
	        if (System.getProperty("env") != null)
	            this.env = System.getProperty("env");
	        else

	            this.env = "stage";  //set default as stage
	        logger.info("Fetching the environmental details from :"+this.env);
	    }

	    public Configuration(String env) {
	        this.env = env;
	    }

	    public String getConfig(String property) {
	        String config = null;
	        logger.info("current directory is ::: " + System.getProperty("user.dir"));
	        try {
	            properties.load(new FileInputStream("src/main/java/com/planit/configuration/properties/env.properties"));
	            config = properties.getProperty(env);
	            properties.load(new FileInputStream(config));
	            firstName = properties.getProperty("firstName");
	            lastName = properties.getProperty("lastName");
	            postCode = properties.getProperty("postCode");
	            email = firstName+lastName+ String.valueOf(System.currentTimeMillis()) + "@gmail.com";
	            password = properties.getProperty("password");
	            
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return properties.getProperty(property);
	    }

}
