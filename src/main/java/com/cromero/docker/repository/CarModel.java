package com.cromero.docker.repository;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "todo")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;

    private Integer seatingCapacity;


}
