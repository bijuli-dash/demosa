package com.example.demos.Repository;

import com.example.demos.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface foodrepository extends JpaRepository<Food, Long> {
}
