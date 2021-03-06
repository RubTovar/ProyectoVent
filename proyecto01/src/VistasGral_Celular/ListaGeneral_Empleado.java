/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasGral_Celular;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.empleadoDT;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jamon
 */
public class ListaGeneral_Empleado extends javax.swing.JInternalFrame {

    empleadoDT dt= new empleadoDT();
    SistemaDelegate fc= new SistemaDelegate();
    /**
     * Creates new form ListaGeneral_Empleado
     */
    public ListaGeneral_Empleado() {
        initComponents();
        Llenado();
    }
    public void Llenado(){
        String columnas[] ={"ID Empleado","ID Tienda","Nombre","Cargo","Celular","E-Mail", "Sexo","Actualiza","elimina"};
        List lista;
        int fila=-1;
        try {
            Object[][] data =new Object[fc.ListasEmpleado(dt).size()][10];
            lista = fc.ListasEmpleado(dt);
            Iterator it= lista.iterator();
            while (it.hasNext()) {
                dt =(empleadoDT) it.next();
                fila++;
                data[fila][0]= dt.getIdnumEmpleado();
                data[fila][1]= dt.getIdtienda();
                data[fila][2]= dt.getNombre();
                data[fila][3]= dt.getCargo();
                data[fila][4]= dt.getCelular();
                data[fila][5]= dt.getEmail();
                data[fila][6]= dt.getSexo();
                data[fila][7]= "Actualiza";
                data[fila][8]= "Eliminar";
                tabla.setModel(new javax.swing.table.DefaultTableModel(data, columnas));
               
        }} catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_salir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel1.setText("Lista General de los Empleados Proletariados Mugrosos :v");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        dt.setIdnumEmpleado(Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString()));
        dt.setIdtienda(Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 1).toString()));
        dt.setNombre(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
        dt.setCargo(tabla.getValueAt(tabla.getSelectedRow(), 3).toString());
        dt.setCelular(Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 4).toString()));
        dt.setEmail(tabla.getValueAt(tabla.getSelectedRow(), 5).toString());
        dt.setSexo(tabla.getValueAt(tabla.getSelectedRow(), 6).toString());
   
        //Actualizar
        if (tabla.getSelectedColumn()==7) {
            if (JOptionPane.showConfirmDialog(this, "Deseas actualizar?","Actualizar",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
                try {
                    fc.cambiaEmpleado(dt);
                } catch (Exception e) {
                }
                
            }
        }
        //Eliminar
        if (tabla.getSelectedColumn()==8) {
            if (JOptionPane.showConfirmDialog(this, "Deseas eliminar?","Eliminar",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
                try {
                    fc.borraEmpleado(dt);
                    //Llenado();
                } catch (Exception e) {
                }
                
            }
        }
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
