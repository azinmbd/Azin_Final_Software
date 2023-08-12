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

@Controller
@RequestMapping("/")
public class SalesController {


    private final SalesRepository salesRepository;

    @Autowired
    public SalesController(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("sales", new Sales());
        return "sales-form";
    }

    @PostMapping("/add")
    public String addSales(@ModelAttribute("sales") Sales sales) {
        if (sales.getQty() == 0) {
            return "redirect:/sales/add?error=quantity";
        }
        salesRepository.save(sales);
        return "redirect:/sales/add";
    }
}