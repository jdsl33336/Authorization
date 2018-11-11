package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class sampleAppController {

    @FXML
    private TextField surnameField;

    @FXML
    private TextField countryCheckBox;

    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox womanCheckBox;

    @FXML
    private Button enterButton2;

    @FXML
    private CheckBox manCheckBox;

    @FXML
    private TextField loginField;
    @FXML
            void initialize(){
        DatabaseHandler databaseHandler = new DatabaseHandler();
        enterButton2.setOnAction(event -> {
            databaseHandler.registrUser(nameField.getText(), surnameField.getText(),loginField.getText(),
                    passwordField.getText(), countryCheckBox.getText(), "Male");
        });

    }


}
