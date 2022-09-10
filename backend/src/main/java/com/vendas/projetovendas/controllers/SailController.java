package com.vendas.projetovendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.projetovendas.entities.Sale;
import com.vendas.projetovendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SailController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public List<Sale> findSales(){
	
		return service.findSales();
		
	}
	
}
