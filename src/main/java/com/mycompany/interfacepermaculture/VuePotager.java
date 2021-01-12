/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfacepermaculture;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author tristan.pons
 */
public class VuePotager  extends Parent {

    private Group panel;
    private Button addTerrain;
    private TextArea newNameTerrain;
    private ArrayList<Terrain> listeTerrain;
    private ArrayList<Button> listeDeleteTerrain;
    private ArrayList<Button> listeAccessTerrain;
    private ArrayList<Label> listeNameTerrain;
    private int counterPosition=0;
    
    
    public VuePotager() {
        panel=new Group();
        addTerrain = new Button("+");
        newNameTerrain = new TextArea();
        listeAccessTerrain=new ArrayList();
        listeNameTerrain=new ArrayList();
        listeDeleteTerrain=new ArrayList();
        listeTerrain= new ArrayList();
        addTerrain.setLayoutX(100);
        addTerrain.setLayoutY(500);
        newNameTerrain.setLayoutX(250);
        newNameTerrain.setLayoutY(500);
        addTerrain.setPrefWidth(35);
        addTerrain.setPrefHeight(35);
        newNameTerrain.setPrefWidth(200);
        newNameTerrain.setPrefHeight(20);
        addTerrain.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                Terrain terrain = new Terrain(newNameTerrain.getText());
                Button buttonAccessTerrain =new Button("Accéder");
                Button buttonDeleteTerrain =new Button("Supprimer");
                Label labelTerrain= new Label(newNameTerrain.getText());
                buttonAccessTerrain.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override public void handle(ActionEvent e)
                    {
                        
                    }
                });
                buttonDeleteTerrain.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override public void handle(ActionEvent e)
                    {
                        panel.getChildren().remove(buttonAccessTerrain);
                        panel.getChildren().remove(buttonDeleteTerrain);
                        panel.getChildren().remove(labelTerrain);
                        System.out.println(terrain.getNom());
                        listeTerrain.remove(counterPosition-1);
                        counterPosition=counterPosition-1;
                    }
                });
                buttonAccessTerrain.setLayoutX(400);
                buttonAccessTerrain.setLayoutY(counterPosition*50);
                buttonDeleteTerrain.setLayoutX(460);
                buttonDeleteTerrain.setLayoutY(counterPosition*50);
                labelTerrain.setLayoutX(0);
                labelTerrain.setLayoutY(counterPosition*50);
                listeAccessTerrain.add(buttonAccessTerrain);
                listeDeleteTerrain.add(buttonDeleteTerrain);
                listeNameTerrain.add(labelTerrain);
                listeTerrain.add(terrain);
                panel.getChildren().add(labelTerrain);
                panel.getChildren().add(buttonDeleteTerrain);
                panel.getChildren().add(buttonAccessTerrain);
                counterPosition=counterPosition+1;
                
            }
        });
        panel.getChildren().add(addTerrain);
        panel.getChildren().add(newNameTerrain);
        panel.getChildren().addAll(listeAccessTerrain);
        panel.getChildren().addAll(listeDeleteTerrain);
        this.getChildren().add(panel);
    }
    
}
