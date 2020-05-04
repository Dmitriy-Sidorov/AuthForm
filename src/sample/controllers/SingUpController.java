package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import sample.database.DatabaseHandler;

public class SingUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button singInButton;

    @FXML
    private Button singUpButton;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField userNameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField locationField;

    @FXML
    private RadioButton genderMaleRadio;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton genderFemaleRadio;

    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();
        singUpButton.setOnAction(event -> {
            dbHandler.singUpUser(firstNameField.getText(), lastNameField.getText(), userNameField.getText(),
                    passwordField.getText(), locationField.getText(), "gender");
        });
        singInButton.setOnAction(event -> {
            dbHandler.loadScene(singInButton, "../view/singIn.fxml");
        });
    }
}
