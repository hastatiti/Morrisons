package com.morrisons.controller;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.net.URI;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.client.RestTemplate;

import com.morrisons.model.Order;
import com.morrisons.repositories.OrderRepository;



@RunWith(SpringRunner.class)
@WebMvcTest(OrderController.class)
public class OrderControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private OrderRepository orderRepository;
	
	public static final String REST_SERVICE_URI = "http://localhost:8080";
	
	
	@Test
	public void shouldReturnOrder() {
		System.out.println("Testing getOrder API----------");
		RestTemplate restTemplate = new RestTemplate();
		Order order = restTemplate.getForObject(REST_SERVICE_URI + "/ORD00001", Order.class);
		System.out.println(order);
	}
	
	@Test
	  public void ShouldCreateOrder() {
	        System.out.println("Testing create Order API----------");
	        RestTemplate restTemplate = new RestTemplate();
	        Order order = new Order("ORD00001", "ABCD", "EDI238473828384", "MORR", null, "GLN999999", "Test Store", "1 Order Street", "", "Leeds", "West Yorkshire", "LS1 9PP", "UK", null, null, null);
	        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/add", order, Order.class);
	    }
	  
	
	@Test
    public void shouldPresistOrder() throws Exception {
		
		 Order o = new Order("ORD00001", "ABCD", "EDI238473828384", "MORR", null, "GLN999999", "Test Store", "1 Order Street", "", "Leeds", "West Yorkshire", "LS1 9PP", "UK", null, null, null);
		 Optional<Order> order = Optional.of(o);
		 when(orderRepository.findById("/ORD00001")).thenReturn(order);
		 
		 this.mockMvc.perform(get("/ORD00001").accept("application/json"))
		 .andExpect(jsonPath("id").exists());
		 
	}
}
