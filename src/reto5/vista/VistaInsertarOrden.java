/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.vista;

import static java.awt.SystemColor.control;
import javax.swing.JOptionPane;
import reto5.controlador.OrdenControlador;
import reto5.modelo.Orden;

/**
 *
 * @author Jaiver
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 La siguiente ventana permite al usuario eliminar una Orden, agregarlo, o modificarlo
 */

public class VistaInsertarOrden extends javax.swing.JFrame {
    Orden orden;
    VistaOrden vistaOrden;
    /**
     * Creates new form VistaInssertarMesero
     */
    public VistaInsertarOrden() {
        initComponents();
        jB_Eliminar_Mesero.setVisible(false);
        jL_Insertar_Mesero_Titulo.setText("Ingresar una Orden");//titulo en caso de agregar una orden
    }
//metodos para obtener informacion de las cajas te texto
    public VistaInsertarOrden(Orden orden, VistaOrden vistaOrden) {
        initComponents();
        this.orden = orden;
        this.jT_Ingresar_Fecha_Orden.setText(orden.getOrdnFecha());
        this.jT_Ingresar_IdPlato_orden.setText(String.valueOf(orden.getOrdnPlatoId()));
        this.jT_Ingresar_Id_Mesero_Orden.setText(String.valueOf(orden.getOrdnMesId()));
        this.jT_Ingresar_Id_Cliente_Orden.setText(String.valueOf(orden.getOrdnCliId()));
        this.jB_Guardar_Orden.setText("Actualizar");
        this.vistaOrden = vistaOrden;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_Fecha_Orden = new javax.swing.JLabel();
        jT_Ingresar_Fecha_Orden = new javax.swing.JTextField();
        jL_PlatoId = new javax.swing.JLabel();
        jT_Ingresar_IdPlato_orden = new javax.swing.JTextField();
        jL_MeseroId = new javax.swing.JLabel();
        jT_Ingresar_Id_Mesero_Orden = new javax.swing.JTextField();
        jL_ClienteId = new javax.swing.JLabel();
        jT_Ingresar_Id_Cliente_Orden = new javax.swing.JTextField();
        jB_Guardar_Orden = new javax.swing.JButton();
        jB_Cerrar_Ventana_Guardar_Meseros = new javax.swing.JButton();
        jB_Eliminar_Mesero = new javax.swing.JButton();
        jL_Insertar_Mesero_Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL_Fecha_Orden.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jL_Fecha_Orden.setText("Fecha(AAAA-MM-DD):");

        jT_Ingresar_Fecha_Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Ingresar_Fecha_OrdenActionPerformed(evt);
            }
        });

        jL_PlatoId.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jL_PlatoId.setText("Id Plato");

        jT_Ingresar_IdPlato_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Ingresar_IdPlato_orden_ClienteActionPerformed(evt);
            }
        });

        jL_MeseroId.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jL_MeseroId.setText("Id Mesero");

        jT_Ingresar_Id_Mesero_Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Ingresar_Id_Mesero_OrdenActionPerformed(evt);
            }
        });

        jL_ClienteId.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jL_ClienteId.setText("Id Cliente");

        jT_Ingresar_Id_Cliente_Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Ingresar_Id_Cliente_OrdenActionPerformed(evt);
            }
        });

        jB_Guardar_Orden.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jB_Guardar_Orden.setText("Guardar");
        jB_Guardar_Orden.setActionCommand("");
        jB_Guardar_Orden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_Guardar_OrdenMouseClicked(evt);
            }
        });
        jB_Guardar_Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Guardar_OrdenActionPerformed(evt);
            }
        });

        jB_Cerrar_Ventana_Guardar_Meseros.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jB_Cerrar_Ventana_Guardar_Meseros.setText("Cerrar");
        jB_Cerrar_Ventana_Guardar_Meseros.setMaximumSize(new java.awt.Dimension(71, 23));
        jB_Cerrar_Ventana_Guardar_Meseros.setMinimumSize(new java.awt.Dimension(71, 23));
        jB_Cerrar_Ventana_Guardar_Meseros.setPreferredSize(new java.awt.Dimension(71, 23));
        jB_Cerrar_Ventana_Guardar_Meseros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_Cerrar_Ventana_Guardar_MeserosMouseClicked(evt);
            }
        });
        jB_Cerrar_Ventana_Guardar_Meseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Cerrar_Ventana_Guardar_MeserosActionPerformed(evt);
            }
        });

        jB_Eliminar_Mesero.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jB_Eliminar_Mesero.setText("Eliminar");
        jB_Eliminar_Mesero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_Eliminar_MeseroMouseClicked(evt);
            }
        });
        jB_Eliminar_Mesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Eliminar_MeseroActionPerformed(evt);
            }
        });

        jL_Insertar_Mesero_Titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jL_Insertar_Mesero_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clipboard.png"))); // NOI18N
        jL_Insertar_Mesero_Titulo.setText("Editar/Eliminar una Orden");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_Insertar_Mesero_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_PlatoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jL_Fecha_Orden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jL_ClienteId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_MeseroId)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jB_Guardar_Orden)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jT_Ingresar_Id_Cliente_Orden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_Ingresar_Id_Mesero_Orden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_Ingresar_IdPlato_orden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_Ingresar_Fecha_Orden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jB_Eliminar_Mesero)
                                .addGap(34, 34, 34)
                                .addComponent(jB_Cerrar_Ventana_Guardar_Meseros, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jL_Insertar_Mesero_Titulo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Ingresar_Fecha_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Fecha_Orden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Ingresar_IdPlato_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_PlatoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Ingresar_Id_Mesero_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_MeseroId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Ingresar_Id_Cliente_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_ClienteId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Guardar_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Eliminar_Mesero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Cerrar_Ventana_Guardar_Meseros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_Ingresar_Fecha_OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Ingresar_Fecha_OrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Ingresar_Fecha_OrdenActionPerformed

    private void jT_Ingresar_IdPlato_orden_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Ingresar_IdPlato_orden_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Ingresar_IdPlato_orden_ClienteActionPerformed

    private void jT_Ingresar_Id_Mesero_OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Ingresar_Id_Mesero_OrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Ingresar_Id_Mesero_OrdenActionPerformed

    private void jT_Ingresar_Id_Cliente_OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Ingresar_Id_Cliente_OrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Ingresar_Id_Cliente_OrdenActionPerformed

    private void jB_Guardar_OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Guardar_OrdenActionPerformed
        String fecha = jT_Ingresar_Fecha_Orden.getText();
        int Plato = Integer.valueOf(jT_Ingresar_IdPlato_orden.getText());
        int Mesero = Integer.valueOf(jT_Ingresar_Id_Mesero_Orden.getText());
        int Cliente = Integer.valueOf(jT_Ingresar_Id_Cliente_Orden.getText());
     
        OrdenControlador control = new OrdenControlador();
        Orden ordenLocal = new Orden(fecha, Plato, Mesero, Cliente);
        if(jB_Guardar_Orden.getText().equals("Actualizar")){
            control.actualizarOrden(ordenLocal,orden.getOrdId());
            vistaOrden.mostrarOrdenes();
             JOptionPane.showMessageDialog(this,"Se actualizo una orden");
        }
        else{
            control.insertarOrden(ordenLocal);
             JOptionPane.showMessageDialog(this,"Se guardo una orden");
        }
    }//GEN-LAST:event_jB_Guardar_OrdenActionPerformed

    private void jB_Guardar_OrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_Guardar_OrdenMouseClicked

          
    }//GEN-LAST:event_jB_Guardar_OrdenMouseClicked

    private void jB_Cerrar_Ventana_Guardar_MeserosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_Cerrar_Ventana_Guardar_MeserosMouseClicked
       this.dispose();
       
    }//GEN-LAST:event_jB_Cerrar_Ventana_Guardar_MeserosMouseClicked

    private void jB_Cerrar_Ventana_Guardar_MeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Cerrar_Ventana_Guardar_MeserosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_Cerrar_Ventana_Guardar_MeserosActionPerformed

    private void jB_Eliminar_MeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Eliminar_MeseroActionPerformed
                        
    }//GEN-LAST:event_jB_Eliminar_MeseroActionPerformed

    private void jB_Eliminar_MeseroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_Eliminar_MeseroMouseClicked
     
        OrdenControlador control = new OrdenControlador();
        control.eliminarOrden(orden);
        vistaOrden.mostrarOrdenes();
        JOptionPane.showMessageDialog(this,"Se  elimino una orden");

      
    }//GEN-LAST:event_jB_Eliminar_MeseroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaInsertarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInsertarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInsertarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInsertarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInsertarOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Cerrar_Ventana_Guardar_Meseros;
    private javax.swing.JButton jB_Eliminar_Mesero;
    private javax.swing.JButton jB_Guardar_Orden;
    private javax.swing.JLabel jL_ClienteId;
    private javax.swing.JLabel jL_Fecha_Orden;
    private javax.swing.JLabel jL_Insertar_Mesero_Titulo;
    private javax.swing.JLabel jL_MeseroId;
    private javax.swing.JLabel jL_PlatoId;
    private javax.swing.JTextField jT_Ingresar_Fecha_Orden;
    private javax.swing.JTextField jT_Ingresar_IdPlato_orden;
    private javax.swing.JTextField jT_Ingresar_Id_Cliente_Orden;
    private javax.swing.JTextField jT_Ingresar_Id_Mesero_Orden;
    // End of variables declaration//GEN-END:variables
}