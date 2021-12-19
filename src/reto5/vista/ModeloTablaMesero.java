/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.vista;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import reto5.modelo.Mesero;

/**
 *
 * @author Jaiver
 * El siguiente archivo crea una  tabla para el usuario final donde se muestra la informacion del Mesero
 */
public class ModeloTablaMesero implements TableModel{
    private final List<Mesero> meseros;
    private final String[] columnas = new String[]{"Id", "Nombres", "Apellidos", "Documento", "Telefono", "Correo Electronico"};
    private final Class<?>[] clasesColumnas = new Class<?>[]{Integer.class, String.class, String.class, Long.class, Long.class, String.class};
    
    public ModeloTablaMesero(List<Mesero> meseros) {
        this.meseros = meseros;
    }
 
    
    
    
    @Override
    public int getRowCount() {
       return meseros.size();
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

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return meseros.get(rowIndex).getMesId();
        }
        else if(columnIndex == 1){
            return meseros.get(rowIndex).getMesNombre();
        }
        else if(columnIndex == 2){
            return meseros.get(rowIndex).getMesApellido();
         }
        else if (columnIndex == 3){
            return meseros.get(rowIndex).getMesDocumento();
        }
        else if(columnIndex == 4){
            return meseros.get(rowIndex).getMesTelefono();
        }
        else if(columnIndex == 5){
            return meseros.get(rowIndex).getMesCorreo();
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
