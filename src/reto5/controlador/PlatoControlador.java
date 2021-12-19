/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.controlador;

import java.util.ArrayList;
import java.util.List;
import reto5.modelo.IPlatoDAO;
import reto5.modelo.Plato;
import reto5.modelo.PlatoDAOjdbcImpl;


/**
 *
 * @author Jaiver
 *  * El siguiente archivo permite a la vista comunicarse con el modelo, es decir sirve como puente para enviar la debida informacion en este caso
 * de la tabla plato
 */
public class PlatoControlador {
    private List<Plato> listaPlato;
    IPlatoDAO daoPlato = new PlatoDAOjdbcImpl();

    
    public PlatoControlador(){
        listaPlato = new ArrayList<Plato>();
    }
    
    public List<Plato> obtenerTodosLosPlatos(){
        return daoPlato.obtenerTodosLosPlatos();
    }
    
    public void insertarPlato(Plato plato){
        daoPlato.insertarPlato(plato);
    }
    
    public Plato obtenerPlatoPorId(Integer id){
        return daoPlato.obtenerPlatoPorId(id);
    }
    
    public void actualizarPlato(Plato plato, int pltId){
        daoPlato.actualizarPlato(plato, pltId);
    }
    
    public void eliminarPlato(Plato plato){
        daoPlato.eliminarPlato(plato);
    } 
}
