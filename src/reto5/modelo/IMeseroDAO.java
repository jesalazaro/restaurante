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
 * Registra los métodos CRUD, contiene la firma de los métodos.
 */
public interface IMeseroDAO {
    
    public List<Mesero> obtenerTodosLosMeseros();
    
    public void insertarMesero(Mesero mesero);
    
    public void actualizarMesero(Mesero mesero, int mesId);
    
    public void eliminarMesero(Mesero mesero);

    public Mesero obtenerMeseroPorId(Integer id);
    
    
}
