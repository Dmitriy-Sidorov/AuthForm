package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

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
    private TextField firstName_field;

    @FXML
    private TextField secondName_field;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField region_field;

    @FXML
    private RadioButton geender_male_radio;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton geender_female_radio;

    @FXML
    void initialize() {
        singInButton.setOnAction(event -> {
            singInButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/singIn.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent scene = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(scene));
            stage.show();
        });
    }
}
