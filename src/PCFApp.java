/**
 * Die Klasse PCFApp dient als Einstiegspunkt der Anwendung.
 * Sie erzeugt die Objekte des Models, der View und des Controllers
 * und verbindet diese miteinander. Anschließend wird das
 * Hauptfenster der Anwendung angezeigt.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PCFApp extends Application {

    @Override
    public void start(Stage stage) {

        PCFModel model = new PCFModel();
        PCFView view = new PCFView();

        new PCFController(model, view, stage);

        Scene scene = new Scene(view.getRoot(), 950, 620);

        stage.setTitle("PCF - Product Carbon Footprint");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}