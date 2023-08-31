package com.example.demos.Repository;

import com.example.demos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface userrepository extends JpaRepository<User, Long> {
}
