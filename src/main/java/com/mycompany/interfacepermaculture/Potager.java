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
public class Potager {
    private ArrayList<Terrain> listeTerrain;

    public Potager(ArrayList<Terrain> listeTerrain) {
        this.listeTerrain = listeTerrain;
    }

    public ArrayList<Terrain> getListeTerrain() {
        return listeTerrain;
    }

    public void setListeTerrain(ArrayList<Terrain> listeTerrain) {
        this.listeTerrain = listeTerrain;
    }
    
    
    
}
