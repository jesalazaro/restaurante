/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.controlador;

import java.util.ArrayList;
import java.util.List;
import reto5.modelo.IOrdenDAO;
import reto5.modelo.Orden;
import reto5.modelo.OrdenDAOjdbcImpl;

/**
 *
 * @author Jaiver
 *  * El siguiente archivo permite a la vista comunicarse con el modelo, es decir sirve como puente para enviar la debida informacion en este caso
 * de la tabla orden
 */
public class OrdenControlador {
    private List<Orden> listaOrden;
    IOrdenDAO daoOrden = new OrdenDAOjdbcImpl();

    
    public OrdenControlador(){
        listaOrden = new ArrayList<Orden>();
    }
    
    public List<Orden> obtenerTodasLasOrdenes(){
        return daoOrden.obtenerTodasLasOrdenes();
    }
    
    public void insertarOrden(Orden orden){
        daoOrden.insertarOrden(orden);
    }
    
    public Orden obtenerOrdenPorId(Integer id){
        return daoOrden.obtenerOrdenPorId(id);
    }
    
    public void actualizarOrden(Orden orden, int ordnId){
        daoOrden.actualizarOrden(orden, ordnId);
    }
    
    public void eliminarOrden(Orden orden){
        daoOrden.eliminarOrden(orden);
    }
}
