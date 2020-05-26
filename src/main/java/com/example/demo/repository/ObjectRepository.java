package com.example.demo.repository;

import java.util.List;


import com.example.demo.entity.ObjectsData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;


@Repository
//@Table(name = "object_data")
public interface ObjectRepository extends JpaRepository<ObjectsData, Integer> {


//    List<ObjectsData> findAll ();
//
//    ObjectsData get (int id);



}
