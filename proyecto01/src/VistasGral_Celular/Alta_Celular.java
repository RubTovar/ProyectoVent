/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasGral_Celular;
import PROYECTO.dao.celularDAO;
import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.celularDT;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Chuy
 */
public class Alta_Celular extends javax.swing.JInternalFrame {

    celularDT  dto= new celularDT();
    SistemaDelegate Dl = new SistemaDelegate();
    /**
     * Creates new form Alta_Celular
     */
    public Alta_Celular() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdcelular = new javax.swing.JFormattedTextField();
        txtIdcliente = new javax.swing.JFormattedTextField();
        txtIdnumEmpleado = new javax.swing.JFormattedTextField();
        txtSisoperativo = new javax.swing.JFormattedTextField();
        txtNombre = new javax.swing.JFormattedTextField();
        txtMarca = new javax.swing.JFormattedTextField();
        txtMemoria = new javax.swing.JFormattedTextField();
        txtPrecio = new javax.swing.JFormattedTextField();
        txtCompa??ia = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtColor = new javax.swing.JFormattedTextField();
        txtCantidadcamaras = new javax.swing.JFormattedTextField();
        txtPulgadas = new javax.swing.JFormattedTextField();
        txtPixeles = new javax.swing.JFormattedTextField();
        cbxDia = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        cbxAnio = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Alta Celular");

        jLabel2.setText("Id Empleado :");

        jLabel3.setText("Id Cliente :");

        jLabel4.setText("Nombre de dispositivo:");

        jLabel5.setText("Os Dispositivo :");

        jLabel6.setText("Marca :");

        jLabel7.setText("Capacidad de Memoria:");

        jLabel8.setText("iD Celular :");

        jLabel9.setText("Precio :");

        jLabel10.setText("Compa??ia :");

        txtIdcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdcelularActionPerformed(evt);
            }
        });
        txtIdcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdcelularKeyTyped(evt);
            }
        });

        txtIdcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdclienteActionPerformed(evt);
            }
        });
        txtIdcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdclienteKeyTyped(evt);
            }
        });

        txtIdnumEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdnumEmpleadoActionPerformed(evt);
            }
        });
        txtIdnumEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdnumEmpleadoKeyTyped(evt);
            }
        });

        txtSisoperativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSisoperativoActionPerformed(evt);
            }
        });
        txtSisoperativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSisoperativoKeyTyped(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        txtMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemoriaActionPerformed(evt);
            }
        });
        txtMemoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMemoriaKeyTyped(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtCompa??ia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompa??iaActionPerformed(evt);
            }
        });
        txtCompa??ia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCompa??iaKeyTyped(evt);
            }
        });

        jLabel11.setText("Color :");

        jLabel12.setText("Numero de Camaras:");

        jLabel13.setText("Pulgadas :");

        jLabel14.setText("Fecha Venta :");

        jLabel15.setText("Pixeles :");

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });

        txtCantidadcamaras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadcamarasActionPerformed(evt);
            }
        });
        txtCantidadcamaras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadcamarasKeyTyped(evt);
            }
        });

        txtPulgadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulgadasActionPerformed(evt);
            }
        });
        txtPulgadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPulgadasKeyTyped(evt);
            }
        });

        txtPixeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPixelesActionPerformed(evt);
            }
        });
        txtPixeles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPixelesKeyTyped(evt);
            }
        });

        cbxDia.setModel(new javax.swing.DefaultComboBoxModel(Dl.numeros(1, 31)));

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto", "Septiembre","Octubre","Nobiembre", "Diciembre" }));

        cbxAnio.setModel(new javax.swing.DefaultComboBoxModel(Dl.numeros(1985, 2055)));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdnumEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSisoperativo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(Salir))
                                    .addComponent(txtMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCompa??ia, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPixeles, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidadcamaras, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIdcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtIdnumEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSisoperativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCompa??ia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCantidadcamaras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPixeles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Rcelular validarDatos = new Rcelular();
    
            
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtIdcelular.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa el IdCelulara","error",JOptionPane.ERROR_MESSAGE);
       }
        else if(txtIdnumEmpleado.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa el IdEmpleado","error",JOptionPane.ERROR_MESSAGE);
       }
        else if(txtIdcliente.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa el IdCliente","error",JOptionPane.ERROR_MESSAGE);
       }
        else  if(txtNombre.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa el Nombre","error",JOptionPane.ERROR_MESSAGE);
       }
        else  if(txtSisoperativo.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa el Os","error",JOptionPane.ERROR_MESSAGE);
       }
        else  if(txtMarca.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingrese la Marca","error",JOptionPane.ERROR_MESSAGE);
       }
        else  if(txtMemoria.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa la cantidad de memoria","error",JOptionPane.ERROR_MESSAGE);
       }
        else  if(txtPrecio.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa el Precio","error",JOptionPane.ERROR_MESSAGE);
       }
        else  if(txtCompa??ia.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa la Compa??ia","error",JOptionPane.ERROR_MESSAGE);          
       }
        else  if(txtColor.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa el Color","error",JOptionPane.ERROR_MESSAGE);
       }
        else  if(txtCantidadcamaras.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa la cantidad de camaras","error",JOptionPane.ERROR_MESSAGE);   
       }
        else  if(txtPulgadas.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa el tama??o de pulgadas","error",JOptionPane.ERROR_MESSAGE); 
       }
        else if(cbxDia.toString().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa un Dia","error",JOptionPane.ERROR_MESSAGE);
       }
        else if(cbxMes.toString().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingrese un Mes","error",JOptionPane.ERROR_MESSAGE);
       }
        else if(cbxAnio.toString().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingres un A??o","error",JOptionPane.ERROR_MESSAGE);
       }
        else  if(txtPixeles.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(null,"ingresa Pixeles","error",JOptionPane.ERROR_MESSAGE);   
       }
        try{
            
            dto.setIdcelular(Integer.parseInt(txtIdcelular.getText()));
            dto.setIdnumEmpleado(Integer.parseInt(txtIdnumEmpleado.getText()));
            dto.setIdcliente(Integer.parseInt(txtIdcliente.getText()));
            dto.setNombre(txtNombre.getText());
            dto.setSisoperativo(txtSisoperativo.getText());
            dto.setMarca(txtMarca.getText());
            dto.setMemoria(txtMemoria.getText());
            dto.setPrecio(Double.parseDouble(txtPrecio.getText()));
            dto.setCompa??ia(txtCompa??ia.getText());
            dto.setColor(txtColor.getText());
            dto.setCantidadcamaras(Integer.parseInt(txtCantidadcamaras.getText()));
            dto.setPulgadas(Integer.parseInt(txtPulgadas.getText()));
            //codigo para la FechaVenta
            String dia  = cbxDia.getSelectedItem().toString();
            String mes  = cbxMes.getSelectedItem().toString();
            String anio = cbxAnio.getSelectedItem().toString();
            SimpleDateFormat df = new SimpleDateFormat("dd-MMMMM-yyyyy");
            
            String fecha = dia + "-" + mes + "-" + anio;
            long Fecha = df.parse(fecha).getTime();
            Date fech = new Date(Fecha);
            dto.setFechaventa(fech);
            
            dto.setPixeles(txtPixeles.getText());
            Dl.crearrCELULAR(dto);
            JOptionPane.showMessageDialog(this, "Datos Agregados");
            vaciar();
           
            
        }catch (Exception e){
        }
    }//GEN-LAST:event_jButton1ActionPerformed
public void vaciar()
    {
      
        txtIdcelular.setText(null);
        txtIdnumEmpleado.setText(null);
        txtIdcliente.setText(null);
        txtNombre.setText(null);
        txtSisoperativo.setText(null);
        txtMarca.setText(null);
        txtMemoria.setText(null);
        txtPrecio.setText(null); 
        txtCompa??ia.setText(null);
        txtColor.setText(null);
        txtCantidadcamaras.setText(null);
        txtPulgadas.setText(null);
        cbxDia.setSelectedItem(null);
        cbxMes.setSelectedItem(null);
        cbxAnio.setSelectedItem(null);
        txtPixeles.setText(null);
    }

            
    private void txtIdcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdcelularActionPerformed

    private void txtIdnumEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdnumEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdnumEmpleadoActionPerformed

    private void txtIdclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdclienteActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtSisoperativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSisoperativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSisoperativoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemoriaActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCompa??iaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompa??iaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompa??iaActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtCantidadcamarasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadcamarasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadcamarasActionPerformed

    private void txtPulgadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulgadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulgadasActionPerformed

    private void txtPixelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPixelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPixelesActionPerformed

    private void txtIdcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdcelularKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "Ingresa Solo Numeros"); 
        }
    }//GEN-LAST:event_txtIdcelularKeyTyped

    private void txtIdnumEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdnumEmpleadoKeyTyped
        // TODO add your handling code here:
       char validar=evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "Ingresa Solo Numeros");  
        }
        
    }//GEN-LAST:event_txtIdnumEmpleadoKeyTyped

    private void txtIdclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdclienteKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "Ingresa Solo Numeros");  
        }
    }//GEN-LAST:event_txtIdclienteKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtSisoperativoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSisoperativoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSisoperativoKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
       char validar=evt.getKeyChar();
        if (Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Letras"); 
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtMemoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemoriaKeyTyped
      char validar=evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "Ingresa Solo Numeros");  
        }
    }//GEN-LAST:event_txtMemoriaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "Ingresa Solo Numeros");  
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCompa??iaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompa??iaKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Letras"); 
        }
    }//GEN-LAST:event_txtCompa??iaKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Letras"); 
        }
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtCantidadcamarasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadcamarasKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "Ingresa Solo Numeros");  
        }
    }//GEN-LAST:event_txtCantidadcamarasKeyTyped

    private void txtPixelesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPixelesKeyTyped
         
    }//GEN-LAST:event_txtPixelesKeyTyped

    private void txtPulgadasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPulgadasKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPulgadasKeyTyped

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JComboBox<String> cbxAnio;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtCantidadcamaras;
    private javax.swing.JFormattedTextField txtColor;
    private javax.swing.JFormattedTextField txtCompa??ia;
    private javax.swing.JFormattedTextField txtIdcelular;
    private javax.swing.JFormattedTextField txtIdcliente;
    private javax.swing.JFormattedTextField txtIdnumEmpleado;
    private javax.swing.JFormattedTextField txtMarca;
    private javax.swing.JFormattedTextField txtMemoria;
    private javax.swing.JFormattedTextField txtNombre;
    private javax.swing.JFormattedTextField txtPixeles;
    private javax.swing.JFormattedTextField txtPrecio;
    private javax.swing.JFormattedTextField txtPulgadas;
    private javax.swing.JFormattedTextField txtSisoperativo;
    // End of variables declaration//GEN-END:variables
}
