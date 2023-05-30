/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Conexion.Conexion;
import Controlador.AlumnoData;
import Modelo.Alumno;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author carlo
 */
public class FormAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormAlumno
     */
    private AlumnoData alumnoData;
                
    public FormAlumno() {
        initComponents();
        
        alumnoData = new AlumnoData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlumnoTitulo = new javax.swing.JLabel();
        lblAlumnoDni = new javax.swing.JLabel();
        lblAlumnoNombre = new javax.swing.JLabel();
        lblAlumnoFecha = new javax.swing.JLabel();
        lblAlumnoActivo = new javax.swing.JLabel();
        txtAlumnoDni = new javax.swing.JTextField();
        txtAlumnoNombre = new javax.swing.JTextField();
        txtAlumnoFecha = new javax.swing.JTextField();
        btnAlumnoBuscarId = new javax.swing.JButton();
        btnAlumnoGuardar = new javax.swing.JButton();
        btnAlumnoBorrar = new javax.swing.JButton();
        btnAlumnoActualizar = new javax.swing.JButton();
        btnAlumnoLimpiar = new javax.swing.JButton();
        lblAlumnoApellido = new javax.swing.JLabel();
        txtAlumnoApellido = new javax.swing.JTextField();
        lblAlumnoId = new javax.swing.JLabel();
        txtAlumnoId = new javax.swing.JTextField();
        lblAlumnoEstado = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblAlumnoTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAlumnoTitulo.setText("Formulario Alumnos");

        lblAlumnoDni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAlumnoDni.setText("DNI:");

        lblAlumnoNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAlumnoNombre.setText("Nombre:");

        lblAlumnoFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAlumnoFecha.setText("Fecha de nac:");

        lblAlumnoActivo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAlumnoActivo.setText("Estado:");

        txtAlumnoDni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtAlumnoNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtAlumnoFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAlumnoBuscarId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAlumnoBuscarId.setText("Buscar por Id");
        btnAlumnoBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnoBuscarIdActionPerformed(evt);
            }
        });

        btnAlumnoGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAlumnoGuardar.setText("Guardar");
        btnAlumnoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnoGuardarActionPerformed(evt);
            }
        });

        btnAlumnoBorrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAlumnoBorrar.setText("Borrar");
        btnAlumnoBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnoBorrarActionPerformed(evt);
            }
        });

        btnAlumnoActualizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAlumnoActualizar.setText("Actualizar");
        btnAlumnoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnoActualizarActionPerformed(evt);
            }
        });

        btnAlumnoLimpiar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAlumnoLimpiar.setText("Limpiar");
        btnAlumnoLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnoLimpiarActionPerformed(evt);
            }
        });

        lblAlumnoApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAlumnoApellido.setText("Apellido:");

        txtAlumnoApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblAlumnoId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAlumnoId.setText("Id de Alumno:");

        txtAlumnoId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblAlumnoEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAlumnoEstado.setText("                       ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lblAlumnoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAlumnoId)
                                            .addGap(73, 73, 73)
                                            .addComponent(txtAlumnoId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAlumnoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(109, 109, 109)
                                            .addComponent(txtAlumnoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblAlumnoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblAlumnoApellido)
                                                .addComponent(lblAlumnoNombre))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(63, 63, 63)
                                                    .addComponent(txtAlumnoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(63, 63, 63)
                                                    .addComponent(txtAlumnoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(lblAlumnoActivo))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAlumnoEstado)
                                        .addComponent(txtAlumnoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)
                                .addComponent(btnAlumnoBuscarId))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAlumnoGuardar)
                                .addGap(46, 46, 46)
                                .addComponent(btnAlumnoBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnAlumnoActualizar)
                                .addGap(44, 44, 44)
                                .addComponent(btnAlumnoLimpiar)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblAlumnoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumnoId)
                    .addComponent(txtAlumnoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumnoBuscarId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumnoDni)
                    .addComponent(txtAlumnoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumnoApellido)
                    .addComponent(txtAlumnoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumnoNombre)
                    .addComponent(txtAlumnoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumnoFecha)
                    .addComponent(txtAlumnoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumnoActivo)
                    .addComponent(lblAlumnoEstado))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlumnoGuardar)
                    .addComponent(btnAlumnoBorrar)
                    .addComponent(btnAlumnoActualizar)
                    .addComponent(btnAlumnoLimpiar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoActualizarActionPerformed
        // TODO add your handling code here:
        if(txtAlumnoId.getText()!=null){
            int id = Integer.parseInt(txtAlumnoId.getText());
            int dni = Integer.parseInt(txtAlumnoDni.getText());
            String apellido = txtAlumnoApellido.getText();
            String nombre = txtAlumnoNombre.getText();
            LocalDate fechaNacimiento = LocalDate.parse(txtAlumnoFecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String activo = lblAlumnoEstado.getText();
            boolean estado;            
            if ("Activo".equals(activo)){
                estado = true;
            }else{
                estado = false;
            }
            Alumno alumno = new Alumno(id, dni, apellido, nombre, fechaNacimiento, estado);
            alumnoData.modificarAlumno(alumno);
        }
        
    }//GEN-LAST:event_btnAlumnoActualizarActionPerformed

    private void btnAlumnoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoGuardarActionPerformed
        
        int dni = Integer.parseInt(txtAlumnoDni.getText());
        String apellido = txtAlumnoApellido.getText();
        String nombre = txtAlumnoNombre.getText();
        LocalDate fechaNacimiento = LocalDate.parse(txtAlumnoFecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        boolean estado = true;
        Alumno alumno = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
        alumnoData.guardarAlumno(alumno);
        txtAlumnoId.setText(alumno.getIdAlumno()+"");
        lblAlumnoEstado.setText("Activo");
    }//GEN-LAST:event_btnAlumnoGuardarActionPerformed

    private void btnAlumnoBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoBorrarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtAlumnoId.getText());
        alumnoData.eliminarAlumno(id);
    }//GEN-LAST:event_btnAlumnoBorrarActionPerformed

    private void btnAlumnoLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoLimpiarActionPerformed
        // TODO add your handling code here:
        txtAlumnoId.setText("");
        txtAlumnoDni.setText("");
        txtAlumnoApellido.setText("");
        txtAlumnoNombre.setText("");
        txtAlumnoFecha.setText("");
        lblAlumnoEstado.setText("");
    }//GEN-LAST:event_btnAlumnoLimpiarActionPerformed

    private void btnAlumnoBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoBuscarIdActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtAlumnoId.getText());
        Alumno alumno = alumnoData.buscarAlumno(id);
        if(alumno!=null){
            txtAlumnoId.setText(alumno.getIdAlumno()+"");
            txtAlumnoDni.setText(alumno.getDni()+"");
            txtAlumnoApellido.setText(alumno.getApellido());
            txtAlumnoNombre.setText(alumno.getNombre());
            txtAlumnoFecha.setText(alumno.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            if (alumno.isEstado()==true){
                lblAlumnoEstado.setText("Activo");
            }else if (alumno.isEstado()==false){
                lblAlumnoEstado.setText("Inactivo");
            }
        }
    }//GEN-LAST:event_btnAlumnoBuscarIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumnoActualizar;
    private javax.swing.JButton btnAlumnoBorrar;
    private javax.swing.JButton btnAlumnoBuscarId;
    private javax.swing.JButton btnAlumnoGuardar;
    private javax.swing.JButton btnAlumnoLimpiar;
    private javax.swing.JLabel lblAlumnoActivo;
    private javax.swing.JLabel lblAlumnoApellido;
    private javax.swing.JLabel lblAlumnoDni;
    private javax.swing.JLabel lblAlumnoEstado;
    private javax.swing.JLabel lblAlumnoFecha;
    private javax.swing.JLabel lblAlumnoId;
    private javax.swing.JLabel lblAlumnoNombre;
    private javax.swing.JLabel lblAlumnoTitulo;
    private javax.swing.JTextField txtAlumnoApellido;
    private javax.swing.JTextField txtAlumnoDni;
    private javax.swing.JTextField txtAlumnoFecha;
    private javax.swing.JTextField txtAlumnoId;
    private javax.swing.JTextField txtAlumnoNombre;
    // End of variables declaration//GEN-END:variables
}