package com.example.invoice_project.repository

import com.example.invoice_project.entity.Invoice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InvoiceRepository:JpaRepository<Invoice, Long>{
    fun findById(id: Long?): Invoice?
    fun findByCustomerId(customerId: Long?): List<Invoice>?
}