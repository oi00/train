package com.first.eclipse_maven_app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        new App().printMessage("Taro");
    }

    public String getMessage(String name) {
    	return "Hi," +  name + ", Welcome to Maven Wordld!";
    }

    public void printMessage(String name) {
    	System.out.println("/n****** App class ******/n");
    	System.out.println(this.getMessage(name));
    	System.out.println("/n****** App class ******/n");
    }
}
