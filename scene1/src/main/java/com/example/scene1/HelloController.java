package com.example.scene1;
import javafx.beans.property.BooleanProperty;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javafx.scene.control.Button;


public class HelloController {
    @FXML
    Button oj;

    private Stage stage;
    private Scene scene;
    private Parent root;
   public void switchtoScene1(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("vyber_pomlcka_hrac.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
   }


    public void switchtoScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoScene3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("vyber_pomlcky.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void back1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void prav(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pravidla.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void end(ActionEvent event) throws IOException{
       System.exit(0);
    }
}