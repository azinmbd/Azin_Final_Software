package com.example.demo.controller;

import com.example.demo.entities.Item;
import com.example.demo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public String showItems(Model model) {
        List<Item> items = itemService.getAllItems();
        model.addAttribute("items", items);
        return "items";
    }
}
