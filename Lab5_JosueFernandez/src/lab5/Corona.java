package lab5;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javafx.scene.chart.PieChart;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Corona extends javax.swing.JFrame {

    ArrayList<Pais> paises = new ArrayList<>();
    ArrayList<Persona> hombres = new ArrayList<>();
    ArrayList<Persona> mujeres = new ArrayList<>();
    
    
    /**
     * Creates new form Corona
     */
    public Corona() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearPais = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bt_crearPais = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_nombrePais = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_himno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jdc_fundacion = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        bt_colorBandera = new javax.swing.JButton();
        bg_genero = new javax.swing.ButtonGroup();
        jd_crearPersona = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bt_crearPersona = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombrePersona = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_apellido = new javax.swing.JTextField();
        tf_nacionalidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sp_edad = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_vocacion = new javax.swing.JTextField();
        rb_masculino = new javax.swing.JRadioButton();
        rb_femenino = new javax.swing.JRadioButton();
        cb_titulo = new javax.swing.JCheckBox();
        cb_infectado = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_paises = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_infectados = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_admin = new javax.swing.JMenu();
        jm_agregar = new javax.swing.JMenu();
        jmi_cPais = new javax.swing.JMenuItem();
        jmi_cPersona = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jd_crearPais.setTitle("Crear Persona");
        jd_crearPais.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bt_crearPais.setBackground(new java.awt.Color(51, 51, 255));
        bt_crearPais.setText("Crear País");
        bt_crearPais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_crearPais.setBorderPainted(false);
        bt_crearPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearPaisActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel6.setText("Himno Nacional:");

        jLabel2.setText("Fecha de fundación:");

        jdc_fundacion.setDate(new Date());
        jdc_fundacion.setDateFormatString("dd / MM / yyyy");

        jLabel3.setText("Color de bandera:");

        bt_colorBandera.setBackground(new java.awt.Color(255, 0, 0));
        bt_colorBandera.setBorderPainted(false);
        bt_colorBandera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_colorBanderaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_nombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_himno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdc_fundacion, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(bt_colorBandera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(bt_crearPais, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_nombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jdc_fundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_himno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(bt_colorBandera, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(bt_crearPais)
                .addGap(45, 45, 45))
        );

        jd_crearPais.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 210));

        jd_crearPersona.setTitle("Crear Persona");
        jd_crearPersona.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));

        jPanel4.setBackground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bt_crearPersona.setBackground(new java.awt.Color(51, 51, 255));
        bt_crearPersona.setText("Crear Persona");
        bt_crearPersona.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_crearPersona.setBorderPainted(false);
        bt_crearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearPersonaActionPerformed(evt);
            }
        });

        jLabel7.setText("Nacionalidad:");

        jLabel8.setText("Nombre:");

        jLabel9.setText("Apellido:");

        jLabel10.setText("Edad:");

        sp_edad.setModel(new javax.swing.SpinnerNumberModel(20, 0, 135, 1));

        jLabel11.setText("Género:");

        jLabel12.setText("Vocación:");

        rb_masculino.setBackground(new java.awt.Color(255, 204, 0));
        bg_genero.add(rb_masculino);
        rb_masculino.setSelected(true);
        rb_masculino.setText("Masculino");

        rb_femenino.setBackground(new java.awt.Color(255, 204, 0));
        bg_genero.add(rb_femenino);
        rb_femenino.setText("Femenino");

        cb_titulo.setBackground(new java.awt.Color(255, 204, 0));
        cb_titulo.setText("Tiene título");

        cb_infectado.setBackground(new java.awt.Color(255, 204, 0));
        cb_infectado.setText("Está infectado de Coronavirus");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_femenino)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(cb_titulo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_infectado))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(tf_nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel9))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(tf_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(rb_masculino)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_vocacion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(bt_crearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(tf_vocacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_masculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_femenino)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_titulo)
                    .addComponent(cb_infectado))
                .addGap(18, 18, 18)
                .addComponent(bt_crearPersona)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jd_crearPersona.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Países");
        jt_paises.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_paises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_paisesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_paises);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Países");
        jt_infectados.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jt_infectados);

        jm_admin.setText("Administración");

        jm_agregar.setText("Crear");

        jmi_cPais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jmi_cPais.setText("Crear país");
        jmi_cPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cPaisActionPerformed(evt);
            }
        });
        jm_agregar.add(jmi_cPais);

        jmi_cPersona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jmi_cPersona.setText("Crear persona");
        jmi_cPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cPersonaActionPerformed(evt);
            }
        });
        jm_agregar.add(jmi_cPersona);

        jm_admin.add(jm_agregar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Agregar persona a un país");
        jm_admin.add(jMenuItem1);

        jMenuBar1.add(jm_admin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_cPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cPersonaActionPerformed
        crearPersona();
    }//GEN-LAST:event_jmi_cPersonaActionPerformed

    private void jt_paisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_paisesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_paisesMouseClicked

    private void bt_crearPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearPaisActionPerformed
        String nombrePais;
        String himnoNacional;
        Date fechaFundacion;
        Color colorBandera;
        
        try {
            
            nombrePais = tf_nombrePais.getText();
            himnoNacional = tf_himno.getText();
            fechaFundacion = jdc_fundacion.getDate();
            colorBandera = bt_colorBandera.getBackground();
            
            if(nombrePais.equals("")
                    || himnoNacional.equals("")){
                
                throw new Exception("No se ha ingresado uno o más campos.");
            }
            
            Pais p = new Pais(nombrePais, fechaFundacion, himnoNacional, colorBandera);
            
            paises.add(p);
            
            tf_nombrePais.setText("");
            tf_himno.setText("");
            bt_colorBandera.setBackground(Color.red);
            jdc_fundacion.setDate(new Date());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "HA ocurrido un error al crear una persona.", "Eror", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bt_crearPaisActionPerformed

    private void bt_crearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearPersonaActionPerformed
        String nacionalidad;
        String nombrePersona;
        String apellido;
        int edad;
        String genero;
        String vocacion;
        boolean tieneTitulo;
        boolean infectadoCorona;
        
        try {
            
            
            
            nacionalidad = tf_nacionalidad.getText();
            nombrePersona = tf_nombrePais.getText();
            apellido = tf_apellido.getText();
            edad = Integer.parseInt(sp_edad.getValue().toString());
            genero = (rb_masculino.isSelected()) ? "Masculino" : "Femenino" ;
            vocacion = tf_himno.getText();
            tieneTitulo = cb_titulo.isSelected();
            infectadoCorona = cb_infectado.isSelected();
            
            if(nacionalidad.equals("") 
                    || nombrePersona.equals("")
                    || apellido.equals("")
                    || vocacion.equals("")){
                
                throw new Exception("No se ha ingresado uno o más campos.");
                
            }
            
            Persona p = new Persona(nacionalidad, nombrePersona, apellido, edad, genero, vocacion, tieneTitulo, infectadoCorona);
            
            if(rb_masculino.isSelected()){
                
                hombres.add(p);
                
            } else {
                
                mujeres.add(p);
                
            }
            
            tf_nacionalidad.setText("");
            tf_nombrePais.setText("");
            tf_apellido.setText("");
            sp_edad.setValue(20);
            rb_masculino.setSelected(true);
            tf_himno.setText("");
            cb_titulo.setSelected(false);
            cb_infectado.setSelected(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "HA ocurrido un error al crear una persona.", "Eror", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bt_crearPersonaActionPerformed

    private void bt_colorBanderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_colorBanderaActionPerformed
        bt_colorBandera.setBackground(
                JColorChooser.showDialog(this, "Color de la bandera", Color.red)
        );
    }//GEN-LAST:event_bt_colorBanderaActionPerformed

    private void jmi_cPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cPaisActionPerformed
        crearPais();
    }//GEN-LAST:event_jmi_cPaisActionPerformed

    private void crearPersona(){
        jd_crearPersona.pack();
        jd_crearPersona.setModal(true);
        jd_crearPersona.setLocationRelativeTo(this);
        jd_crearPersona.setVisible(true);
    }
    
    private void crearPais(){
        jd_crearPais.pack();
        jd_crearPais.setModal(true);
        jd_crearPais.setLocationRelativeTo(this);
        jd_crearPais.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(Corona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Corona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Corona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Corona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Corona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_genero;
    private javax.swing.JButton bt_colorBandera;
    private javax.swing.JButton bt_crearPais;
    private javax.swing.JButton bt_crearPersona;
    private javax.swing.JCheckBox cb_infectado;
    private javax.swing.JCheckBox cb_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_crearPais;
    private javax.swing.JDialog jd_crearPersona;
    private com.toedter.calendar.JDateChooser jdc_fundacion;
    private javax.swing.JMenu jm_admin;
    private javax.swing.JMenu jm_agregar;
    private javax.swing.JMenuItem jmi_cPais;
    private javax.swing.JMenuItem jmi_cPersona;
    private javax.swing.JTree jt_infectados;
    private javax.swing.JTree jt_paises;
    private javax.swing.JRadioButton rb_femenino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_himno;
    private javax.swing.JTextField tf_nacionalidad;
    private javax.swing.JTextField tf_nombrePais;
    private javax.swing.JTextField tf_nombrePersona;
    private javax.swing.JTextField tf_vocacion;
    // End of variables declaration//GEN-END:variables
}
