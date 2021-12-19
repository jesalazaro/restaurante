/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.modelo;

/**
 *
 * @author Jaiver
 * Este archivo contiene las variables junto con los metodos getter and setter de la base de datos, más especificamente de la tabla tipo plato.
 */
public class TipoPlato {
    private int TipoPlatoId;
    private String TipoPlatoNombre;
    
    public TipoPlato(int tipoPlatoId, String tipoPlatoNombre){
        this.TipoPlatoId = tipoPlatoId;
        this.TipoPlatoNombre = tipoPlatoNombre;
    }
    
    public TipoPlato(String tipoPlatoNombre){
        this.TipoPlatoNombre = tipoPlatoNombre;
    }

    public int getTipoPlatoId() {
        return TipoPlatoId;
    }

    public void setTipoPlatoId(int TipoPlatoId) {
        this.TipoPlatoId = TipoPlatoId;
    }

    public String getTipoPlatoNombre() {
        return TipoPlatoNombre;
    }

    public void setTipoPlatoNombre(String TipoPlatoNombre) {
        this.TipoPlatoNombre = TipoPlatoNombre;
    }
    
    
}
