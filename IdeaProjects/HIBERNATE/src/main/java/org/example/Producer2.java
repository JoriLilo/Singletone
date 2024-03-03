package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Producers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producer2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProducerId",nullable = false)
    private int id=1;
    @Column(name = "ProducerName",nullable = false)
    private String producerName;
    @Column(name = "Adress",nullable = false)
    private String adress;
    @Column(name = "Email",nullable = false)
    private String email;
    @OneToOne(mappedBy = "producer2")
    private Product product;

}
