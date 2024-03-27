/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIproyecto.ventanasInterfaz;
import proyecto.hotel.*;
/**
 *
 * @author joseg
 */
public class ventanaBuscarreservas extends javax.swing.JFrame {
    public static Menu1Home vReservas;
    public static ArbolReservacion arbolReservacion = Menu1Home.arbolReservacion;
    /**
     * Creates new form ventanaBuscarreservas
     */
    public ventanaBuscarreservas(Menu1Home vReservas) {
        initComponents();
        this.vReservas=vReservas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVolver = new javax.swing.JButton();
        tiraAzul = new javax.swing.JLabel();
        cedulaLabel = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        CI = new javax.swing.JTextField();
        reservacionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextArea();
        fondoReservas = new javax.swing.JLabel();
        fondodeBlanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVolver.setBackground(new java.awt.Color(0, 153, 204));
        botonVolver.setText("Volver a menú");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, -1));

        tiraAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIproyecto/imagenesGUI/tiraAzul.png"))); // NOI18N
        tiraAzul.setText("jLabel1");
        tiraAzul.setPreferredSize(new java.awt.Dimension(210, 300));
        getContentPane().add(tiraAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, -1));

        cedulaLabel.setForeground(new java.awt.Color(0, 0, 0));
        cedulaLabel.setText("Cédula");
        getContentPane().add(cedulaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        botonBuscar.setBackground(new java.awt.Color(0, 153, 204));
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 70, -1));
        getContentPane().add(CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, -1));

        reservacionLabel.setForeground(new java.awt.Color(0, 0, 0));
        reservacionLabel.setText("Reservación");
        getContentPane().add(reservacionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        Salida.setColumns(20);
        Salida.setRows(5);
        jScrollPane1.setViewportView(Salida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        fondoReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIproyecto/imagenesGUI/reservaciones_1.png"))); // NOI18N
        fondoReservas.setText("jLabel1");
        getContentPane().add(fondoReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 390, -1));

        fondodeBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIproyecto/imagenesGUI/blanco.png"))); // NOI18N
        fondodeBlanco.setText("jLabel1");
        fondodeBlanco.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(fondodeBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 410, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if(!CI.getText().isBlank()){
            NodoReser cliente = arbolReservacion.buscar(CI.getText());
            if(cliente == null){
                Salida.setText("Esta Cedula no Existe en las reservas");
            }else{
                Salida.setText(cliente.getData().toString());
            }
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaBuscarreservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaBuscarreservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaBuscarreservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaBuscarreservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaBuscarreservas(vReservas).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CI;
    private javax.swing.JTextArea Salida;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JLabel fondoReservas;
    private javax.swing.JLabel fondodeBlanco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel reservacionLabel;
    private javax.swing.JLabel tiraAzul;
    // End of variables declaration//GEN-END:variables
}
