package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="categories")
public class Category {

	   @Column(name="id")
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int id;
	   
	   @Column(name="name")
	   private String name;
	  
	   
	   @OneToMany(mappedBy = "category",cascade = CascadeType.DETACH)
	   private List<Product> products;
}
