package com.trulia.base;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.trulia.util.PageDriver;
//import com.wbl.utils.ExcelUtils;
import com.trulia.util.WBy;
import com.trulia.util.TruliaUtils;

public abstract class BasePage {

    public Logger _logger;
    public PageDriver d;

    public BasePage(PageDriver d) {
        _logger = Logger.getLogger(BasePage.class);
        this.d = d;
    }
    }
