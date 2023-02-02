package com.tyss.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyss.onetoone.entity.Bag;

@Repository
public interface BagRepository extends JpaRepository<Bag, Integer>{

}