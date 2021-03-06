/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.imageio.*;
import javax.swing.JPanel;


/**
 *
 * @author Timo Frenzel
 */
public class MidgardCharGen extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image image;
    /**
     * Creates new form CharGenFrame
     */
    public MidgardCharGen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void initComponents() {

        backgroundPanel = new ImagePane();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        mainMenueBar = new javax.swing.JMenuBar();
        fileItem = new javax.swing.JMenu();
        newCharItem = new javax.swing.JMenuItem();
        loadCharItem = new javax.swing.JMenuItem();
        saveCharItem = new javax.swing.JMenuItem();
        printCharItem = new javax.swing.JMenuItem();
        helpItem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Midgard Charakter Generator");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        backgroundPanel.setBackground(new java.awt.Color(204, 204, 204));
        backgroundPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backgroundPanel.setMaximumSize(new java.awt.Dimension(880, 500));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(880, 500));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(880, 500));

        jComboBox1.setMaximumRowCount(50);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Auswählen" }));
        jComboBox1.removeAllItems();

        try {
            final InputStream inputStream = getClass().getResourceAsStream("/resources/textfiles/groups.txt");
            final InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //final List<String> list = new ArrayList<String>();
            while (bufferedReader.ready())
            {
                jComboBox1.addItem(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Abenteuergruppe");

        jLabel2.setText("Abenteuertyp");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Auswählen" }));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 320, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(483, Short.MAX_VALUE))
        );

        fileItem.setText("Datei");

        newCharItem.setText("Neuer Char");
        fileItem.add(newCharItem);

        loadCharItem.setText("Char laden");
        fileItem.add(loadCharItem);

        saveCharItem.setText("Char Speichern");
        fileItem.add(saveCharItem);

        printCharItem.setText("Char drucken");
        fileItem.add(printCharItem);

        mainMenueBar.add(fileItem);

        helpItem.setText("Hilfe");
        helpItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpItemMouseClicked(evt);
            }
        });
        mainMenueBar.add(helpItem);

        setJMenuBar(mainMenueBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void helpItemMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        if (getTitle().indexOf(" :: Hilfe") == -1) {
            setTitle(getTitle() + " :: Hilfe");            
        }
    }                                     

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:

        try {
            image = ImageIO.read(getClass().getResource("/resources/images/background.jpg"));
        }catch(IOException e) {
            e.printStackTrace();
        }   
    }                                 

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        //System.out.println(jComboBox1.getSelectedItem());
        //System.out.println(jComboBox1.getSelectedIndex());
        jComboBox2.removeAllItems();
        
        try {
            String filepath = "/resources/textfiles/types_" + jComboBox1.getSelectedIndex() + ".txt";
            
            //System.out.println(filepath);
            
            InputStream inputStream = getClass().getResourceAsStream(filepath);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //final List<String> list = new ArrayList<String>();
            while (bufferedReader.ready())
            {
                jComboBox2.addItem(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MidgardCharGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MidgardCharGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MidgardCharGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MidgardCharGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame CharGenFrame = new MidgardCharGen();
                CharGenFrame.setVisible(true);
            }
        });
    }
    
    private class ImagePane extends JPanel {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected void paintComponent(Graphics g) {
           super.paintComponents(g);
           if(image != null) {
              g.drawImage(image, 0, 0, this);
           }
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JMenu fileItem;
    private javax.swing.JMenu helpItem;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem loadCharItem;
    private javax.swing.JMenuBar mainMenueBar;
    private javax.swing.JMenuItem newCharItem;
    private javax.swing.JMenuItem printCharItem;
    private javax.swing.JMenuItem saveCharItem;
    // End of variables declaration                   
}
