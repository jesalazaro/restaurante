/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.vista;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import reto5.modelo.TipoPlato;

/**
 *
 * @author Jaiver
 * El siguiente archivo crea una  tabla para el usuario final donde se muestra la informacion del tipo de plato
 */
public class ModeloTablaTipoPlato implements TableModel{
    private final List<TipoPlato> tipoplatos;
    private final String[] columnas = new String[]{"IdPlato", "Nombre Plato"};
    private final Class<?>[] clasesColumnas = new Class<?>[]{Integer.class, String.class};
    
    public ModeloTablaTipoPlato(List<TipoPlato> tipoplatos) {
        this.tipoplatos = tipoplatos;
    }
 
    
    
    
    @Override
    public int getRowCount() {
       return tipoplatos.size();
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
            return tipoplatos.get(rowIndex).getTipoPlatoId();
        }
        else if(columnIndex == 1){
            return tipoplatos.get(rowIndex).getTipoPlatoNombre();
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
