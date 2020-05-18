package com.prueba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_celular")
public class Celular {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cell;
	
	@Column(name = "number")
	private int number;
	
	@Column(name = "operator", length = 50)
	private String operator;
	
	/**
	 * Constructor
	 */
	public Celular() {
		
	}
	
	/**
	 * Constructor
	 * @param id_cell
	 * @param number
	 * @param operator
	 */
	public Celular(int id_cell, int number, String operator) {
		super();
		this.id_cell = id_cell;
		this.number = number;
		this.operator = operator;
	}

	
	//GETTHRES AND SETTHERS
	
	public int getId_cell() {
		return id_cell;
	}

	public void setId_cell(int id_cell) {
		this.id_cell = id_cell;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	
	
	
	
}
