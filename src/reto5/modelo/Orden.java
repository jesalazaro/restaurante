/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.modelo;

/**
 *
 * @author Jaiver
 * Este archivo contiene las variables junto con los metodos getter and setter de la base de datos, más especificamente de la tabla orden.
 */
public class Orden {
    
    private int ordId;
    private String OrdnFecha;
    private int OrdnPlatoId;
    private int OrdnMesId;
    private int OrdnCliId;

    Orden(int ordId, String OrdnFecha, int OrdnPlatoId, int OrdnMesId, int OrdnCliId) {
        this.ordId = ordId;
        this.OrdnFecha = OrdnFecha;
        this.OrdnPlatoId = OrdnPlatoId;
        this.OrdnMesId = OrdnMesId;
        this.OrdnCliId = OrdnCliId;
    }
        public Orden( String Fecha, int PlatoId, int MesId, int CliId) {
        this.OrdnFecha = Fecha;
        this.OrdnPlatoId = PlatoId;
        this.OrdnMesId = MesId;
        this.OrdnCliId = CliId;
    }

    public int getOrdId() {
        return ordId;
    }

    public void setOrdId(int ordId) {
        this.ordId = ordId;
    }

    public String getOrdnFecha() {
        return OrdnFecha;
    }

    public void setOrdnFecha(String OrdnFecha) {
        this.OrdnFecha = OrdnFecha;
    }

    public int getOrdnPlatoId() {
        return OrdnPlatoId;
    }

    public void setOrdnPlatoId(int OrdnPlatoId) {
        this.OrdnPlatoId = OrdnPlatoId;
    }

    public int getOrdnMesId() {
        return OrdnMesId;
    }

    public void setOrdnMesId(int OrdnMesId) {
        this.OrdnMesId = OrdnMesId;
    }

    public int getOrdnCliId() {
        return OrdnCliId;
    }

    public void setOrdnCliId(int OrdnCliId) {
        this.OrdnCliId = OrdnCliId;
    }
}
