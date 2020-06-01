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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import java.sql.SQLException;
/**
 *
 * @author Milou
 */
public class PROMOTION_EDT extends ETUDIANTDAO {
    public PROMOTION_EDT(){}

    public void voirPROMOTION_SEANCE(String Nom)
    {
        //retrouver le groupe en question

        try{ 
      PreparedStatement ps= this.connection.prepareStatement("SELECT u.ID FROM PROMOTION JOIN GROUPE u ON PROMOTION.ID = u.ID_PROMOTION WHERE PROMOTION.NOM = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
       // ps.setString(Nom);
       ps.setString(1,Nom);
       ResultSet resultat = ps.executeQuery();

      while(resultat.next())
        { 
        GROUPE_EDT groupeedt = new GROUPE_EDT();
        groupeedt.voirGROUPE_SEANCE(resultat.getInt("ID"));
        }
    }catch (SQLException e){
        e.printStackTrace();
    }
        


    }


}