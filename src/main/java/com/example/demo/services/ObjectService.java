package com.example.demo.services;

import com.example.demo.entity.ObjectsData;
import com.example.demo.repository.ObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectService {
    @Autowired
    private ObjectRepository repo;

    public List<ObjectsData> getList(){
        return repo.findAll();
    }

    public void saveObject (ObjectsData object){
        repo.save(object);
    }

    public ObjectsData get (int id){
        return repo.findById(id).get();
    }

}
