package com.trulia.test;

import com.trulia.base.BaseTest;
import com.trulia.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BuyTest extends BaseTest {

  private HomePage _hp;

  @BeforeClass
  public void beforeClass() {
    _hp = new HomePage(d);
  }



}




