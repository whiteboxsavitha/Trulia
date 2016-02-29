package com.trulia.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.trulia.base.BasePage;
import com.trulia.util.PageDriver;
import com.trulia.util.WBy;

import static org.testng.Assert.assertEquals;
public class LoginPage extends HomePage{
	
/*
	 "sign.in":".txl2.globalUserCardLink.globalUserCardSigninLink.txtC.mrl.mtm.btn.btnDefault.pvn.phs",
	 "email.register":".fieldItem.text.pbm>input",
	 "submit.register":"//*[@id='loginModalNew']/div/div[2]/form/div/div[2]/div[2]/button",
	 "password.register":"//*[@id='loginModalNew']/div/div[2]/form/div/div[2]/div[1]/div/input",
	 "signin.register":"//button[text()='Sign In']",
	 "signin.warning":".typeWarning",
	 "signedin.Menuexists":"//div[@data-role='global_user_card_menu']",
	 
*/	 
	public LoginPage(PageDriver d) {
		super(d);
		
	}
	public void Login() throws Exception
	{
		d.findElement("sign.in").click();
		d.implicitWait(200);
		/*
		d.findElement("")
	//d.findElement(WBy.get("sign.in")).click();
//	d.findElement(WBy.get("sign.in")	
		
	//d.manage().window().maximize();
	
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//d.get("http://www.trulia.com");
	d.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//	d.findElement(By.cssSelector(".txl2.globalUserCardLink.globalUserCardSigninLink.txtC.mrl.mtm.btn.btnDefault.pvn.phs")).click();
	//Alert a = d.switchTo().alert();

	//a.sendKeys("kssavitha@yahoo.com");
	
String winchild=d.getWindowHandle();
d.switchTo().window(winchild);
d.findElement(By.cssSelector(".fieldItem.text.pbm>input")).sendKeys("kssavitha@yahoo.com");
d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
d.findElement(By.xpath("//*[@id='loginModalNew']/div/div[2]/form/div/div[2]/div[2]/button")).click();
d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
d.findElement(By.xpath("//*[@id='loginModalNew']/div/div[2]/form/div/div[2]/div[1]/div/input")).sendKeys("thashini");
d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
String s1 = d.getWindowHandle();
d.findElement(By.xpath("//button[text()='Sign In']")).click();
d.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//String s = d.getWindowHandle();
Actions actions = new Actions(d);
WebElement menuHoverLink = d.findElement(By.xpath("//div[@data-role='global_user_card_menu']"));
actions.moveToElement(menuHoverLink);
String loggedin = d.findElement(By.xpath("//div[text()='Kssavitha']")).getText();
String is = d.findElement(By.xpath("//span[@data-action='/logout/']")).toString();
String s = d.findElement(By.xpath("//div[@data-role='global_user_card_menu']")).toString();
System.out.println(loggedin);

//System.out.println(s.equals(s1));
//WebElement subLink = d.findElement(By.xpath("//div[@ data-role='global_user_card_menu']"));

WebElement w = d.findElement(By.xpath("//span[@data-action='/logout/']"));

//System.out.println(menuHoverLink);
//System.out.println(w);
//actions.moveToElement(w);
//actions.click();
//actions.perform();
d.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//String loggedin = d.findElement(By.xpath("//div[text()='Kssavitha']")).getText();

//boolean b = d.findElement(By.xpath("//span[@data-action='/logout/']")).isDisplayed();



//System.out.println(b);
d.close();
return loggedin;
	}
  
	

	public static void main(String[] args) {
	WebDriver d = new FirefoxDriver();
	//String l=Login1.LoginCheck();
		
	}
	
	

*/		}
	}
