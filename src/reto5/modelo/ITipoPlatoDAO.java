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
public interface ITipoPlatoDAO {
    
    public List<TipoPlato> obtenerTodosLosTipoPlatos();
    
    public void insertarTipoPlato(TipoPlato tipoplato);
    
    public void actualizarTipoPlato(TipoPlato tipoplato, int TipoPltId);
    
    public void eliminarTipoPlato(TipoPlato tipoplato);

    public TipoPlato obtenerTipoPlatoPorId(Integer id);
}
