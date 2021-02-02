package com.beanthere.coffees.repositories;

import com.beanthere.coffees.models.Coffee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

}
