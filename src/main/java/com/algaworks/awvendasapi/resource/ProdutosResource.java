package com.algaworks.awvendasapi.resource;

import com.algaworks.awvendasapi.model.Produto;
import com.algaworks.awvendasapi.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

    @Autowired
    Produtos produtos;

    @GetMapping
    public List<Produto> listar(){

        return produtos.findAll();
    }
}
