package com.example.airlinereservation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AirlineController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button btn;
    private VBox vbox;
    private AirlineController mainContentController ;
    private Parent fxml;


    //@FXML
    //private void initialize(URL url, ResourceBundle resourceBundle) throws IOException {
    //    FXMLLoader mainContentLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
    //    VBox vbox = mainContentLoader.load();
    //    mainContentController = mainContentLoader.getController();
    //    //scene.getStylesheets("");
    //}

    @FXML
    public void signin_scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Signin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void signup_scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}