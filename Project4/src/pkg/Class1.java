package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
  public static void main(String[] args) 
  {
	System.out.println("first line");
	
	try
	{
		System.out.println("inside try 1");
       	int a=5/0;
	System.out.println("inside try 2");
	}
	catch(Exception e)
	{
		System.out.println("exception handled");
	}
	finally {
		
		System.out.println("final block");
	}
	
	
	
	
	System.out.println("second line");
  }
	
}
