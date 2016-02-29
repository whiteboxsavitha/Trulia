package com.trulia.test;

import com.trulia.util.PageDriver;
import org.testng.annotations.Test;

import com.trulia.base.BaseTest;
import com.trulia.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;
public class HomeTest extends BaseTest {

  private HomePage _hp;

  @BeforeClass
  public void beforeClass() {

    _hp = new HomePage(d);
  }
  @Test(priority = 1, alwaysRun = true)
  public void TruliaTextTest(){
   // d.takeScreenShot();
String Text = "Trulia. Your home for real estate.";
    assertEquals(Text, _hp.TruliaText());
   // d.takeScreenShot();
  }

/*
  @Test(priority = 2)
  public void testSearchOptionsExist()
  {
    boolean Search;
    if (_hp.Searchoptions()) Search = true;
    else Search = false;
    assertTrue(Search);
  }
  @Test
  public void testAlertEmailExists() throws Exception {
    boolean actual= _hp.AlertEmail();
    assertEquals(actual, true);
  }
*/
  @Test
  public void SearchContainertest(){
    boolean actual = _hp.SearchContainer();
    assertEquals(actual, true);
  }
  @Test
  public void TruliaLogoDisplayedtest()
  {
    boolean actual = _hp.TruliaLogo();
    assertEquals(actual, true);
  }
  @Test
  public void DiscoveryContainerTest ()throws Exception
  {
    int actual =_hp.DiscoveryContainer();
    assertEquals(actual, 3);
  }
}




