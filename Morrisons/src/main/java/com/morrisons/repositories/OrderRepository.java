package com.morrisons.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.morrisons.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {
	
}
