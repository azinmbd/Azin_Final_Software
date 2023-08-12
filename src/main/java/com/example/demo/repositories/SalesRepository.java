package com.example.demo.repositories;


import com.example.demo.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Add this annotation to indicate that this is a repository component
public interface SalesRepository extends JpaRepository<Sales, Long> {
}