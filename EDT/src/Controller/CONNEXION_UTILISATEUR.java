/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.COURS;
import Model.COURSDAO;

import Model.DAO;
import Model.Connexion;

import Model.ETUDIANT;
import Model.ETUDIANTDAO;

import Model.GROUPE;
import Model.GROUPEDAO;

import Model.PROMOTION;
import Model.PROMOTIONDAO;

import Model.SALLE;
import Model.SALLEDAO;

import Model.SEANCE;
import Model.SEANCEDAO;

import Model.SITE;
import Model.SITEDAO;

import Model.TYPE_COURS;
import Model.TYPE_COURSDAO;

import Model.UTILISATEUR;
import Model.UTILISATEURDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Milou
 */
public class CONNEXION_UTILISATEUR extends UTILISATEURDAO{
   /*
    public CONNEXION_UTILISATEUR(){}
    
    public void VERIFCONNEXION_UTILISATEUR (String EMAIL, String PSSWD)
    {
        try{ 
      PreparedStatement ps= this.connection.prepareStatement("SELECT * FROM UTILISATEUR WHERE UTILISATEUR.EMAIL = ?, UTILISATEUR.PSSWD= ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
       // ps.setString(Nom);
    //   ps.setString(1,Nom);
       ResultSet resultat = ps.executeQuery();

      while(resultat.next())
        {
      ETUDIANT etudiant = new ETUDIANT();
        DAO <ETUDIANT> etudiantdao = new  ETUDIANTDAO();
        etudiant=etudiantdao.find(resultat.getInt("ID"));
        System.out.println("Étudiant : ");
        etudiant.afficherETUDIANT();
        listETUDIANT.add(etudiant);

        
        GROUPE_EDT groupeedt = new GROUPE_EDT();
        groupeedt.voirGROUPE_SEANCE(resultat.getInt("ID_GROUPE"));
        }
    }catch (SQLException e){
        e.printStackTrace();
    }
    } */
}