package app.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import app.functional.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import app.functional.DatabaseHandler;

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

    private DatabaseHandler dbHandler = new DatabaseHandler();

    @FXML
    void initialize() {
        singUpButton.setOnAction(event -> {
            signUpNewUser();
        });
        singInButton.setOnAction(event -> {
            dbHandler.loadScene(singInButton, "../view/singIn.fxml");
        });
    }

    private void signUpNewUser() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String userName = userNameField.getText();
        String password = passwordField.getText();
        String location = locationField.getText();
        RadioButton selectedRadioButton = (RadioButton) gender.getSelectedToggle();
        String gender = selectedRadioButton.getText();

        User user = new User(firstName, lastName, userName, password, location, gender);

        dbHandler.singUpUser(user);
    }
}
