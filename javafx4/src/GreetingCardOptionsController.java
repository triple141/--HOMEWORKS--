import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class GreetingCardOptionsController {

    @FXML
    private CheckBox balloonsCheckBox;

    @FXML
    private CheckBox heartsCheckBox;

    @FXML
    private CheckBox starsCheckBox;

    @FXML
    private Button generateButton;

    @FXML
    private void generateCard() {
        List<String> selectedElements = new ArrayList<>();
        if (balloonsCheckBox.isSelected())
        {
            selectedElements.add("balloons");
        }
        if (heartsCheckBox.isSelected())
        {
            selectedElements.add("hearts");
        }
        if (starsCheckBox.isSelected())
        {
            selectedElements.add("stars");
        }

        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("greeting_card.fxml"));
            Pane cardPane = loader.load();
            GreetingCardController controller = loader.getController();
            controller.drawElements(selectedElements);

            Stage stage = new Stage();
            stage.setTitle("your card");
            stage.setScene(new Scene(cardPane, 400, 300));
            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}