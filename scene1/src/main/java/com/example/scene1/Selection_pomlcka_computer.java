package com.example.scene1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


import static com.example.scene1.Computer_vs_Player.before_start_Computer;
import static com.example.scene1.Computer_vs_Player_without_pomlcka.before_start_computer_without_pomlcka;

public class Selection_pomlcka_computer {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void pomlcka(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Computer_vs_Player.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        before_start_Computer();
    }
    public void nic(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Computer_vs_Player_without_pomlcka.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        before_start_computer_without_pomlcka();
    }
    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
