/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.vista;

import static java.awt.SystemColor.control;
import javax.swing.JOptionPane;
import reto5.controlador.MeseroControlador;
import reto5.modelo.Mesero;

/**
 *
 * @author Jaiver
 */
/* La siguiente ventana permite al usuario eliminar un Mesero, agregarlo, o modificarlo

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class VistaInsertarMesero extends javax.swing.JFrame {
    Mesero mesero;
    VistaMeseros vistaMesero;
    /**
     * Creates new form VistaInssertarMesero
     */
    public VistaInsertarMesero() {
        initComponents();
        jB_Eliminar_Mesero.setVisible(false);
        jL_Insertar_Mesero_Titulo.setText("Ingresar un mesero");//titulo en caso de agregar un mesero
    }

    //metodos para obtener informacion de las cajas te texto
    public VistaInsertarMesero(Mesero mesero, VistaMeseros vistaMesero) {
        initComponents();
        this.mesero = mesero;
        this.jT_Ingresar_Nombre_Cliente.setText(mesero.getMesNombre());
        this.jT_Ingresar_Apells_Mesero.setText(mesero.getMesApellido());
        this.jT_Ingresar_Documento_Mesero.setText(String.valueOf(mesero.getMesDocumento()));
        this.jT_Ingresar_Telefono_Mesero.setText(String.valueOf(mesero.getMesTelefono()));
        this.jT_Ingresar_Correo_Mesero.setText(mesero.getMesCorreo());
        this.jB_Guardar_Mesero.setText("Actualizar");
        this.vistaMesero = vistaMesero;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_Nombres_Mesero = new javax.swing.JLabel();
        jT_Ingresar_Nombre_Cliente = new javax.swing.JTextField();
        jL_Apellidos_Mesero = new javax.swing.JLabel();
        jT_Ingresar_Apells_Mesero = new javax.swing.JTextField();
        jL_Documento_Mesero = new javax.swing.JLabel();
        jT_Ingresar_Documento_Mesero = new javax.swing.JTextField();
        jL_Telefono_Mesero = new javax.swing.JLabel();
        jT_Ingresar_Telefono_Mesero = new javax.swing.JTextField();
        jB_Guardar_Mesero = new javax.swing.JButton();
        jB_Cerrar_Ventana_Guardar_Meseros = new javax.swing.JButton();
        jB_Eliminar_Mesero = new javax.swing.JButton();
        jL_Insertar_Mesero_Titulo = new javax.swing.JLabel();
        jT_Ingresar_Correo_Mesero = new javax.swing.JTextField();
        jL_Telefono_Correo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL_Nombres_Mesero.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jL_Nombres_Mesero.setText("Nombres");

        jT_Ingresar_Nombre_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Ingresar_Nombre_ClienteActionPerformed(evt);
            }
        });

        jL_Apellidos_Mesero.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jL_Apellidos_Mesero.setText("Apellidos");

        jT_Ingresar_Apells_Mesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Ingresar_Apells_Mesero_ClienteActionPerformed(evt);
            }
        });

        jL_Documento_Mesero.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jL_Documento_Mesero.setText("Documento");

        jT_Ingresar_Documento_Mesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Ingresar_Documento_MeseroActionPerformed(evt);
            }
        });

        jL_Telefono_Mesero.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jL_Telefono_Mesero.setText("Telefono");

        jT_Ingresar_Telefono_Mesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Ingresar_Telefono_MeseroActionPerformed(evt);
            }
        });

        jB_Guardar_Mesero.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jB_Guardar_Mesero.setText("Guardar");
        jB_Guardar_Mesero.setActionCommand("");
        jB_Guardar_Mesero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_Guardar_MeseroMouseClicked(evt);
            }
        });
        jB_Guardar_Mesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Guardar_MeseroActionPerformed(evt);
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
        jL_Insertar_Mesero_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/waiter.png"))); // NOI18N
        jL_Insertar_Mesero_Titulo.setText("Editar/Eliminar un mesero");

        jT_Ingresar_Correo_Mesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Ingresar_Correo_MeseroActionPerformed(evt);
            }
        });

        jL_Telefono_Correo.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jL_Telefono_Correo.setText("Correo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL_Apellidos_Mesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jL_Nombres_Mesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jL_Telefono_Mesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jL_Documento_Mesero)
                                            .addComponent(jB_Guardar_Mesero))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_Telefono_Correo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jT_Ingresar_Telefono_Mesero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_Ingresar_Documento_Mesero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_Ingresar_Apells_Mesero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_Ingresar_Nombre_Cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB_Eliminar_Mesero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jB_Cerrar_Ventana_Guardar_Meseros, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jT_Ingresar_Correo_Mesero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_Insertar_Mesero_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jL_Insertar_Mesero_Titulo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Ingresar_Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Nombres_Mesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Ingresar_Apells_Mesero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Apellidos_Mesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Ingresar_Documento_Mesero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Documento_Mesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Ingresar_Telefono_Mesero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Telefono_Mesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Ingresar_Correo_Mesero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Telefono_Correo))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Guardar_Mesero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Eliminar_Mesero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Cerrar_Ventana_Guardar_Meseros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_Ingresar_Nombre_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Ingresar_Nombre_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Ingresar_Nombre_ClienteActionPerformed

    private void jT_Ingresar_Apells_Mesero_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Ingresar_Apells_Mesero_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Ingresar_Apells_Mesero_ClienteActionPerformed

    private void jT_Ingresar_Documento_MeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Ingresar_Documento_MeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Ingresar_Documento_MeseroActionPerformed

    private void jT_Ingresar_Telefono_MeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Ingresar_Telefono_MeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Ingresar_Telefono_MeseroActionPerformed

    private void jB_Guardar_MeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Guardar_MeseroActionPerformed
        String nombre = jT_Ingresar_Nombre_Cliente.getText();
        System.out.println(nombre);
        String apellido = jT_Ingresar_Apells_Mesero.getText();
        Long documento = Long.valueOf(jT_Ingresar_Documento_Mesero.getText());
        Long telefono = Long.valueOf(jT_Ingresar_Telefono_Mesero.getText());
        String correo = jT_Ingresar_Correo_Mesero.getText();
        MeseroControlador control = new MeseroControlador();
        Mesero meseroLocal = new Mesero(nombre, apellido, documento, telefono, correo);
        if(jB_Guardar_Mesero.getText().equals("Actualizar")){
            control.actualizarMesero(meseroLocal,mesero.getMesId());
            vistaMesero.mostrarMeseros();
             JOptionPane.showMessageDialog(this,"Se actualizo un mesero");
        }
        else{
            control.insertarMesero(meseroLocal);
             JOptionPane.showMessageDialog(this,"Se ingreso un mesero");
        }
    }//GEN-LAST:event_jB_Guardar_MeseroActionPerformed

    private void jB_Guardar_MeseroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_Guardar_MeseroMouseClicked
        String nombre = jT_Ingresar_Nombre_Cliente.getText();
        String apellido = jT_Ingresar_Apells_Mesero.getText();
        Long documento = Long.valueOf(jT_Ingresar_Documento_Mesero.getText());
        Long telefono = Long.valueOf(jT_Ingresar_Telefono_Mesero.getText());
        String correo = jT_Ingresar_Correo_Mesero.getText();
        MeseroControlador control = new MeseroControlador();
        Mesero meseroLocal = new Mesero(nombre, apellido, documento, telefono, correo);
        if(jB_Guardar_Mesero.getText().equals("Actualizar")){
            control.actualizarMesero(meseroLocal,mesero.getMesId());
            vistaMesero.mostrarMeseros();
        }
        else{
            control.insertarMesero(meseroLocal);
        }
        
          
    }//GEN-LAST:event_jB_Guardar_MeseroMouseClicked

    private void jB_Cerrar_Ventana_Guardar_MeserosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_Cerrar_Ventana_Guardar_MeserosMouseClicked
       this.dispose();
       
    }//GEN-LAST:event_jB_Cerrar_Ventana_Guardar_MeserosMouseClicked

    private void jB_Cerrar_Ventana_Guardar_MeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Cerrar_Ventana_Guardar_MeserosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_Cerrar_Ventana_Guardar_MeserosActionPerformed

    private void jB_Eliminar_MeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Eliminar_MeseroActionPerformed
                        
    }//GEN-LAST:event_jB_Eliminar_MeseroActionPerformed

    private void jB_Eliminar_MeseroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_Eliminar_MeseroMouseClicked
     
        MeseroControlador control = new MeseroControlador();
        control.eliminarMesero(mesero);
        vistaMesero.mostrarMeseros();
        JOptionPane.showMessageDialog(this,"Se elimino un mesero");

      
    }//GEN-LAST:event_jB_Eliminar_MeseroMouseClicked

    private void jT_Ingresar_Correo_MeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Ingresar_Correo_MeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Ingresar_Correo_MeseroActionPerformed

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
            java.util.logging.Logger.getLogger(VistaInsertarMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInsertarMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInsertarMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInsertarMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInsertarMesero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Cerrar_Ventana_Guardar_Meseros;
    private javax.swing.JButton jB_Eliminar_Mesero;
    private javax.swing.JButton jB_Guardar_Mesero;
    private javax.swing.JLabel jL_Apellidos_Mesero;
    private javax.swing.JLabel jL_Documento_Mesero;
    private javax.swing.JLabel jL_Insertar_Mesero_Titulo;
    private javax.swing.JLabel jL_Nombres_Mesero;
    private javax.swing.JLabel jL_Telefono_Correo;
    private javax.swing.JLabel jL_Telefono_Mesero;
    private javax.swing.JTextField jT_Ingresar_Apells_Mesero;
    private javax.swing.JTextField jT_Ingresar_Correo_Mesero;
    private javax.swing.JTextField jT_Ingresar_Documento_Mesero;
    private javax.swing.JTextField jT_Ingresar_Nombre_Cliente;
    private javax.swing.JTextField jT_Ingresar_Telefono_Mesero;
    // End of variables declaration//GEN-END:variables
}
