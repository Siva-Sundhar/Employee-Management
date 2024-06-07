package com.domss.PurchaseOrder.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "id")
    Long id;

    @Column(name = "product_code")
    String productCode;

    @Column(name = "stock_item_name")
    String stockItemName;

    @Column(name = "stock_group")
    String stockGroup;

    @Column(name = "stock_category")
    String stockCategory;

    @Column(name = "rate")
    Double rate;

    @Column(name = "discount")
    Double discount;
}
