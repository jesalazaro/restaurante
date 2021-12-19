/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.vista;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import reto5.modelo.Plato;

/**
 *
 * @author Jaiver
 * El siguiente archivo crea una  tabla para el usuario final donde se muestra la informacion del Plato.
 */
public class ModeloTablaPlato implements TableModel{
    private final List<Plato> platos;
    private final String[] columnas = new String[]{"IdPlato", "Nombre Plato", "Precio", "Descripción", "Tipo de plato"};
    private final Class<?>[] clasesColumnas = new Class<?>[]{Integer.class, String.class, long.class, String.class, int.class};
    
    public ModeloTablaPlato(List<Plato> platos) {
        this.platos = platos;
    }
 
    
    
    
    @Override
    public int getRowCount() {
       return platos.size();
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
            return platos.get(rowIndex).getPltId();
        }
        else if(columnIndex == 1){
            return platos.get(rowIndex).getPltNombre();
        }
        else if(columnIndex == 2){
            return platos.get(rowIndex).getPltPrecio();
         }
        else if (columnIndex == 3){
            return platos.get(rowIndex).getPltDescripcion();
        }
        else if(columnIndex == 4){
            return platos.get(rowIndex).getTipoPlatoId();
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
