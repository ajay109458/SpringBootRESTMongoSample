package com.example.demo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Pets;

public interface PetsRepository extends MongoRepository<Pets, String>{
	Pets findBy_id(ObjectId _id);
}
