package windows;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    private void handleLogInBtAction(ActionEvent event) throws IOException {
        Stage loginStage = new Stage();
        Parent loginRoot = FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
        Scene loginScene = new Scene(loginRoot);
        loginStage.setScene(loginScene);
        loginStage.setTitle("Přihlášení");
        loginStage.show();
    }

    @FXML
    private void handleSignUpBtAction(ActionEvent event) throws IOException {
        Stage loginStage = new Stage();
        Parent loginRoot = FXMLLoader.load(getClass().getResource("RegisterWindow.fxml"));
        Scene loginScene = new Scene(loginRoot);
        loginStage.setScene(loginScene);
        loginStage.setTitle("Registrace");
        loginStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
