package com.example.demos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demos.entity.Dailyintake;

public interface DailyIntakeRepository extends JpaRepository<Dailyintake,Long> {
}
