package com.morrisons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.morrisons.model.Order;
import com.morrisons.repositories.OrderRepository;

@RestController
@RequestMapping("/")
public class OrderController {
	
	@Autowired
	private OrderRepository rep;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOrderById(@PathVariable("id") String id){
		try {
			Order or = rep.findById(id).get();
			return ResponseEntity.ok(or);
		}catch(Exception e) {
			return ResponseEntity.status(404).body(null);
		}
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addOrder(@RequestBody Order order){
//		try {
			rep.save(order);
//		}catch(Exception e) {
//			return ResponseEntity.status(500).body(null);
//		}
		return ResponseEntity.ok(order);
	}
	
}
