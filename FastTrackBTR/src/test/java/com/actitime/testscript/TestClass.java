package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class TestClass extends BaseClass{
	//@Listners(Listnersclass.class)
	@Test
	public void testCreateNewTask() {
		Reporter.log("Create new Task", true);
	}

}
