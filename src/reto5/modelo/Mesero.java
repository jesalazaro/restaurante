/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.modelo;

/**
 *
 * @author Jaiver
 */
public class Mesero {
    private int mesId;
    private String mesNombre;
    private String mesApellido;
    private long mesDocumento;
    private long mesTelefono;
    private String mesCorreo;
    


    public Mesero(int mesId, String mesNombre, String mesApellido, long mesDocumento, long mesTelefono, String mesCorreo) {
        this.mesId = mesId;
        this.mesNombre = mesNombre;
        this.mesApellido = mesApellido;
        this.mesDocumento = mesDocumento;
        this.mesTelefono = mesTelefono;
        this.mesCorreo = mesCorreo;
    }

    public Mesero(String nombre, String apellido, long documento, long telefono, String correo) {
        this.mesNombre = nombre;
        this.mesApellido = apellido;
        this.mesDocumento = documento;
        this.mesTelefono = telefono;
        this.mesCorreo = correo;
    }


    
    public int getMesId(){
        return mesId;
    }
    
    public void setMesId(int mesId){
        this.mesId = mesId;
    }
    
    public String getMesNombre(){
        return mesNombre;
    }
    
    public void setMesNombre(String mesNombre){
        this.mesNombre = mesNombre;
    }
    
    public String getMesApellido(){
        return mesApellido;
    }
    
    public void setMesApellido(String mesApellido){
        this.mesApellido = mesApellido;
    }
    
    
     public long getMesDocumento() {
        return mesDocumento;
    }

    public void setMesDocumento(long mesDocumento) {
        this.mesDocumento = mesDocumento;
    }

         public long getMesTelefono() {
        return mesTelefono;
    }

    public void setMesTelefono(long mesTelefono) {
        this.mesTelefono = mesTelefono;
    }

    
    public String getMesCorreo(){
        return mesCorreo;
    }
    
    public void setMesCorreo(String mesCorreo){
        this.mesCorreo = mesCorreo;
    }
}
