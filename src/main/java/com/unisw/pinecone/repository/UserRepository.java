package com.unisw.pinecone.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.unisw.pinecone.entity.User;

public interface UserRepository extends CrudRepository<User, Long>
{
    List<User> findByNumber(String number);
}
