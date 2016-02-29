package com.trulia.base;

import com.trulia.util.*;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.trulia.base.BaseTest;
import com.trulia.base.BasePage;

public abstract class BaseTest {

    public static final Configuration _config;

    static {
        _config = new Configuration();
    }


      public Logger _logger;

    public BaseTest() {
        _logger = Logger.getLogger(BaseTest.class);

    }
    public PageDriver d;
    public ExcelUtils excelUtils;
    public TruliaUtils TruliaUtils;

    @BeforeSuite
    public void beforeSuite() {
        d = new PageDriver(_config);
        WBy.loadJsonMap(String.format("%s/locators.json", System.getProperty("user.dir")));
     //   excelUtils = new ExcelUtils();
    }

    @AfterSuite
    public void afterSuite() {

        d.quit();
    }
}
