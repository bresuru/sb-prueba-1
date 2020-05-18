package com.prueba.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.PruebaSb1CrudMvc3Application;
import com.prueba.entity.Celular;
import com.prueba.repository.ICelularRepo;

@Service
public class CelularService implements ICelularService {

	@Autowired
	private ICelularRepo i_cell_repo;
	
	private Logger LOG = LoggerFactory.getLogger(PruebaSb1CrudMvc3Application.class);
	
	@Override
	public String saveCell(Celular cell) {
		// TODO Auto-generated method stub
		String men = null;
		
		try {
			
			i_cell_repo.save(cell);
			
			if (cell.getId_cell() != 0) {
				men = "Create cell";
			} else {
				men = "Update cell";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			men = "ERROR: " + e.getMessage(); 
		}
		
		return men;
	}

	@Override
	public List<Celular> findAllCelulars() {
		// TODO Auto-generated method stub
		
		List<Celular> list_cell = null;
		
		try {
			
			list_cell = i_cell_repo.findAll();
			
		} catch (Exception e) {
			// TODO: handle exception
			LOG.warn("ERROR: " + e.getMessage());
		}
		
		return list_cell;
	}

	@Override
	public Optional<Celular> findByCelular(int id_celular) {
		// TODO Auto-generated method stub
		Optional<Celular> cell = null;
		Integer id_cell = id_celular;
		
		try {
			
			cell = i_cell_repo.findById(id_cell);
			
			if (cell.get().getId_cell() == 0) {
				LOG.info("------------------ El celular no se pudo encontrar ---------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			LOG.warn("ERROR: " + e.getMessage());
		}
		
		return cell;
	}

	@Override
	public String deleteCelular(int id_cell) {
		
		String men = null;
		
		Celular cell = new Celular();
		
		try {
			
			cell.setId_cell(id_cell);
			
			i_cell_repo.delete(cell);
			
			men = "Delete user";
			
		} catch (Exception e) {
			// TODO: handle exception
			LOG.warn("ERROR: " + e.getMessage());
		}
		
		return men;
	}

	
}
