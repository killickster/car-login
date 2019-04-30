package controller;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable{


    @FXML
    private Button forgotPasswordButton;

    @FXML
    private Button loginButton;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField username;

    @FXML
    private CheckBox rememberMeBox;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        username.setStyle("-fx-text-inner-color: #a0a2ab");
        passwordField.setStyle("-fx-text-inner-color: #a0a2ab");

    }

    @FXML
    public void signUpAction(ActionEvent e) throws IOException {

        Stage stage = new Stage();

        loginButton.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("/view/SignUp.fxml"));

        Scene scene = new Scene(root, 600, 300);

        stage.setScene(scene);

        stage.show();


    }

    @FXML
    public void loginAction(ActionEvent e) throws IOException{

        System.out.print("Logged in successfuly");

    }


}
