/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import Controller.CONNEXION_UTILISATEUR;
import Model.ADMIN;
import Model.ETUDIANT;
import Model.REFERENT;
import Model.UTILISATEUR;
import java.awt.BorderLayout;


/**
 *
 * @author Aurélien
 */

//classe affichant la fenetre d'onglets d'un referent
public class Freferent extends JFrame {

    //ETUDIANT student = new ETUDIANT();
    
    public Freferent(){
        
        this.setLocationRelativeTo(null);
        this.setTitle("Referent");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setDefaultLookAndFeelDecorated(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        JTabbedPane onglet;
        //Création de plusieurs Panneau
        Preferent tPan = new Preferent();
        Rreferent recap = new Rreferent();
        //System.out.println("test methode :");
        //Création de notre conteneur d'onglets
        onglet = new JTabbedPane();
        //Méthode d'ajout d'onglet
        onglet.add("Emploi du temps", tPan.getPan());
        onglet.add("Récapitulatif de cours", recap.getPan());

        this.getContentPane().add(onglet);
        this.setVisible(true);

    }

}