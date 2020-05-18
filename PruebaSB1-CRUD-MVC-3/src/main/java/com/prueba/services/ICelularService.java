package com.prueba.services;

import java.util.List;
import java.util.Optional;

import com.prueba.entity.Celular;

public interface ICelularService {

	String saveCell(Celular cell);
	
	List<Celular> findAllCelulars();
	
	Optional<Celular> findByCelular(int id_celular);
	
	String deleteCelular(int id_cell);
	
}
