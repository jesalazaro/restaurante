/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.modelo;

import java.util.List;

/**
 *
 * @author Jaiver
 *  Registra los métodos CRUD, contiene la firma de los métodos.
 */
public interface IPlatoDAO {
    
    public List<Plato> obtenerTodosLosPlatos();
    
    public void insertarPlato(Plato plato);
    
    public void actualizarPlato(Plato plato, int PltId);
    
    public void eliminarPlato(Plato plato);

    public Plato obtenerPlatoPorId(Integer id);
}
