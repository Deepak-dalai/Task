package com.example.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.model.Images;



public interface uploadRepository extends JpaRepository<Images, Integer> {

}
