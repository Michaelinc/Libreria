package com.ecodeup.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.ecodeup.dao.LibroDAO;
import com.ecodeup.interfaces.Bean;
import com.ecodeup.model.Libro;

@ManagedBean(name = "libroBean")
@RequestScoped
public class LibroBean {
/*	
	public String nuevo() {
		Cliente c= new Cliente();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cliente", c);
		return  "/faces/nuevo.xhtml";
	}
	
	public String guardar (Cliente cliente) {
		//guarda la fecha de registro
		Date fechaActual= new Date();
		cliente.setFregistro(new java.sql.Date(fechaActual.getTime()));
		
		ClienteDAO clienteDAO= new ClienteDAO();
		clienteDAO.guardar(cliente);
		return  "/faces/index.xhtml";
	}

	public List<Cliente> obtenerClientes() {
		ClienteDAO clienteDAO = new ClienteDAO();

		/*
		 * List<Cliente> listaClientes = new ArrayList<>(); Cliente c1 = new Cliente();
		 * c1.setId(1L); c1.setNombres("Elivar"); c1.setApellidos("Largo");
		 * c1.setDireccion("Loja");
		 * 
		 * Cliente c2 = new Cliente(); c2.setId(1L); c2.setNombres("Elivar1");
		 * c2.setApellidos("Largo1"); c2.setDireccion("Loja1"); listaClientes.add(c1);
		 * listaClientes.add(c2);
		 * 
		 * return listaClientes;
		 
		return clienteDAO.obtenerClientes();
	}

	public String editar(Long id) {
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente c = new Cliente();
		c = clienteDAO.buscar(id);
		System.out.println("******************************************");
		System.out.println(c);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cliente", c);
		return "/faces/editar.xhtml";
	}

	public String actualizar(Cliente cliente) {
		//guarda la fecha de actualizacion
		Date fechaActual= new Date();
		cliente.setFactualizar(new java.sql.Date(fechaActual.getTime()));
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.editar(cliente);
		return "/faces/index.xhtml";
	}

	// eliminar un cliente
	public String eliminar(Long id) {
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.eliminar(id);
		System.out.println("Cliente eliminado..");
		return "/faces/index.xhtml";
	}
*/


    public Libro guardar(Libro o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Libro actualizar(Libro o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public List<Libro> listar() {
        List<Libro> lista = new ArrayList<>();
        LibroDAO l = new LibroDAO();
        l.getAll();
        Libro l1 = new Libro();
        l1.setAutor("Autor");
        l1.setISBN("12345");
        l1.setDescripcion("ninguna");
        l1.setPaginas(80L);
        l1.setTitulo("El mas grande");
        l1.setEdicion("3ra Edicion");
        
        Libro l2 = new Libro();
        l2.setAutor("Autor 2");
        l2.setISBN("elmejor");
        l2.setDescripcion("todas");
        l2.setPaginas(40L);
        l2.setTitulo("El mas pequeño");
        l2.setEdicion("2da Edicion");
        
        lista.add(l1);
        lista.add(l2);
        
        //return lista;
        return l.getAll();
    }


    public Libro buscar(String id) {
        LibroDAO dao = new LibroDAO();
        return dao.getOne(id);
    }

}
