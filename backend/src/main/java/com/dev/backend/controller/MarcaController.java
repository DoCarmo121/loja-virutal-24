package com.dev.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.dev.backend.entity.Marca;
import com.dev.backend.service.MarcaService;

import jakarta.websocket.server.PathParam;;

@RestController
//Anotacao para indicar que a classe é um controle com os padroes REST
@RequestMapping("/api/marca")
//informar o path
public class MarcaController {
    
    @Autowired
    //injecao de dependencias para nao ter que instanciar a classe
    private MarcaService marcaService;

    @GetMapping("/")
    //informar o path da requisicao do tipo get
    private List<Marca> buscarTodos(){
        return marcaService.buscarTodos();
    }

    @PostMapping("/")
    //informar o path da requisicao do tipo post
    private Marca inserir(@RequestBody Marca marca){
        return marcaService.inserir(marca);
    }

    @PutMapping("/")
    //informar o path da requisicao do tipo put - atualiza
    private Marca alterar(@RequestBody Marca marca){
        return marcaService.alterar(marca);
    }

    @DeleteMapping("/{id}")
    //informar o path da requisicao do tipo delete que tbm deve receber o id
    private ResponseEntity<Void> excluir(@PathParam("id") Long id){
        marcaService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
