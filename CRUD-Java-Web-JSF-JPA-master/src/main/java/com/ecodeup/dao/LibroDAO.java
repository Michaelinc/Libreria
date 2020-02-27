package com.ecodeup.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.ecodeup.model.Libro;
import com.ecodeup.Util.JPAUtil;
import com.ecodeup.interfaces.Repository;
import java.util.ArrayList;
import javax.persistence.Query;

public class LibroDAO implements Repository<Libro,String>{
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
    @Override
    public Libro save(Libro o) {
        entity.getTransaction().begin();
        entity.persist(o);
        entity.getTransaction().commit();
        return o;
    }

    @Override
    public void delete(String id) {
        Libro o = new Libro();
        o = entity.find(Libro.class, id);
        entity.getTransaction().begin();
        entity.remove(o);
        entity.getTransaction().commit();
    }

    @Override
    public Libro update(Libro o) {
        entity.getTransaction().begin();
        entity.merge(o);
        entity.getTransaction().commit();
        return o;
    }

    @Override
    public List<Libro> getAll() {
        List<Libro> listaLibros = new ArrayList<>();
        Query q = entity.createQuery("SELECT o FROM Libro o");
        listaLibros = q.getResultList();
        return listaLibros;
    }

    @Override
    public Libro getOne(String id) {
        Libro o = new Libro();
        o = entity.find(Libro.class, id);
        // JPAUtil.shutdown();
        return o;
    }
        
}
