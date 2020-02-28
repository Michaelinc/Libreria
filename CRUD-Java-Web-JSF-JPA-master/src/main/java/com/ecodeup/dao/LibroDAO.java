package com.ecodeup.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.ecodeup.model.Libro;
import com.ecodeup.Util.JPAUtil;
import com.ecodeup.interfaces.Repository;
import java.util.ArrayList;
import javax.persistence.Query;
import org.hibernate.Session;

public class LibroDAO implements Repository<Libro,String>{
	
    //EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
    Session session  = JPAUtil.openSession();
    @Override
    public Libro save(Libro o) {
        session.beginTransaction();
        Libro l = (Libro) session.save(o);
        session.getTransaction().commit();
        return l;
    }

    @Override
    public void delete(String id) {
        session.beginTransaction();
        Libro o = new Libro();
        o = session.find(Libro.class, id);
        entity.getTransaction().begin();
        entity.remove(o);
        entity.getTransaction().commit();
    }

    @Override
    public Libro update(Libro o) {
        session.beginTransaction();
        Libro l = (Libro) session.merge(o);
        session.getTransaction().commit();
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
        session.beginTransaction();
        return session.get(Libro.class, id);
    }
        
}
