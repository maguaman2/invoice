package com.example.invoice_project.controller

import com.example.invoice_project.entity.Invoice
import com.example.invoice_project.service.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/invoices")
class InvoiceController {

    @Autowired
    lateinit var invoiceService: InvoiceService

    @GetMapping
    fun findAll(): List<Invoice>{
        return invoiceService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Invoice?{
        return invoiceService.findById(id)
    }

    @PostMapping
    fun save(@RequestBody invoice: Invoice): Invoice {
        return invoiceService.save(invoice)
    }

}