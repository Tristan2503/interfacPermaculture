/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfacepermaculture;

import java.util.ArrayList;

/**
 *
 * @author tristan.pons
 */
public class Terrain {
    private String nom;
    private float longeur;
    private float largeur;
    private ArrayList<Plante> listePlante;

    public Terrain(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getLongeur() {
        return longeur;
    }

    public void setLongeur(float longeur) {
        this.longeur = longeur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public ArrayList<Plante> getListePlante() {
        return listePlante;
    }

    public void setListePlante(ArrayList<Plante> listePlante) {
        this.listePlante = listePlante;
    }
    
    
    
}
