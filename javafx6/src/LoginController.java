import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;


    private static final String CORRECT_USERNAME = "sakamotto";
    private static final String CORRECT_PASSWORD = "12345654321";

    @FXML
    protected void loginButtonClicked() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("please enter all info.");
        } else if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
            messageLabel.setText("Authorized succesfully!");

        } else {
            messageLabel.setText("invalid username or password.");
        }
    }
}