/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.HangmanUI;

/**
 *
 * @author Bad and Boujee
 */
public class HighScoresScreen extends javax.swing.JFrame {

    /**
     * Creates new form HighScoresScreen
     */
    public HighScoresScreen() {
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

        jPanel1 = new javax.swing.JPanel();
        highScores = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        highScore1 = new javax.swing.JLabel();
        highScoreValue1 = new javax.swing.JLabel();
        separator1 = new javax.swing.JLabel();
        highScore2 = new javax.swing.JLabel();
        separator2 = new javax.swing.JLabel();
        highScoreValue2 = new javax.swing.JLabel();
        highScore3 = new javax.swing.JLabel();
        highScore4 = new javax.swing.JLabel();
        highScore5 = new javax.swing.JLabel();
        separator3 = new javax.swing.JLabel();
        separator4 = new javax.swing.JLabel();
        separator5 = new javax.swing.JLabel();
        highScoreValue3 = new javax.swing.JLabel();
        highScoreValue4 = new javax.swing.JLabel();
        highScoreValue5 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        highScores.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        highScores.setForeground(new java.awt.Color(255, 0, 51));
        highScores.setText("High Scores");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        highScore1.setForeground(new java.awt.Color(255, 255, 255));
        highScore1.setText("ABC");

        highScoreValue1.setForeground(new java.awt.Color(255, 255, 255));
        highScoreValue1.setText("000000");

        separator1.setForeground(new java.awt.Color(255, 255, 255));
        separator1.setText("...........");

        highScore2.setForeground(new java.awt.Color(255, 255, 255));
        highScore2.setText("ABC");

        separator2.setForeground(new java.awt.Color(255, 255, 255));
        separator2.setText("...........");

        highScoreValue2.setForeground(new java.awt.Color(255, 255, 255));
        highScoreValue2.setText("000000");

        highScore3.setForeground(new java.awt.Color(255, 255, 255));
        highScore3.setText("ABC");

        highScore4.setForeground(new java.awt.Color(255, 255, 255));
        highScore4.setText("ABC");

        highScore5.setForeground(new java.awt.Color(255, 255, 255));
        highScore5.setText("ABC");

        separator3.setForeground(new java.awt.Color(255, 255, 255));
        separator3.setText("...........");

        separator4.setForeground(new java.awt.Color(255, 255, 255));
        separator4.setText("...........");

        separator5.setForeground(new java.awt.Color(255, 255, 255));
        separator5.setText("...........");

        highScoreValue3.setForeground(new java.awt.Color(255, 255, 255));
        highScoreValue3.setText("000000");

        highScoreValue4.setForeground(new java.awt.Color(255, 255, 255));
        highScoreValue4.setText("000000");

        highScoreValue5.setForeground(new java.awt.Color(255, 255, 255));
        highScoreValue5.setText("000000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(highScore1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(highScoreValue1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(highScore2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(highScoreValue2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(highScore5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(highScoreValue5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(highScore3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(highScoreValue3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(highScore4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(highScoreValue4)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highScore1)
                    .addComponent(highScoreValue1)
                    .addComponent(separator1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highScore2)
                    .addComponent(separator2)
                    .addComponent(highScoreValue2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highScore3)
                    .addComponent(separator3)
                    .addComponent(highScoreValue3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highScore4)
                    .addComponent(separator4)
                    .addComponent(highScoreValue4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highScore5)
                    .addComponent(separator5)
                    .addComponent(highScoreValue5))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(highScores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(highScores)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        MainScreen ms = new MainScreen();
        ms.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(HighScoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HighScoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HighScoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HighScoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HighScoresScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel highScore1;
    private javax.swing.JLabel highScore2;
    private javax.swing.JLabel highScore3;
    private javax.swing.JLabel highScore4;
    private javax.swing.JLabel highScore5;
    private javax.swing.JLabel highScoreValue1;
    private javax.swing.JLabel highScoreValue2;
    private javax.swing.JLabel highScoreValue3;
    private javax.swing.JLabel highScoreValue4;
    private javax.swing.JLabel highScoreValue5;
    private javax.swing.JLabel highScores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel separator1;
    private javax.swing.JLabel separator2;
    private javax.swing.JLabel separator3;
    private javax.swing.JLabel separator4;
    private javax.swing.JLabel separator5;
    // End of variables declaration//GEN-END:variables
}
