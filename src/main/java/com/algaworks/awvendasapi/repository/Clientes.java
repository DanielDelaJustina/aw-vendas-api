package com.algaworks.awvendasapi.repository;

import com.algaworks.awvendasapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
