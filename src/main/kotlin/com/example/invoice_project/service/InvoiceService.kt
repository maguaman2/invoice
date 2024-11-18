package com.example.invoice_project.service

import com.example.invoice_project.entity.Invoice
import com.example.invoice_project.repository.InvoiceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InvoiceService {

    @Autowired
    lateinit var invoiceRepository: InvoiceRepository

    fun findAll(): List<Invoice> {
        return invoiceRepository.findAll()
    }

    fun findById(id: Long?): Invoice? {
        return invoiceRepository.findById(id)
    }

    fun save(invoice: Invoice): Invoice {
        return invoiceRepository.save(invoice)
    }

}