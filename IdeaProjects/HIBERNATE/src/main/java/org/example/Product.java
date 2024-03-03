package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductId")
    private int id;
    @Column(name = "Name",nullable = false)
    private String name;
    @Column(name = "Description",nullable = false)
    private String description;
    @Column(name = "Price",nullable = false)
    private double price;
    @OneToOne
    @JoinColumn(name = "ProducerId")
    private Producer2 producer2;
}
