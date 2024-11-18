package com.example.invoice_project.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "invoice")
class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    @Column (nullable = false)
    var code: String? = null
    @Column (nullable = false)
    var invoiceDate: LocalDate? = null
    @Column (nullable = false, columnDefinition = "Decimal(5,2)")
    var totalAmount: Double? = null
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    var customer: Customer? = null

}