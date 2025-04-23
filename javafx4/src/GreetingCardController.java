import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import java.util.List;
import java.util.Random;

public class GreetingCardController {

    @FXML
    private Pane cardPane;

    private Random random = new Random();
    private final double CARD_WIDTH = 400;
    private final double CARD_HEIGHT = 300;

    public void drawElements(List<String> elements) {
        cardPane.getChildren().clear();
        int numberOfElements = 50;

        for (int i = 0; i < numberOfElements; i++)
        {
            double x = random.nextDouble() * CARD_WIDTH;
            double y = random.nextDouble() * CARD_HEIGHT;
            Color color = Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble());

            if (elements.size() == 1)
            {
                switch (elements.get(0))
                {
                    case "balloons":
                        drawBalloon(x, y, color);
                        break;
                    case "hearts":
                        drawHeart(x, y, color);
                        break;
                    case "stars":
                        drawStar(x, y, color);
                        break;
                }
            }
            else if (elements.size() > 1)
            {
                String randomElement = elements.get(random.nextInt(elements.size()));
                switch (randomElement)
                {
                    case "balloons":
                        drawBalloon(x, y, color);
                        break;
                    case "hearts":
                        drawHeart(x, y, color);
                        break;
                    case "stars":
                        drawStar(x, y, color);
                        break;
                }
            }
        }
    }

    private void drawBalloon(double x, double y, Color color) {
        Circle balloon = new Circle(x, y, 15);
        balloon.setFill(color);
        cardPane.getChildren().add(balloon);
    }

    private void drawHeart(double x, double y, Color color) {

        javafx.scene.shape.Path heart = new javafx.scene.shape.Path(
                new javafx.scene.shape.MoveTo(x, y + 5),
                new javafx.scene.shape.CubicCurveTo(x - 5, y - 5, x - 15, y + 5, x, y + 15),
                new javafx.scene.shape.CubicCurveTo(x + 15, y + 5, x + 5, y - 5, x, y + 5)
        );
        heart.setFill(color);
        cardPane.getChildren().add(heart);
    }

    private void drawStar(double x, double y, Color color)
    {
        Polygon star = new Polygon(x, y - 10, x + 4, y - 3);
    }
}