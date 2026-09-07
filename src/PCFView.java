/**
 * Die Klasse PCFView stellt die grafische Benutzeroberfläche
 * der Anwendung bereit. Sie enthält die Steuerelemente wie
 * Buttons, ComboBoxen und Ausgabefelder.
 * Die View übernimmt ausschließlich die Darstellung der Daten.
 * Diese Klasse bildet die View des MVC-Konzepts.
 */

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class PCFView {

    private VBox root;
    private VBox contentBox;

    private Button btnGesamt;
    private Button btnProdukt;
    private Button btnKategorie;
    private Button btnBeenden;
    private ComboBox<String> comboWeitere;

    public PCFView() {

        Label title = new Label("PCF - Product Carbon Footprint");
        title.setStyle("-fx-font-size: 26px; -fx-font-weight: bold;");

        btnGesamt = new Button("Gesamt PCF");
        btnProdukt = new Button("Produkt PCF");
        btnKategorie = new Button("Kategorie PCF");
        btnBeenden = new Button("Programm beenden");

        btnGesamt.setPrefWidth(150);
        btnProdukt.setPrefWidth(150);
        btnKategorie.setPrefWidth(150);
        btnBeenden.setPrefWidth(170);
        
        comboWeitere = new ComboBox<>();
        comboWeitere.setPromptText("Weitere");
        comboWeitere.setPrefWidth(180);
        
        comboWeitere.getItems().add("Durchschnitt / Alle");
        comboWeitere.getItems().add("Durchschnitt / Kategorie");
        comboWeitere.getItems().add("Höchster PCF");
        comboWeitere.getItems().add("Niedrigster PCF");

        HBox buttonBox = new HBox(15, btnGesamt, btnProdukt, btnKategorie, comboWeitere);
        buttonBox.setAlignment(Pos.CENTER);

        contentBox = new VBox(15);
        contentBox.setAlignment(Pos.CENTER);
        contentBox.setPadding(new Insets(30));
        contentBox.setMinHeight(300);
        contentBox.setStyle("-fx-border-color: lightgray; -fx-border-width: 2; -fx-border-radius: 8;");

        HBox bottomBox = new HBox(btnBeenden);
        bottomBox.setAlignment(Pos.CENTER_RIGHT);

        root = new VBox(25, title, buttonBox, contentBox, bottomBox);
        root.setAlignment(Pos.TOP_CENTER);
        root.setPadding(new Insets(30));

        zeigeStartseite();
    }

    public VBox getRoot() {
        return root;
    }

    public Button getBtnGesamt() {
        return btnGesamt;
    }

    public Button getBtnProdukt() {
        return btnProdukt;
    }

    public Button getBtnKategorie() {
        return btnKategorie;
    }

    public Button getBtnBeenden() {
        return btnBeenden;
    }
    
    public ComboBox<String> getComboWeitere() {
    return comboWeitere;
}

    public void zeigeStartseite() {
        contentBox.getChildren().clear();

        Label heading = new Label("Willkommen im PCF-Analyse-Tool");
        heading.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Label text = new Label(
    "Der Product Carbon Footprint (PCF) gibt an,\n" +
    "welche Menge an Treibhausgasen bei einem Produkt\n" +
    "über seinen gesamten Lebenszyklus entsteht.\n\n" +

    "Berücksichtigt werden die Phasen:\n\n" +

    "• Rohstoffe\n" +
    "• Produktion\n" +
    "• Transport\n" +
    "• Nutzung\n" +
    "• Recycling\n\n" +

    "Mit diesem Tool können die CO₂-Emissionen\n" +
    "verschiedener IT-Produkte der MünsterlandIT GmbH\n" +
    "analysiert und verglichen werden.\n\n" +

    "Wählen Sie eine Auswertung über die Buttons aus."
);
        contentBox.getChildren().addAll(heading, text);
    }

    public void zeigeTextseite(String ueberschrift, String text) {
        contentBox.getChildren().clear();

        Label heading = new Label(ueberschrift);
        heading.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        TextArea ausgabe = new TextArea(text);
        ausgabe.setEditable(false);
        ausgabe.setPrefWidth(650);
        ausgabe.setPrefHeight(300);

        contentBox.getChildren().addAll(heading, ausgabe);
    }

    public void zeigeProduktAuswahl(ComboBox<String> comboBox, TextArea ausgabe) {
        contentBox.getChildren().clear();

        Label heading = new Label("Produkt PCF");
        heading.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        comboBox.setPrefWidth(400);
        ausgabe.setEditable(false);
        ausgabe.setPrefWidth(650);
        ausgabe.setPrefHeight(300);

        contentBox.getChildren().addAll(heading, comboBox, ausgabe);
    }
}