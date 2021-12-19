/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.modelo;

/**¡¡
 *
 * @author Jaiver
 * Este archivo contiene las variables junto con los metodos getter and setter de la base de datos, más especificamente de la tabla plato.
 */
public class Plato {
    private int PltId;
    private String PltNombre;
    private long PltPrecio;
    private String PltDescripcion;
    private int TipoPlatoId;
    
    
    public  Plato(int PlatoId, String PlatoNombre, long  PlatoPrecio, String PlatoDescripcion, int TipoPlatoId){
        this.PltId = PlatoId;
        this.PltNombre = PlatoNombre;
        this.PltPrecio = PlatoPrecio;
        this.PltDescripcion = PlatoDescripcion;
        this.TipoPlatoId = TipoPlatoId;
    }
    
    public  Plato(String PlatoNombre, long  PlatoPrecio, String PlatoDescripcion, int TipoPlatoId){
        this.PltNombre = PlatoNombre;
        this.PltPrecio = PlatoPrecio;
        this.PltDescripcion = PlatoDescripcion;
        this.TipoPlatoId = TipoPlatoId;
    }

    public int getPltId() {
        return PltId;
    }

    public void setPltId(int PltId) {
        this.PltId = PltId;
    }

    public String getPltNombre() {
        return PltNombre;
    }

    public void setPltNombre(String PltNombre) {
        this.PltNombre = PltNombre;
    }

    public long getPltPrecio() {
        return PltPrecio;
    }

    public void setPltPrecio(long PltPrecio) {
        this.PltPrecio = PltPrecio;
    }

    public String getPltDescripcion() {
        return PltDescripcion;
    }

    public void setPltDescripcion(String PltDescripcion) {
        this.PltDescripcion = PltDescripcion;
    }

    public int getTipoPlatoId() {
        return TipoPlatoId;
    }

    public void setTipoPlatoId(int TipoPlatoId) {
        this.TipoPlatoId = TipoPlatoId;
    }
    
    
}
