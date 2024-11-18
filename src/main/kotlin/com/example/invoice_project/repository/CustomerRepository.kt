package com.example.invoice_project.repository

import com.example.invoice_project.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository:JpaRepository<Customer, Long>{
    fun findById(id: Long?): Customer?
}