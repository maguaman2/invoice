package com.example.invoice_project.controller

import com.example.invoice_project.entity.Customer
import com.example.invoice_project.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/customers")
class CustomerController {

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping
    fun findAll(): List<Customer>{
        return customerService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Customer?{
        return customerService.findById(id)
    }

    @PostMapping
    fun save(@RequestBody customer: Customer): Customer {
        return customerService.save(customer)
    }



}