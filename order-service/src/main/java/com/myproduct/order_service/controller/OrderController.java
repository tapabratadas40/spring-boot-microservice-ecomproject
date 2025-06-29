package com.myproduct.order_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class OrderController {
    @GetMapping("/products")
    public ResponseEntity<List<String>> getAllProducts(){

        return new ResponseEntity<>(Arrays.asList("Akash"), HttpStatus.OK);

    }
}
