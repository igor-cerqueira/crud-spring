package com.igor.crudspring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
// @Table(name = "nomeTabela") caso ja haja uma tabela no banco de dados
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 200, nullable = false)
    // @Column(name = "nome") caso tivesse na tabela tivesse nome diferente da prorpiedade era só fazer isso para linkar
    private String name;

    @Column(length = 10, nullable = false)
    private String category;    
    
}
