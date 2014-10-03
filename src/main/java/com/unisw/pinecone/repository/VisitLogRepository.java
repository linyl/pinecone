package com.unisw.pinecone.repository;

import org.springframework.data.repository.CrudRepository;

import com.unisw.pinecone.entity.VisitLog;

public interface VisitLogRepository extends CrudRepository<VisitLog, Long>
{
}
