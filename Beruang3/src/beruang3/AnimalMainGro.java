/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beruang3;

/**
 *
 * @author Fauzan
 */
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.lang.Thread;

public class AnimalMainGro{
    private JFrame frame;
    private JLabel label;
    private JLabel label1;
    private JButton btnBeriMinum;
    private JButton btnBeriMakanan;
    private JTextField txtDisplay;
    private ImageIcon beruangIcon;
  
    private Beruang b;
    
    
     public AnimalMainGro()
    {
       this.b = new Beruang();
      
       createAndShowGUI();
       setPlantImage();
    }
    
    private void createAndShowGUI()
    {
        frame = new JFrame("WELCOME TO UGARDEN");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setBackground(Color.CYAN);
        frame.setLayout(new FlowLayout());
    //Add label
    label = new JLabel("");
    label1 = new JLabel("Beruang Membutuhkan 2 Minum dan 3 Makanan Untuk Tumbuh");
    frame.getContentPane().add(label);
    //Add button
    btnBeriMinum = new JButton("Beri Minim");
    btnBeriMakanan = new JButton("Beri Makanan");
    frame.getContentPane().add(btnBeriMinum);
    frame.getContentPane().add(btnBeriMakanan);
    //Add text
   
    txtDisplay = new JTextField("hasilnya");
    frame.getContentPane().add(txtDisplay);
    frame.getContentPane().add(label1);
    label1.setFont(new java.awt.Font("", 0, 24));
     //Add action listener
    btnBeriMinum.addActionListener(new ActionListener() {
    
        @Override
        public void actionPerformed(ActionEvent e) 
    {
        btnBeriMinum_actionPerformed(e);
    }
 });
    btnBeriMakanan.addActionListener(new ActionListener() 
    {
     @Override
     public void actionPerformed(ActionEvent e) {
    btnBeriMakanan_actionPerformed(e);
    }
 });
    //Display the window
    frame.setSize(1000,700);
    frame.setVisible(true);
}
    
    private void btnBeriMinum_actionPerformed(ActionEvent e){
    System.out.println("Beri Minum");
    b.beriMinum();
    txtDisplay.setText(b.getStatusTumbuhText());
    setPlantImage();
}
    private void btnBeriMakanan_actionPerformed(ActionEvent e){
    System.out.println("Beri Makanan");
    b.beriMakanan();
    txtDisplay.setText(b.getStatusTumbuhText());
    setPlantImage();
 }
    protected ImageIcon createImageIcon(String path, String 
    description) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
    return new ImageIcon(imgURL, description);
    } else {
    System.err.println("Couldn't find file: " + path);
    return null;
 }
}
    private void setPlantImage()
    {
        beruangIcon = createImageIcon(b.getImagePath(), 
        b.getStatusTumbuhText());
        label.setIcon(beruangIcon);
    }
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new 
        Runnable(){
            public void run(){
                AnimalMainGro uGardenApp = new 
                AnimalMainGro();
            }
        });
    }
}


