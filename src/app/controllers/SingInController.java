package app.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import app.functional.DatabaseHandler;

public class SingInController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField userNameField;

    @FXML
    private Button singUpButton;

    @FXML
    private Button singInButton;

    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();
        singUpButton.setOnAction(event -> {
            dbHandler.loadScene(singUpButton, "../view/singUp.fxml");
        });
    }
}
