package com.vendas.projetovendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.projetovendas.entities.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long>{

	
	
}
