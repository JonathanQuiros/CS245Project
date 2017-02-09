/***************************************************************
* file: ColorGame.java
* author: Bad and Boujee
* class: CS 245 – GUI Development
*
* assignment: program 1.1
* date last modified: 1/25/17
*
* purpose: This program creates a hangman game that randomly selects a word
* unknown to the user and allows the user to guess the word letter by letter,
* applying penalties where necessary.
*
****************************************************************/ 
package my.HangmanUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

//Creates an instance of the game
public class ColorGame extends javax.swing.JFrame implements MouseListener{

    //These variables are used for the mouseListener to determine whether or not
    //points should be awarded to the user
    Ellipse2D ellipse;
    Ellipse2D[] ellipses = new Ellipse2D[5];
    Color[] colorIndicator = new Color[5];
    Color labelColorIndicator;
    
    //These variables are used for the creation and coloring of the circles and 
    //the colored string
    static Random gen = new Random();
    int x = 0, y = 0, color = 0;
    String[] labelColors = {"red", "yellow", "green", "blue", "magenta"};
    String labelColor = "";
    int j = 0;
    
    //These variables keep score and keep track of how many times the game has
    //been displayed
    int points = 0, gameTracker = 0;
    
    static int score = HangmanGame.points + 100;
    
    /**
     * Creates new form ColorGame
     */
    public ColorGame() {
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

        timeDisplay = new javax.swing.JTextField();
        colorLable = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scoreDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        timeDisplay.setEditable(false);
        Thread clock = new Thread(){
            public void run(){
                try{
                    while(true){
                        Calendar calendar = new GregorianCalendar();
                        String hourZ = "", minZ = "", secZ = "";

                        int day = calendar.get(Calendar.DAY_OF_MONTH);

                        int month = calendar.get(Calendar.MONTH);
                        ++month;

                        int year = calendar.get(Calendar.YEAR);

                        int hour = calendar.get(Calendar.HOUR);
                        if(hour == 0)
                        hour = 12;

                        if(hour < 10)
                        hourZ = "0";

                        int minute = calendar.get(Calendar.MINUTE);
                        if(minute < 10)
                        minZ = "0";

                        int second = calendar.get(Calendar.SECOND);
                        if(second < 10)
                        secZ = "0";

                        timeDisplay.setText((month) + "/" + day + "/" + year + "  " + hourZ + hour + ":" + minZ + minute + ":" + secZ + second);
                        sleep(1000);
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        clock.start();

        colorLable.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        colorLable.setForeground(new java.awt.Color(255, 255, 255));
        colorLable.setText("jLabel1");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel1.setText("Score:");

        scoreDisplay.setEditable(false);
        scoreDisplay.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(scoreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(colorLable)
                .addGap(124, 124, 124)
                .addComponent(timeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(colorLable))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(backButton)
                                .addComponent(jLabel1)
                                .addComponent(scoreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainScreen ms = new MainScreen();
        ms.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorGame().setVisible(true);
                
                /*THE FOLLOWING LINES OF CODE MUST BE COMMENTED OUT IF RUNNING THE GAME
                FROM ANOTHER PROGRAM*/
                //ColorGame game = new ColorGame();
                //game.setVisible(true);
                //game.addMouseListener(game);
            }
        });
    }
    
    //Method: paint
    //Purpose: Randomly generates five non-colliding circles, each with distinct color
    //Also creates a string label that literally indicates a color, and is filled in with
    //a completely different color
    //This method also initiates a mouse listener every time it opens
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        
        gameTracker++;
        scoreDisplay.setText(Integer.toString(points));
        
        //Coordinates keeps track of where each circle is being placed on the frame
        //Used later to prevent collisions. Colors is used to keep track of which
        //colors have already been used for the circles to avoid duplicates.
        int[] coordinates = new int[10];
        int[] colors = new int[5];
        int k = 0;
        j = 0;
        
        //j determines which color will literally be spelled out on the screen
        //k determines the color of the string itself
        j = gen.nextInt(5);
        labelColor = labelColors[j];
        colorLable.setText(labelColor);
        
        k = gen.nextInt(5);
        
        //Ensures that the color that is spelled out and the color of the string
        //are not the same
        while(k == j){
            k = gen.nextInt(5);
        }
        
        //Switch case that sets the color of the string
        switch(k){
            case 0: colorLable.setForeground(new java.awt.Color(255, 0, 0));
                    labelColorIndicator = new java.awt.Color(255, 0, 0);
                    break;
            case 1: colorLable.setForeground(new java.awt.Color(255, 255, 0));
                    labelColorIndicator = new java.awt.Color(255, 255, 0);
                    break;
            case 2: colorLable.setForeground(new java.awt.Color(0, 255, 0));
                    labelColorIndicator = new java.awt.Color(0, 255, 0);
                    break;
            case 3: colorLable.setForeground(new java.awt.Color(0, 0, 255));
                    labelColorIndicator = new java.awt.Color(0, 0, 255);
                    break;
            case 4: colorLable.setForeground(new java.awt.Color(255, 0, 255));
                    labelColorIndicator = new java.awt.Color(255, 0, 255);
                    break;
            default: break;
        }
        
        j = 0;
        
        colorLable.setFont(new java.awt.Font("Rockwell", 1, 24));
        
        //This for loop creates the five circles
        for(int i = 0; i < 5; ++i){
            while(collides(x, y, coordinates)){
                x = gen.nextInt(495) + 5;
                y = gen.nextInt(240) + 90;
            }
            
            //The location of the circles is stored in an array
            //Used to prevent collisions between circles
            coordinates[i] = x;
            coordinates[i + 5] = y;
            
            //Ensures that no two circles are the same color
            while(contains(color, colors)){
                color = gen.nextInt(5) + 1;
            }
            
            //Array used to keep track of which colors have
            //already been used for the circles
            colors[j++] = color;
            
            //Determines fill color for each circle
            switch(color){
                case 1: g2.setColor(Color.red);
                        break;
                case 2: g2.setColor(Color.yellow);
                        break;
                case 3: g2.setColor(Color.green);
                        break;
                case 4: g2.setColor(Color.blue);
                        break;
                case 5: g2.setColor(Color.magenta);
                        break;
                default: break;
            }
            
            ellipse = new Ellipse2D.Double(x, y, 100, 100);
            g2.fill(ellipse);
            
            //Keeps track of which order each circle was drawn in to link it
            //to its color
            ellipses[i] = ellipse;
            
            //Stores the corresponding color of the last drawn circle
            colorIndicator[i] = g2.getColor();
        }
    }
    
    //Method: mouseClicked
    //Purpose: checks to see whether a mouse click is inside any of the circles
    //and also whether the correct color was chosen. If the color is correct, the
    //score should be incremented by 100 points. It also closes the game after five
    //repititions.
    @Override
    public void mouseClicked(MouseEvent e){
        for(int i = 0; i < ellipses.length; ++i){
            if (ellipses[i].contains(e.getX(), e.getY()) ){
                if(labelColorIndicator.equals(colorIndicator[i])){
                    points += 100;
                    score += 100;
                }
            
                if(gameTracker >= 5){
                    //HighScoresScreen hs = new HighScoresScreen();
                    SudokuGame sudoku = new SudokuGame();
                    this.setVisible(false);
                    //hs.setVisible(true);
                    sudoku.setVisible(true);
                }
                
                repaint();
            }
        }
    }
    
    //Method: contains
    //Purpose: Method used to check for duplicate circle colors
    public static boolean contains(int n, int[] c){
        for(int i = 0; i < 5; ++i){
            if(c[i] == n)
                return true;
        }
        
        return false;
    }
    
    //Method: collides
    //Purpose: Checks for collisions between circles
    public static boolean collides(int xcoor, int ycoor, int[] coor){
        for(int i = 0; i < 5; ++i){
            if(Math.abs(xcoor - coor[i]) < 100 && Math.abs(ycoor - coor[i + 5]) < 100){
                return true;
            }
        }
        return false;
    }
    
    //The mouseListener methods that had to be overwritten (as it is an abstract class)
    @Override
    public void mouseExited(MouseEvent e){
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        for(int i = 0; i < ellipses.length; ++i){
            if (ellipses[i].contains(e.getX(), e.getY()) ){
                System.out.println("Highlighted");
            }
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel colorLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField scoreDisplay;
    private javax.swing.JTextField timeDisplay;
    // End of variables declaration//GEN-END:variables
}