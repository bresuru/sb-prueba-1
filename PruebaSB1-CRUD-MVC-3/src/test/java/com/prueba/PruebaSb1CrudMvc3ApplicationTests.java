package com.prueba;


import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba.services.ICelularService;

@SpringBootTest
class PruebaSb1CrudMvc3ApplicationTests {

	@Autowired
	private ICelularService i_cell_service;

	
	@Test
	void prueba1() {
		
		String men = i_cell_service.deleteCelular(2);
		
		System.out.println(men);
		
	}

}
