package com.trulia.test;

import com.trulia.util.PageDriver;
import org.testng.annotations.Test;

import com.trulia.base.BaseTest;
import com.trulia.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;
public class LoginTest extends BaseTest {

	private LoginPage _hp;
	@Test(priority = 1, alwaysRun = true)
	public void testTestExists() throws IOException {
		d.takeScreenShot();
		assertEquals(true, _hp.TruliaText());
		// d.takeScreenShot();
	}

	@Test
	public void LoginTest()
	{
		
	String Expected = "Kssavitha";
//	
		
	//	assertEquals(l, Expected);
		
		
		}	
		
		}
