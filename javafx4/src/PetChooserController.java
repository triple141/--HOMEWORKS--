import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class PetChooserController {

    @FXML
    private RadioButton catRadioButton;

    @FXML
    private RadioButton dogRadioButton;

    @FXML
    private RadioButton rabbitRadioButton;

    @FXML
    private RadioButton birdRadioButton;

    @FXML
    private TextField nameTextField;

    @FXML
    private Button chooseButton;

    @FXML
    private Label resultLabel;

    @FXML
    private ToggleGroup petGroup;

    @FXML
    private void choosePet() {
        RadioButton selectedRadioButton = (RadioButton) petGroup.getSelectedToggle();
        if (selectedRadioButton != null)
        {
            String selectedPet = selectedRadioButton.getText();
            String petName = nameTextField.getText();
            if (!petName.isEmpty())
            {
                resultLabel.setText(selectedPet + " Name: " + petName);
            }
            else
            {
                resultLabel.setText("Enter name.");
            }
        }
        else
        {
            resultLabel.setText("Choose pet.");
        }
    }
}