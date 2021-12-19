/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.controlador;

import java.util.ArrayList;
import java.util.List;
import reto5.modelo.IMeseroDAO;
import reto5.modelo.Mesero;
import reto5.modelo.MeseroDAOjdbcImpl;

/**
 *
 * @author Jaiver
 *  * El siguiente archivo permite a la vista comunicarse con el modelo, es decir sirve como puente para enviar la debida informacion en este caso
 * de la tabla meseros
 */
public class MeseroControlador {
    
    private List<Mesero> listaMesero;
    IMeseroDAO daoMesero = new MeseroDAOjdbcImpl();
    
    
    public MeseroControlador(){
        listaMesero = new ArrayList<Mesero>();
    }
    
    public List<Mesero> obtenerTodosLosMeseros(){
        return daoMesero.obtenerTodosLosMeseros();
    }
    
    public void insertarMesero(Mesero mesero){
        daoMesero.insertarMesero(mesero);
    }
    
    public Mesero obtenerMeseroPorId(Integer id){
        return daoMesero.obtenerMeseroPorId(id);
    }
    
    public void actualizarMesero(Mesero mesero, int mesId){
        daoMesero.actualizarMesero(mesero, mesId);
    }
    
    public void eliminarMesero(Mesero mesero){
        daoMesero.eliminarMesero(mesero);
    }
}
