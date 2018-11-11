package sample;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button enterButton;

    @FXML
    private Button zaregistrButton;

    @FXML
    private PasswordField passwordBox;

    @FXML
    private TextField loginField;

    @FXML
    void initialize() {
        zaregistrButton.setOnAction(event -> {
            zaregistrButton.getScene().getWindow().hide();//сцена+окно+прячем окно
            FXMLLoader fxmlLoader = new FXMLLoader(); //отображать необходимое окно
            fxmlLoader.setLocation(getClass().getResource("/sample/sampleapp.fxml"));//место расположение файла
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();//отобразить и подождать
        });
        enterButton.setOnAction(event -> {
            String loginText = loginField.getText().trim();
            String loginPass = passwordBox.getText().trim();
            if(!loginText.equals("") && !loginPass.equals(""))
                loginUser(loginText, loginPass);
            else
                System.out.println("Ошибка авторизации");

        });


    }

 private void loginUser(String loginText, String loginPass) {

 }
}
