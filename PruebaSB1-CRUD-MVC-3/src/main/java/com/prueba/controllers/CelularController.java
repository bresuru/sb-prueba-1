package com.prueba.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.entity.Celular;
import com.prueba.services.ICelularService;

@Controller
@RequestMapping
public class CelularController {

	@Autowired
	private ICelularService i_cell_service;
	
	@GetMapping("/index")
	public String listar(@RequestParam(name = "men", required = false, defaultValue = "Hello World")String men,Model model) {
		model.addAttribute("list_cell", i_cell_service.findAllCelulars());
		model.addAttribute("men", men);
		return "index";
	}
	
	@GetMapping("/delete_cell/{id_cell}")
	public String delete_cell(@PathVariable int id_cell, Model model) {
		
		return "redirect:/index?men="+i_cell_service.deleteCelular(id_cell);
	}
	
	@GetMapping("/create_cell")
	public String create_cell(Model model) {
		model.addAttribute("cell", new Celular());
		
		return "/app/save_cell";
	}
	
	@PostMapping("/save")
	public String save(@Valid Celular cell, Model model) {
		model.addAttribute("men", i_cell_service.saveCell(cell));
		
		return "redirect:/index?men="+i_cell_service.saveCell(cell);
	}
	
	@GetMapping("/update_cell/{id_cell}")
	public String update_cell(@PathVariable int id_cell, Model model) {
		model.addAttribute("cell", i_cell_service.findByCelular(id_cell));
		return "/app/save_cell";
	}
	
}
