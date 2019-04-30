package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {



    @FXML
    private TextField usernameField;

    @FXML
    private TextField locationField;

    @FXML
    private Button loginButton;

    @FXML
    private Button signUpButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private RadioButton maleSelector;

    @FXML
    private RadioButton femaleSelector;


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        usernameField.setStyle("-fx-text-inner-color: #a0a2ab");
        passwordField.setStyle("-fx-text-inner-color: #a0a2ab");
        locationField.setStyle("-fx-text-inner-color: #a0a2ab");

    }

    public void signUpAction(ActionEvent e1) throws IOException{

        signUpButton.getScene().getWindow().hide();

        Stage stage = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("/view/LoginMain.fxml"));

        Scene scene = new Scene(root, 600,300);

        stage.setScene(scene);

        stage.show();

    }

    public void loginAction(ActionEvent e2){



    }


}
