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
public interface IOrdenDAO {
    
    public List<Orden> obtenerTodasLasOrdenes();
    
    public void insertarOrden(Orden orden);
    
    public void actualizarOrden(Orden orden, int OrdnId);
    
    public void eliminarOrden(Orden orden);

    public Orden obtenerOrdenPorId(Integer id);
    
}
