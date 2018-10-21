package com.algaworks.awvendasapi.Service;

import com.algaworks.awvendasapi.model.Venda;
import com.algaworks.awvendasapi.repository.Produtos;
import com.algaworks.awvendasapi.repository.Vendas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class VendaService {

    @Autowired
    private Vendas vendas;

    @Autowired
    private Produtos produtos;

    public Venda adicionar(Venda venda){

        venda.setCadastro(LocalDateTime.now());
        venda.getItens().forEach(item ->
                {
                    item.setVenda(venda);
                    item.setProduto(produtos.findById(item.getProduto().getId()).get());
                }
        );

        //Obtem o valor total dos itens
        BigDecimal totalItens = venda.getItens().stream()
                .map(item -> item.getProduto().getValor().multiply(new BigDecimal(item.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        venda.setTotal(totalItens.add(venda.getFrete()));

        return vendas.save(venda);
    }
}
