package com.algaworks.awvendasapi.resource;

import com.algaworks.awvendasapi.Service.VendaService;
import com.algaworks.awvendasapi.model.Venda;
import com.algaworks.awvendasapi.repository.Vendas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendasResource {

    @Autowired
    Vendas vendas;

    @Autowired
    VendaService vendaService;

    @GetMapping
    public List<Venda> listar(){

        return vendas.findAll();
    }

    @PostMapping
    public Venda adicionar(@RequestBody @Valid Venda venda){
        return vendaService.adicionar(venda);
    }
}
