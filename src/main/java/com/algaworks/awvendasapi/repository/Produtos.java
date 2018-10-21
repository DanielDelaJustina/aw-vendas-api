package com.algaworks.awvendasapi.repository;

import com.algaworks.awvendasapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Long> {


}
