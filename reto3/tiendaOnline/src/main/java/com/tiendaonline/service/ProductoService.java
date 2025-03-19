package com.tiendaonline.service;

import java.util.List;

import com.tiendaonline.dao.ProductoDAO;
import com.tiendaonline.model.Producto;

public class ProductoService {

	ProductoDAO productoBD;

	public ProductoService() {
		productoBD = new ProductoDAO();
	}
	
	public List<Producto> getProducto() {
		return productoBD.getProducto();
	}
	
	public boolean addProducto(Producto producto) {
		return productoBD.addProducto(producto);
	}
}
