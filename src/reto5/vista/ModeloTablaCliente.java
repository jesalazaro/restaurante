/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.vista;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import reto5.modelo.Cliente;

/**
 *
 * @author Jaiver
 * El siguiente archivo crea una  tabla para el usuario final donde se muestra la informacion del Cliente.
 * 
 */
public class ModeloTablaCliente implements TableModel{
    private final List<Cliente> clientes;
    private final String[] columnas = new String[]{"Id", "Nombres", "Apellidos", "Documento", "Telefono"};
    private final Class<?>[] clasesColumnas = new Class<?>[]{Integer.class, String.class, String.class, Long.class, Long.class};
    
    public ModeloTablaCliente(List<Cliente> clientes) {
        this.clientes = clientes;
    }
 
    
    
    
    @Override
    public int getRowCount() {
       return clientes.size();
    }

    @Override
    public int getColumnCount() {
       return columnas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
       return columnas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return clasesColumnas[columnIndex];
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
       return false;
    }

    //Se ingresan los datos a la tabla
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return clientes.get(rowIndex).getCliId();
        }
        else if(columnIndex == 1){
            return clientes.get(rowIndex).getCliNombre();
        }
        else if(columnIndex == 2){
            return clientes.get(rowIndex).getCliApellido();
         }
        else if (columnIndex == 3){
            return clientes.get(rowIndex).getCliDocumento();
        }
        else if(columnIndex == 4){
            return clientes.get(rowIndex).getCliTelefono();
        }
        else {
            return null;
        }
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
       
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
    
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
       
    }
    
    
}
