/**
 * Die Klasse PCFController verbindet die Benutzeroberfläche
 * mit den Daten des Modells. Sie verarbeitet Benutzereingaben,
 * ruft Berechnungen im Model auf und veranlasst die Anzeige
 * der Ergebnisse in der View.
 * Diese Klasse bildet den Controller des MVC-Konzepts.
 */

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Map;

public class PCFController {

    private PCFModel model;
    private PCFView view;
    private Stage stage;

    public PCFController(PCFModel model, PCFView view, Stage stage) {
        this.model = model;
        this.view = view;
        this.stage = stage;

        verbindeEvents();
    }

    private void verbindeEvents() {
        view.getBtnGesamt().setOnAction(e -> zeigeGesamtPCF());
        view.getBtnProdukt().setOnAction(e -> zeigeProduktPCF());
        view.getBtnKategorie().setOnAction(e -> zeigeKategoriePCF());
        view.getBtnBeenden().setOnAction(e -> stage.close());
        view.getComboWeitere().setOnAction(e -> verarbeiteWeitereAuswertung());
     }

    private void zeigeGesamtPCF() {
        double gesamt = model.berechneGesamtPCF();

        String text =
                "Anzahl Produkte: " + model.zaehleProdukte() + "\n\n" +
                "Gesamter Product Carbon Footprint: " +
                String.format("%.2f kg CO2e\n", gesamt) +
                "Durchschnittlicher Product Carbon Footprint: " +
                String.format("%.2f t CO2e", gesamt / 1000);

        view.zeigeTextseite("Gesamt PCF", text);
    }

    private void zeigeProduktPCF() {
        ComboBox<String> comboBox = new ComboBox<>();
        TextArea ausgabe = new TextArea();

        ArrayList<ProduktCO2> produkte = model.getProdukte();

        for (int i = 0; i < produkte.size(); i++) {
            comboBox.getItems().add(produkte.get(i).getProdukt());
        }

        comboBox.setPromptText("Produkt auswählen");

        comboBox.setOnAction(e -> {
            String produktname = comboBox.getValue();
            ProduktCO2 p = model.findeProdukt(produktname);

            if (p != null) {
                ausgabe.setText(
                        "Produkt: " + p.getProdukt() + "\n" +
                        "Kategorie: " + p.getKategorie() + "\n\n" +
                        "Rohstoffe: " + p.getRohstoffe() + " kg CO2e\n" +
                        "Produktion: " + p.getProduktion() + " kg CO2e\n" +
                        "Transport: " + p.getTransport() + " kg CO2e\n" +
                        "Nutzung: " + p.getNutzung() + " kg CO2e\n" +
                        "Recycling: " + p.getRecycling() + " kg CO2e\n\n" +
                        "Nutzungsdauer: " + p.getNutzungsdauer() + " Jahre\n\n" +
                        "Gesamt-PCF: " + String.format("%.2f kg CO2e\n", p.berechnePCF()) +
                        "CO2e pro Jahr: " + String.format("%.2f kg CO2e", p.berechneCO2ProJahr())
                );
            } else {
                ausgabe.setText("Das ausgewählte Produkt wurde nicht gefunden.");
            }
        });

        view.zeigeProduktAuswahl(comboBox, ausgabe);
    }

    private void zeigeKategoriePCF() {
        Map<String, Double> kategorien = model.berechneKategoriePCF();

        String text = "";

        for (String kategorie : kategorien.keySet()) {
            text = text + kategorie + ": " +
                    String.format("%.2f kg CO2e", kategorien.get(kategorie)) + "\n";
        }

        view.zeigeTextseite("Kategorie PCF", text);
    }
    
    
    private void verarbeiteWeitereAuswertung() {
    String auswahl = view.getComboWeitere().getValue();

    if (auswahl == null) {
        return;
    }

    switch (auswahl) {
        case "Durchschnitt / Alle":
            zeigeDurchschnittAlle();
            break;

        case "Durchschnitt / Kategorie":
            zeigeDurchschnittKategorie();
            break;

        case "Höchster PCF":
            zeigeHoechsterPCF();
            break;

        case "Niedrigster PCF":
            zeigeNiedrigsterPCF();
            break;
    }

   


}

private void zeigeDurchschnittAlle() {
    double durchschnitt = model.berechneDurchschnittAlle();

    String text =
            "Anzahl Produkte: " + model.zaehleProdukte() + "\n\n" +
            "Durchschnittlicher PCF aller Produkte:\n" +
            String.format("%.2f kg CO2e", durchschnitt);

    view.zeigeTextseite("Durchschnitt / Alle", text);
}

private void zeigeDurchschnittKategorie() {
    Map<String, Double> durchschnitt = model.berechneDurchschnittNachKategorie();

    String text = "";

    for (String kategorie : durchschnitt.keySet()) {
        text = text + kategorie + ": " +
                String.format("%.2f kg CO2e", durchschnitt.get(kategorie)) + "\n";
    }

    view.zeigeTextseite("Durchschnitt / Kategorie", text);
}

private void zeigeHoechsterPCF() {
    ProduktCO2 p = model.findeProduktMitHoechstemPCF();

    if (p != null) {
        String text =
                "Produkt: " + p.getProdukt() + "\n" +
                "Kategorie: " + p.getKategorie() + "\n\n" +
                "PCF: " + String.format("%.2f kg CO2e", p.berechnePCF());

        view.zeigeTextseite("Höchster PCF", text);
    }
}

private void zeigeNiedrigsterPCF() {
    ProduktCO2 p = model.findeProduktMitNiedrigstemPCF();

    if (p != null) {
        String text =
                "Produkt: " + p.getProdukt() + "\n" +
                "Kategorie: " + p.getKategorie() + "\n\n" +
                "PCF: " + String.format("%.2f kg CO2e", p.berechnePCF());

        view.zeigeTextseite("Niedrigster PCF", text);
    }
}

}