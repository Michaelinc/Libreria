/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecodeup.interfaces;

import java.util.List;

/**
 *
 * @author utp
 * @param <T>
 * @param <K>
 */
public interface Bean<T,K> {
    T guardar(T o);
    void eliminar(K id);
    T actualizar(T o);
    List<T> listar();
    T buscar(K id);
}
