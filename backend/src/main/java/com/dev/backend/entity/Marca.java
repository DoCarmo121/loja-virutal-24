package com.dev.backend.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
//cria uma tabela no banco de dados;
@Table(name="marca")
//da o nome da tabela;
@Data
//importa o lombok, criando os getters e setters em runtime;
public class Marca {
    @Id
    //informa que a variavel é a primary key da tabela;
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Valor gerado automaticamente
    private Long id;

    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    //setar data (TIMESTAMP MES E HORA)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
}
