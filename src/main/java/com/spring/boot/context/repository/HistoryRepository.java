package com.spring.boot.context.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.context.domain.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long>{

}
