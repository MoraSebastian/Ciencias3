/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import Logica.construccion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author NATA
 */
public class Inicio extends javax.swing.JFrame {
    
    construccion con = new construccion();
    String resp;
    Respuesta resultado;
    
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo.jpg")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBLimpiar1 = new javax.swing.JButton();
        JBSalir1 = new javax.swing.JButton();
        JPNuevo1 = new javax.swing.JPanel();
        JLTextoNuevo2 = new javax.swing.JLabel();
        JLTextoNuevo3 = new javax.swing.JLabel();
        JLEjemplo1 = new javax.swing.JLabel();
        JTFNuevo1 = new javax.swing.JTextField();
        JBCrearNuevo1 = new javax.swing.JButton();
        JPInPre1 = new javax.swing.JPanel();
        JLTextoPre2 = new javax.swing.JLabel();
        JLTextoPre3 = new javax.swing.JLabel();
        JTFRPreorden1 = new javax.swing.JTextField();
        JTFRInortenPRE1 = new javax.swing.JTextField();
        JBCrearInPre1 = new javax.swing.JButton();
        JTPContenido = new javax.swing.JTabbedPane();
        JPNuevo = new javax.swing.JPanel();
        JLTextoNuevo = new javax.swing.JLabel();
        JLTextoNuevo1 = new javax.swing.JLabel();
        JLEjemplo = new javax.swing.JLabel();
        JTFNuevo = new javax.swing.JTextField();
        JBCrearNuevo = new javax.swing.JButton();
        JBLimpiar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JPInPre = new javax.swing.JPanel();
        JLTextoPre = new javax.swing.JLabel();
        JLTextoPre1 = new javax.swing.JLabel();
        JTFRPreorden = new javax.swing.JTextField();
        JTFRInortenPRE = new javax.swing.JTextField();
        JBCrearInPre = new javax.swing.JButton();
        JBLimpiar3 = new javax.swing.JButton();
        JBSalir3 = new javax.swing.JButton();
        JPInPos = new javax.swing.JPanel();
        JLTextoPos = new javax.swing.JLabel();
        JTFRPosorden = new javax.swing.JTextField();
        JLTextoPos1 = new javax.swing.JLabel();
        JTFRInortenPos = new javax.swing.JTextField();
        JBCrearInPos = new javax.swing.JButton();
        JBLimpiar2 = new javax.swing.JButton();
        JBSalir2 = new javax.swing.JButton();

        JBLimpiar1.setBackground(new java.awt.Color(255, 255, 255));
        JBLimpiar1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBLimpiar1.setText("Limpiar");
        JBLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiar1ActionPerformed(evt);
            }
        });

        JBSalir1.setBackground(new java.awt.Color(255, 255, 255));
        JBSalir1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBSalir1.setText("Salir");
        JBSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalir1ActionPerformed(evt);
            }
        });

        JPNuevo1.setBackground(new java.awt.Color(255, 255, 255));

        JLTextoNuevo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTextoNuevo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLTextoNuevo2.setText("Ingrese la lista de datos que desea poner en el árbol, separado");

        JLTextoNuevo3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTextoNuevo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLTextoNuevo3.setText("por comas:");

        JLEjemplo1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JLEjemplo1.setText("Ejemplo: 8,12,6,4,3");

        JTFNuevo1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JTFNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNuevo1ActionPerformed(evt);
            }
        });

        JBCrearNuevo1.setBackground(new java.awt.Color(255, 255, 255));
        JBCrearNuevo1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBCrearNuevo1.setText("Crear");
        JBCrearNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCrearNuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPNuevo1Layout = new javax.swing.GroupLayout(JPNuevo1);
        JPNuevo1.setLayout(JPNuevo1Layout);
        JPNuevo1Layout.setHorizontalGroup(
            JPNuevo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNuevo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPNuevo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLTextoNuevo2)
                    .addComponent(JLTextoNuevo3)
                    .addGroup(JPNuevo1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(JPNuevo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLEjemplo1)
                            .addGroup(JPNuevo1Layout.createSequentialGroup()
                                .addComponent(JTFNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(JBCrearNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPNuevo1Layout.setVerticalGroup(
            JPNuevo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNuevo1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(JLTextoNuevo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLTextoNuevo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLEjemplo1)
                .addGap(18, 18, 18)
                .addGroup(JPNuevo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCrearNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(189, 189, 189))
        );

        JPInPre1.setBackground(new java.awt.Color(255, 255, 255));

        JLTextoPre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTextoPre2.setText("Ingrese el recorrido en Preorden:");

        JLTextoPre3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTextoPre3.setText("Ingrese el recorrido en Inorden:");

        JTFRPreorden1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        JTFRInortenPRE1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        JBCrearInPre1.setBackground(new java.awt.Color(255, 255, 255));
        JBCrearInPre1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBCrearInPre1.setText("Crear");
        JBCrearInPre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCrearInPre1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPInPre1Layout = new javax.swing.GroupLayout(JPInPre1);
        JPInPre1.setLayout(JPInPre1Layout);
        JPInPre1Layout.setHorizontalGroup(
            JPInPre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInPre1Layout.createSequentialGroup()
                .addGroup(JPInPre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTFRInortenPRE1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPInPre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPInPre1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(JPInPre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JLTextoPre3)
                                .addComponent(JLTextoPre2)))
                        .addGroup(JPInPre1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(JTFRPreorden1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(JBCrearInPre1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPInPre1Layout.setVerticalGroup(
            JPInPre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInPre1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(JLTextoPre2)
                .addGap(18, 18, 18)
                .addComponent(JTFRPreorden1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(JPInPre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLTextoPre3)
                    .addComponent(JBCrearInPre1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JTFRInortenPRE1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arboles");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(300, 100, 480, 460));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Inicio"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        JTPContenido.setBackground(new java.awt.Color(255, 255, 255));
        JTPContenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTPContenido.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        JPNuevo.setBackground(new java.awt.Color(255, 255, 255));

        JLTextoNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTextoNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLTextoNuevo.setText("Ingrese la lista de datos que desea poner en el árbol, separado");

        JLTextoNuevo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTextoNuevo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLTextoNuevo1.setText("por comas:");

        JLEjemplo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JLEjemplo.setText("Ejemplo: 8,12,6,4,3");

        JTFNuevo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JTFNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNuevoActionPerformed(evt);
            }
        });

        JBCrearNuevo.setBackground(new java.awt.Color(255, 255, 255));
        JBCrearNuevo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBCrearNuevo.setText("Crear");
        JBCrearNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCrearNuevoActionPerformed(evt);
            }
        });

        JBLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        JBLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBLimpiar.setText("Limpiar");
        JBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarActionPerformed(evt);
            }
        });

        JBSalir.setBackground(new java.awt.Color(255, 255, 255));
        JBSalir.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPNuevoLayout = new javax.swing.GroupLayout(JPNuevo);
        JPNuevo.setLayout(JPNuevoLayout);
        JPNuevoLayout.setHorizontalGroup(
            JPNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLTextoNuevo)
                    .addComponent(JLTextoNuevo1)
                    .addGroup(JPNuevoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(JPNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLEjemplo)
                            .addGroup(JPNuevoLayout.createSequentialGroup()
                                .addGroup(JPNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(JPNuevoLayout.createSequentialGroup()
                                        .addComponent(JBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JTFNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(JBCrearNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPNuevoLayout.setVerticalGroup(
            JPNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNuevoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(JLTextoNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLTextoNuevo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLEjemplo)
                .addGap(18, 18, 18)
                .addGroup(JPNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCrearNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(JPNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBLimpiar)
                    .addComponent(JBSalir))
                .addContainerGap())
        );

        JTPContenido.addTab("Nuevo", JPNuevo);

        JPInPre.setBackground(new java.awt.Color(255, 255, 255));

        JLTextoPre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTextoPre.setText("Ingrese el recorrido en Preorden:");

        JLTextoPre1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTextoPre1.setText("Ingrese el recorrido en Inorden:");

        JTFRPreorden.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        JTFRInortenPRE.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        JBCrearInPre.setBackground(new java.awt.Color(255, 255, 255));
        JBCrearInPre.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBCrearInPre.setText("Crear");
        JBCrearInPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCrearInPreActionPerformed(evt);
            }
        });

        JBLimpiar3.setBackground(new java.awt.Color(255, 255, 255));
        JBLimpiar3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBLimpiar3.setText("Limpiar");
        JBLimpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiar3ActionPerformed(evt);
            }
        });

        JBSalir3.setBackground(new java.awt.Color(255, 255, 255));
        JBSalir3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBSalir3.setText("Salir");
        JBSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPInPreLayout = new javax.swing.GroupLayout(JPInPre);
        JPInPre.setLayout(JPInPreLayout);
        JPInPreLayout.setHorizontalGroup(
            JPInPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInPreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPInPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLTextoPre)
                    .addGroup(JPInPreLayout.createSequentialGroup()
                        .addComponent(JLTextoPre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(JBCrearInPre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(JPInPreLayout.createSequentialGroup()
                .addGroup(JPInPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTFRInortenPRE, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPInPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPInPreLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(JBLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(JBSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPInPreLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(JTFRPreorden, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPInPreLayout.setVerticalGroup(
            JPInPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInPreLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(JLTextoPre)
                .addGap(18, 18, 18)
                .addComponent(JTFRPreorden, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(JPInPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLTextoPre1)
                    .addComponent(JBCrearInPre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JTFRInortenPRE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(JPInPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBLimpiar3)
                    .addComponent(JBSalir3))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        JTPContenido.addTab("Inorden-Preorden", JPInPre);

        JPInPos.setBackground(new java.awt.Color(255, 255, 255));

        JLTextoPos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTextoPos.setText("Ingrese el recorrido en Posorden:");

        JTFRPosorden.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        JLTextoPos1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTextoPos1.setText("Ingrese el recorrido en Inorden:");

        JTFRInortenPos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        JBCrearInPos.setBackground(new java.awt.Color(255, 255, 255));
        JBCrearInPos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBCrearInPos.setText("Crear");
        JBCrearInPos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBCrearInPos.setBorderPainted(false);
        JBCrearInPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCrearInPosActionPerformed(evt);
            }
        });

        JBLimpiar2.setBackground(new java.awt.Color(255, 255, 255));
        JBLimpiar2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBLimpiar2.setText("Limpiar");
        JBLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiar2ActionPerformed(evt);
            }
        });

        JBSalir2.setBackground(new java.awt.Color(255, 255, 255));
        JBSalir2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JBSalir2.setText("Salir");
        JBSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPInPosLayout = new javax.swing.GroupLayout(JPInPos);
        JPInPos.setLayout(JPInPosLayout);
        JPInPosLayout.setHorizontalGroup(
            JPInPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInPosLayout.createSequentialGroup()
                .addGroup(JPInPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPInPosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JTFRInortenPos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPInPosLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(JTFRPosorden, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JPInPosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(JPInPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPInPosLayout.createSequentialGroup()
                        .addComponent(JBLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(JBSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPInPosLayout.createSequentialGroup()
                        .addComponent(JLTextoPos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPInPosLayout.createSequentialGroup()
                        .addComponent(JLTextoPos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(JBCrearInPos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        JPInPosLayout.setVerticalGroup(
            JPInPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInPosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(JLTextoPos)
                .addGap(18, 18, 18)
                .addComponent(JTFRPosorden, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(JPInPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLTextoPos1)
                    .addComponent(JBCrearInPos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JTFRInortenPos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(JPInPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBLimpiar2)
                    .addComponent(JBSalir2))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        JTPContenido.addTab("Inorden-Posorden", JPInPos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTPContenido, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTPContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBLimpiar1ActionPerformed

    private void JBSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBSalir1ActionPerformed

    private void JTFNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNuevo1ActionPerformed

    private void JBCrearNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCrearNuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBCrearNuevo1ActionPerformed

    private void JBCrearInPre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCrearInPre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBCrearInPre1ActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarActionPerformed
        // TODO add your handling code here:
        con.eliminar();
        JTFNuevo.setText(null);
        JTFRInortenPRE.setText(null);
        JTFRInortenPos.setText(null);
        JTFRPosorden.setText(null);
        JTFRPreorden.setText(null);
        //System.out.println("limpiado");
    }//GEN-LAST:event_JBLimpiarActionPerformed

    private void JBCrearInPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCrearInPosActionPerformed
        // TODO add your handling code here:
        //System.out.println("in: "+JTFRInortenPos.getText());
        //System.out.println("pos: "+JTFRPosorden.getText());
        resp = con.recInPos(JTFRInortenPos.getText(), JTFRPosorden.getText());
        if(resp!=null){
            JOptionPane.showMessageDialog(null, resp, "Error", 1);
        }else{
            resultado = new Respuesta();
            resultado.pintarResultado(con);
            resultado.setVisible(true);
        }
    }//GEN-LAST:event_JBCrearInPosActionPerformed

    private void JBCrearInPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCrearInPreActionPerformed
        // TODO add your handling code here:
        //System.out.println("in: "+JTFRInortenPRE.getText());
        //System.out.println("pre: "+JTFRPreorden.getText());
        resp = con.recInPre(JTFRInortenPRE.getText(), JTFRPreorden.getText());
        if(resp!=null){
            JOptionPane.showMessageDialog(null, resp, "Error", 1);
        }else{
            resultado = new Respuesta();
            resultado.pintarResultado(con);
            resultado.setVisible(true);
        }
    }//GEN-LAST:event_JBCrearInPreActionPerformed

    private void JBCrearNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCrearNuevoActionPerformed
        // TODO add your handling code here:
        //System.out.println(JTFNuevo.getText());
        resp = con.construccionCero(JTFNuevo.getText());
        if(resp!=null){
            JOptionPane.showMessageDialog(null, resp, "Error", 1);
        }else{
            resultado = new Respuesta();
            resultado.pintarResultado(con);
            resultado.setVisible(true);
        }

    }//GEN-LAST:event_JBCrearNuevoActionPerformed

    private void JTFNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNuevoActionPerformed

    private void JBLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiar2ActionPerformed
        // TODO add your handling code here:
        con.eliminar();
        JTFNuevo.setText(null);
        JTFRInortenPRE.setText(null);
        JTFRInortenPos.setText(null);
        JTFRPosorden.setText(null);
        JTFRPreorden.setText(null);
    }//GEN-LAST:event_JBLimpiar2ActionPerformed

    private void JBSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalir2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JBSalir2ActionPerformed

    private void JBLimpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiar3ActionPerformed
        // TODO add your handling code here:
        con.eliminar();
        JTFNuevo.setText(null);
        JTFRInortenPRE.setText(null);
        JTFRInortenPos.setText(null);
        JTFRPosorden.setText(null);
        JTFRPreorden.setText(null);
    }//GEN-LAST:event_JBLimpiar3ActionPerformed

    private void JBSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalir3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JBSalir3ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCrearInPos;
    private javax.swing.JButton JBCrearInPre;
    private javax.swing.JButton JBCrearInPre1;
    private javax.swing.JButton JBCrearNuevo;
    private javax.swing.JButton JBCrearNuevo1;
    private javax.swing.JButton JBLimpiar;
    private javax.swing.JButton JBLimpiar1;
    private javax.swing.JButton JBLimpiar2;
    private javax.swing.JButton JBLimpiar3;
    private javax.swing.JButton JBSalir;
    private javax.swing.JButton JBSalir1;
    private javax.swing.JButton JBSalir2;
    private javax.swing.JButton JBSalir3;
    private javax.swing.JLabel JLEjemplo;
    private javax.swing.JLabel JLEjemplo1;
    private javax.swing.JLabel JLTextoNuevo;
    private javax.swing.JLabel JLTextoNuevo1;
    private javax.swing.JLabel JLTextoNuevo2;
    private javax.swing.JLabel JLTextoNuevo3;
    private javax.swing.JLabel JLTextoPos;
    private javax.swing.JLabel JLTextoPos1;
    private javax.swing.JLabel JLTextoPre;
    private javax.swing.JLabel JLTextoPre1;
    private javax.swing.JLabel JLTextoPre2;
    private javax.swing.JLabel JLTextoPre3;
    private javax.swing.JPanel JPInPos;
    private javax.swing.JPanel JPInPre;
    private javax.swing.JPanel JPInPre1;
    private javax.swing.JPanel JPNuevo;
    private javax.swing.JPanel JPNuevo1;
    private javax.swing.JTextField JTFNuevo;
    private javax.swing.JTextField JTFNuevo1;
    private javax.swing.JTextField JTFRInortenPRE;
    private javax.swing.JTextField JTFRInortenPRE1;
    private javax.swing.JTextField JTFRInortenPos;
    private javax.swing.JTextField JTFRPosorden;
    private javax.swing.JTextField JTFRPreorden;
    private javax.swing.JTextField JTFRPreorden1;
    private javax.swing.JTabbedPane JTPContenido;
    // End of variables declaration//GEN-END:variables
}