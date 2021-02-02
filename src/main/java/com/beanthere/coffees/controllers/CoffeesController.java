package com.beanthere.coffees.controllers;

import java.util.List;

import com.beanthere.coffees.models.Coffee;
import com.beanthere.coffees.repositories.CoffeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coffees")
public class CoffeesController {
  @Autowired
  private CoffeeRepository coffeeRepository;

  @GetMapping
  public List<Coffee> getCoffees() {
    return coffeeRepository.findAll();
  }

  @GetMapping("/{id}")
  public Coffee getCoffeeById(@PathVariable("id") long id) {
    return coffeeRepository.getOne(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void createCoffee(@RequestBody Coffee coffee) {
    coffeeRepository.save(coffee);
  }
}