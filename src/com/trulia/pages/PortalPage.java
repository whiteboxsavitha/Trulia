package com.trulia.pages;

import com.trulia.base.BasePage;
import com.trulia.util.PageDriver;

import java.util.Set;


public abstract class PortalPage extends BasePage {

    public PortalPage(PageDriver d) {
        super(d);
    }


    public String getTitle() {
        return d.getTitle();
    }

    public boolean isLogoPresent() {
        return d.findElements("header.logo").size() > 0;
    }

    
    public boolean topNavPresent()
    {
        return d.findElements("header.topnavglobe").size() > 0;
    }
    
    public boolean bottomcopyrightPresent()
    {
    	return d.findElements("footer.copyright").size() > 0;
        	
    }
   

    public boolean bottomcontentPresent()
    {
    	return d.findElements("footer.content").size() > 0;
        	
    }
  public boolean bottomnavPresent()
    {
    	return d.findElements("footer.nav").size() > 0;
        	
    }
  //public boolean 
    /*
    
    public boolean areSocialIconsPresent() {
        return d.findElements("header.social").size() > 0;
    }

    public int getSocialIconsCount() {
        return d.findElements("header.social").size();
    }

    public Set<String> getSocialLinks() {
        return d.getLinks("header.social.links");
    }

*/
}
