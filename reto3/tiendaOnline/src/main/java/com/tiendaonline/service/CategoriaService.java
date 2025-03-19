package com.tiendaonline.service;

import java.util.List;

import com.tiendaonline.dao.CategoriaDAO;
import com.tiendaonline.model.Categoria;

public class CategoriaService {

private CategoriaDAO CategoriaDAO;
	
	public CategoriaService() {
		CategoriaDAO = new CategoriaDAO();
	}

	public List<Categoria> getCategoria() {
		return CategoriaDAO.getCategoria();
	}

	public boolean addCategoria(Categoria categoria) {
		return CategoriaDAO.createOrUpdateCategoria(categoria);
	}
	
}
