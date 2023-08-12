package com.example.demo.controller;

import com.example.demo.entities.Sales;
import com.example.demo.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller // Add this annotation to indicate that this is a controller component
@RequestMapping("/sales")
public class SalesController {

    private final SalesRepository salesRepository;

    @Autowired
    public SalesController(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @GetMapping("/list")
    public String listSales(Model model) {
        List<Sales> salesList = salesRepository.findAll();
        model.addAttribute("salesList", salesList);
        return "sales/list"; // Assuming you have a Thymeleaf template named "list.html" in a "sales" folder
    }

    @PostMapping("/add")
    public String addSales(@ModelAttribute("sales") Sales sales) {
        if (sales.getQty() == 0) {
            // Show an alert if the quantity is 0 and stay on the same page
            return "redirect:/?error=quantity";
        }
        salesRepository.save(sales);
        return "redirect:/sales/list";
    }


}