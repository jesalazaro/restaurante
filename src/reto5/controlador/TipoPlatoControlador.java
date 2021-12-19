/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.controlador;

import java.util.ArrayList;
import java.util.List;
import reto5.modelo.ITipoPlatoDAO;
import reto5.modelo.TipoPlato;
import reto5.modelo.TipoPlatoDAOjdbcImpl;


/**
 *
 * @author Jaive
 *  * El siguiente archivo permite a la vista comunicarse con el modelo, es decir sirve como puente para enviar la debida informacion en este caso
 * de la tabla tipo de platos
 */
public class TipoPlatoControlador {
    private List<TipoPlato> listaTipoPlato;
    ITipoPlatoDAO daoTipoPlato = new TipoPlatoDAOjdbcImpl();

    
    public TipoPlatoControlador(){
        listaTipoPlato = new ArrayList<TipoPlato>();
    }
    
    public List<TipoPlato> obtenerTodosLosTipoPlatos(){
        return daoTipoPlato.obtenerTodosLosTipoPlatos();
    }
    
    public void insertarTipoPlato(TipoPlato tipoplato){
        daoTipoPlato.insertarTipoPlato(tipoplato);
    }
    
    public TipoPlato obtenerTipoPlatoPorId(Integer id){
        return daoTipoPlato.obtenerTipoPlatoPorId(id);
    }
    
    public void actualizarTipoPlato(TipoPlato tipoplato, int pltId){
        daoTipoPlato.actualizarTipoPlato(tipoplato, pltId);
    }
    
    public void eliminarTipoPlato(TipoPlato tipoplato){
        daoTipoPlato.eliminarTipoPlato(tipoplato);
    } 
}
