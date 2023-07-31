package com.example.demo.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {

	   @Column(name="id")
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int id;
	   
	   @Column(name="name")
	   private String name;
	   
	   @Column(name="unitPrice")
	   private double unitPrice;
	   
	   @Column(name="unitsInStock")
	   private int  unitsInStock;
	   
	   @ManyToOne(cascade=CascadeType.ALL)
	   @JoinColumn(name="category_id")
	   private Category category;         
}
