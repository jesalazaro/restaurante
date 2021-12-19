/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.vista;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import reto5.modelo.Orden;

/**
 *
 * @author Jaiver
 * El siguiente archivo crea una  tabla para el usuario final donde se muestra la informacion de la Orden
 */
public class ModeloTablaOrden implements TableModel{
    private final List<Orden> ordenes;
    private final String[] columnas = new String[]{"IdOrden", "Fecha", "Plato Id", "MeseroId", "ClienteId"};
    private final Class<?>[] clasesColumnas = new Class<?>[]{Integer.class, String.class, int.class, int.class, int.class};
    
    public ModeloTablaOrden(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }
 
    
    
    
    @Override
    public int getRowCount() {
       return ordenes.size();
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
            return ordenes.get(rowIndex).getOrdId();
        }
        else if(columnIndex == 1){
            return ordenes.get(rowIndex).getOrdnFecha();
        }
        else if(columnIndex == 2){
            return ordenes.get(rowIndex).getOrdnPlatoId();
         }
        else if (columnIndex == 3){
            return ordenes.get(rowIndex).getOrdnMesId();
        }
        else if(columnIndex == 4){
            return ordenes.get(rowIndex).getOrdnCliId();
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
