import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UserInputApplication extends Application {

    private TextField nameTextField;
    private TextField ageTextField;
    private Label nameLabel;
    private Label ageLabel;
    private Label nameAddedLabel;
    private Label ageAddedLabel;
    private Button submitButton;

    @Override
    public void start(Stage primaryStage) {
        // Create the UI controls
        nameTextField = new TextField();
        ageTextField = new TextField();
        nameLabel = new Label("Name:");
        ageLabel = new Label("Age:");
        submitButton = new Button("Submit");
        nameAddedLabel = new Label("");
        ageAddedLabel = new Label("");

        // Add the UI controls to the layout
        GridPane gridPane = new GridPane();
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameTextField, 1, 0);
        gridPane.add(ageLabel, 0, 1);
        gridPane.add(ageTextField, 1, 1);
        gridPane.add(submitButton, 1, 2);
        gridPane.add(nameAddedLabel, 1, 3);
        gridPane.add(ageAddedLabel, 1, 4);

        // Create the scene and stage
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("Sample Application");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Handle the submit button event
        submitButton.setOnAction(event -> {
            // Get the user input
            String name = nameTextField.getText();
            int age = Integer.parseInt(ageTextField.getText());

            // Display the user input
            nameAddedLabel.setText("Your name is: " + name);
            ageAddedLabel.setText("Your age is: " + age);
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
