package Ubertest;

import org.junit.After;


import org.junit.Before;
import org.junit.Test;

import Ubercode.Coding;

public class  Test1 {
	Coding uber = new Coding();
	


	@Before
	public void setUp() throws Exception {
		uber.launchBrowser();
		uber.openuber();
	}

	@After
	public void tearDown() throws Exception {
		uber.closeuber();
	}

	@Test
	public void test() throws InterruptedException {
       uber.Delivery();
       uber.Location();
        uber.change();
        uber.enterkey();
        
       
	}

}
