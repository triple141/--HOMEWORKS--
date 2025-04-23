import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GalleryController {

    @FXML
    private ImageView imageView;

    @FXML
    private Button previousButton;

    @FXML
    private Button nextButton;

    private String[] imagePaths = {
            "image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", "image5.jpg",
            "image6.jpg", "image7.jpg", "image8.jpg", "image9.jpg", "image10.jpg"
    };
    private int currentIndex = 0;

    @FXML
    public void initialize()
    {
        updateImageView();
    }

    @FXML
    private void showPrevious()
    {
        if (currentIndex > 0)
        {
            currentIndex--;
            updateImageView();
            nextButton.setDisable(false);
        }
        if (currentIndex == 0)
        {
            previousButton.setDisable(true);
        }
    }

    @FXML
    private void showNext() {
        if (currentIndex < imagePaths.length - 1)
        {
            currentIndex++;
            updateImageView();
            previousButton.setDisable(false);
        }
        if (currentIndex == imagePaths.length - 1)
        {
            nextButton.setDisable(true);
        }
    }

    private void updateImageView() {
        try
        {
            Image image = new Image(getClass().getResourceAsStream(imagePaths[currentIndex]));
            imageView.setImage(image);
        }
        catch (Exception e)
        {
            System.err.println("image loat exeption: " + imagePaths[currentIndex]);

        }
        previousButton.setDisable(currentIndex == 0);
        nextButton.setDisable(currentIndex == imagePaths.length - 1);
    }
}