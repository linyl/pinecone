package com.unisw.pinecone.repository;

import org.springframework.data.repository.CrudRepository;

import com.unisw.pinecone.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>
{
}
