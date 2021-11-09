package windows;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ManagerWindowController implements Initializable {


    @FXML
    private void handleCreateNewAccountBtAction(ActionEvent event) throws IOException {
        Stage loginStage = new Stage();
        Parent loginRoot = FXMLLoader.load(getClass().getResource("CreateNewAccoountWindow.fxml"));
        Scene loginScene = new Scene(loginRoot);
        loginStage.setScene(loginScene);
        loginStage.setTitle("Vytvořit Nový Účet");
        loginStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}