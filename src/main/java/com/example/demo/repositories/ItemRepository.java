package com.example.demo.repositories;
import com.example.demo.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ItemRepository extends JpaRepository<Item, String> {
}
