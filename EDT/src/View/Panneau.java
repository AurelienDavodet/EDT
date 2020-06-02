/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Antoine
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Panneau extends JPanel{
  private Color color = Color.white;
  private static int COUNT = 0;
  private String message = "";
   
  public Panneau(){}
  public Panneau(Color color){
    
 this.setLayout(new GridBagLayout());
 GridBagConstraints gbc = new GridBagConstraints();
 gbc.weightx = 1;
 gbc.weighty = 1;
 
 gbc.gridx = 0;
 gbc.gridwidth = 2;
 gbc.gridheight = 2;
 gbc.gridy = 0;
 gbc.fill = GridBagConstraints.BOTH;

this.add( menu(), gbc);
 
////////////////////
 gbc.gridx = 0;
 gbc.gridwidth = 2;
 gbc.gridheight = 2;
 gbc.gridy = 2;
 this.add( semaine(), gbc);
 
////////////////////
 gbc.gridx = 0;
 gbc.gridwidth = 2;
 gbc.gridheight = 2;
 gbc.gridy = 4;
 this.add(edt(), gbc);
 
  }

  public JPanel menu(){
    JPanel top = new JPanel();
    

    JComboBox combo = new JComboBox();
    top.add(combo);
    //this.add(top, BorderLayout.NORTH);
    combo.setPreferredSize(new Dimension(100, 20));
    combo.addItem("En grille");
    combo.addItem("Option 2");
    combo.addItem("Option 3");
    combo.addItem("Option 4");


  JComboBox combo2 = new JComboBox();
  
    top.add(combo2);
    //this.add(top, BorderLayout.NORTH);
    
    combo2.setPreferredSize(new Dimension(100, 20));
    combo2.addItem("Saisie du nom");
    combo2.addItem("Option 2");
    combo2.addItem("Option 3");
    combo2.addItem("Option 4");


    JTextField textfield = new JTextField(" Edit me !!! ");
    top.add(textfield);
    //this.add(new JTextField());
    
    
    //this.color = color;
    return top;
}

public JPanel semaine(){

    JPanel top = new JPanel();

    for(int i = 1; i <= 52; i++){
        JButton bouton = new JButton(""+i);
        bouton.setPreferredSize(new Dimension(48,20));
        top.add(bouton);
    }

    return top;
    
}

public JPanel edt(){
    //Les données du tableau
    JPanel top = new JPanel(new BorderLayout());
    top.setMinimumSize(new Dimension(900, 400));
    top.setMaximumSize(new Dimension(900, 400));
    top.setPreferredSize(new Dimension(900, 400));
 

    Object[][] data = {
      {"", "", "", "", "", "",""},
      {"", "", "", "", "", "",""},
      {"", "", "", "", "", "",""},
      {"", "", "", "", "", "",""}
    };

    //Les titres des colonnes
    String  title[] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
    JTable tableau = new JTable(data, title);
    tableau.setPreferredSize(new Dimension(7000, 65));

    //Nous ajoutons notre tableau à notre contentPane dans un scroll
    //Sinon les titres des colonnes ne s'afficheront pas !
    top.add(new JScrollPane(tableau));

    return top;
}

  public void paintComponent(Graphics g){
    
    g.setColor(this.color);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    g.setColor(Color.white);
    g.setFont(new Font("Arial", Font.BOLD, 15));
    g.drawString(this.message, 10, 20);
  }
}