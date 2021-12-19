/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.modelo;

import java.util.List;

/**
 *Registra los métodos CRUD, contiene la firma de los métodos.
 * @author Jaiver
 */



public interface IClienteDAO {
    //Read
    public List<Cliente> obtenerTodosLosClientes();
    //Read
    public Cliente obtenerClientePorId(Integer id);
    //Create
    public void insertarCliente(Cliente cliente);
    //Update
    public void actualizarCliente(Cliente cliente, int cliId);
    //Delete
    public void eliminarCliente(Cliente cliente);
}
