package com.vendas.projetovendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendas.projetovendas.entities.Sale;
import com.vendas.projetovendas.repositories.SalesRepository;

@Service
public class SaleService {

	@Autowired
	private SalesRepository repository;
	
	public List<Sale> findSales() {
		
		return repository.findAll();
		
	}
}
