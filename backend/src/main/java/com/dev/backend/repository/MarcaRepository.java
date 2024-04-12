package com.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backend.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca,Long>{
    //uma interface com as requisicoes já feitas e que extende o jparepository;
    //Faz a comunicacao com o banco de dados;
    //Precisa da classe e do tipo da primary key;
}
