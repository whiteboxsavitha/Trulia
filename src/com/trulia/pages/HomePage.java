package com.trulia.pages;

import com.trulia.util.HtmlElement;
import com.trulia.util.PageDriver;
import com.trulia.util.WBy;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.Set;

/*
"header.socialL":"#socialStripeLeft",
"header.socialR": "#socialStripeRight",
"Search.container":".inputContainer",
"socialIcons":".//div[contains(@class , 'social-stripe')]",
"Text.Trulia":".//*[contains(text(),'Trulia. Your home for real estate.')]",
"search.option":".//div[@class='field man']",
"alert.email":".//*[@id='dotwhack']/img"
"discovery.container":".//div[contains(@id , 'discoveryGroup')]",
"media.container":"//div[@class='media mvn prxxl ptm']",
*/


public class HomePage extends PortalPage {

	public HomePage(PageDriver d) {
		super(d);
		_logger.debug("Open Home Page");

	}


	public boolean SearchContainer() {
		boolean status = false;
		try {
			status = d.findElement("Search.container").isDisplayed();
		} catch (Exception e) {
			_logger.error(e);

		}
		return status;
	}

	public String TruliaText() {
		String s = d.findElement("Text.Trulia").getText();
	//	System.out.print(s);
		return d.findElement("Text.Trulia").getText();
		//return true;
	}

	public boolean TruliaLogo() {
		if (d.findElement("header.logo").isDisplayed()) return true;
		else return false;
	}

	public boolean AlertEmail() {
		return d.findElement("alert.email").isDisplayed();
	}

	public int SocialIcons() {
		return d.findElements("socialIcons").size();
	}

	/*public boolean Searchoptions()
	{

	}

*/

	public int DiscoveryContainer() throws Exception {
		d.implicitWait(400);
		return d.findElements("discovery.container").size();
	}
}
