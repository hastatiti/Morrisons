package com.morrisons.model;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;

import org.junit.Test;

import com.morrisons.model.Order;

public class OrderTest {
	 
	@Test
	 public void shouldBeDifferent() {
		 Order classUnderTest1 = new Order("ORD00001", "ABCD", "EDI238473828384", "MORR", null, "GLN999999", "Test Store", "1 Order Street", "", "Leeds", "West Yorkshire", "LS1 9PP", "UK", null, null, null);
		 Order classUnderTest2 = new Order("ORD00002", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		 assertNotSame(classUnderTest1, classUnderTest2);
	 }
	 
	  @Test
	    public void idShoulBeCreated() {
		  Order classUnderTest = new Order("ORD00001", "ABCD", "EDI238473828384", "MORR", null, "GLN999999", "Test Store", "1 Order Street", "", "Leeds", "West Yorkshire", "LS1 9PP", "UK", null, null, null);

	        assertNotNull(classUnderTest.getOrderId());
	        assertNotNull(classUnderTest.getMessageType());
	    }
}
