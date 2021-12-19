/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.modelo;

/**
 *
 * @author Jaiver
 * 
 * Este archivo contiene las variables junto con los metodos getter and setter de la base de datos, más especificamente de la tabla cliente.
 * 
 */


public class Cliente {
    private int cliId;
    private String cliNombre;
    private String cliApellido;
    private long cliDocumento;
    private long cliTelefono;

    public Cliente(String cliNombre, String cliApellido, long cliDocumento, long cliTelefono) {
        this.cliNombre = cliNombre;
        this.cliApellido = cliApellido;
        this.cliDocumento = cliDocumento;
        this.cliTelefono = cliTelefono;
    }

     
    
public Cliente(int cliId,String cliNombre,String cliApellido,long cliDocumento,long cliTelefono){
    this.cliId = cliId;
    this.cliNombre = cliNombre;
    this.cliApellido = cliApellido;
    this.cliDocumento = cliDocumento;
    this.cliTelefono = cliTelefono;
}

    public int getCliId() {
        return cliId;
    }

    public void setCliId(int cliId) {
        this.cliId = cliId;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getCliApellido() {
        return cliApellido;
    }

    public void setCliApellido(String cliApellido) {
        this.cliApellido = cliApellido;
    }

    public long getCliDocumento() {
        return cliDocumento;
    }

    public void setCliDocumento(long cliDocumento) {
        this.cliDocumento = cliDocumento;
    }

    public long getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(long cliTelefono) {
        this.cliTelefono = cliTelefono;
    }
}
