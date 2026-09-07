/**
 * Die Klasse PCFModel verwaltet alle Produkte der Anwendung
 * und stellt Methoden zur Auswertung der CO2-Daten bereit.
 * Dazu gehören Berechnungen des Gesamt-PCF, des durchschnittlichen
 * PCF sowie Auswertungen nach Kategorien.
 * Diese Klasse bildet das Model des MVC-Konzepts.
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PCFModel {

    private ArrayList<ProduktCO2> produkte;

    public PCFModel() {
        produkte = new ArrayList<>();
        erstelleProdukte();
    }

    public ArrayList<ProduktCO2> getProdukte() {
        return produkte;
    }

    public int zaehleProdukte() {
        return produkte.size();
    }

    public double berechneGesamtPCF() {
        // TODO: Berechnen Sie den Gesamt-PCF aller Produkte.
        return 0;
    }

    public ProduktCO2 findeProdukt(String produktname) {
        for (int i = 0; i < produkte.size(); i++) {
            if (produkte.get(i).getProdukt().equals(produktname)) {
                return produkte.get(i);
            }
        }

        return null;
    }

    public Map<String, Double> berechneKategoriePCF() {
        // TODO: Berechnen Sie die Summe des PCF je Kategorie.
        return new LinkedHashMap<>();
    }
    
    public double berechneDurchschnittAlle() {
    // TODO: Berechnen Sie den durchschnittlichen PCF aller Produkte.
    return 0;
}

public Map<String, Double> berechneDurchschnittNachKategorie() {
    // TODO: Berechnen Sie den durchschnittlichen PCF je Kategorie.
    return new LinkedHashMap<>();

    
}

public ProduktCO2 findeProduktMitHoechstemPCF() {
    // TODO: Ermitteln Sie das Produkt mit dem höchsten PCF.
    return null;
}

public ProduktCO2 findeProduktMitNiedrigstemPCF() {
     // TODO: Ermitteln Sie das Produkt mit dem niedrigsten PCF.
    return null;
}

    private void erstelleProdukte() {
        produkte.add(new ProduktCO2("Business-Laptop Dell Latitude", "Laptop", 90, 180, 20, 55, 5, 5));
        produkte.add(new ProduktCO2("Business-Laptop Lenovo ThinkPad", "Laptop", 95, 190, 22, 60, 6, 5));
        produkte.add(new ProduktCO2("Business-Laptop HP EliteBook", "Laptop", 88, 175, 20, 52, 5, 5));
        produkte.add(new ProduktCO2("Apple MacBook Air", "Laptop", 55, 85, 12, 25, 3, 5));
        produkte.add(new ProduktCO2("Apple MacBook Pro 14", "Laptop", 110, 220, 25, 85, 9, 5));
        produkte.add(new ProduktCO2("Apple MacBook Pro 16", "Laptop", 130, 250, 30, 100, 10, 5));
        produkte.add(new ProduktCO2("Gaming-Laptop", "Laptop", 150, 280, 35, 180, 15, 4));
        produkte.add(new ProduktCO2("Schüler-Laptop 14 Zoll", "Laptop", 70, 130, 15, 40, 4, 5));
        produkte.add(new ProduktCO2("Convertible Notebook", "Laptop", 85, 160, 18, 50, 5, 5));
        produkte.add(new ProduktCO2("Thin Client", "Computer", 35, 60, 8, 45, 3, 6));

        produkte.add(new ProduktCO2("Desktop-PC Office", "Computer", 120, 220, 25, 300, 12, 6));
        produkte.add(new ProduktCO2("Desktop-PC Workstation", "Computer", 220, 420, 45, 650, 25, 6));
        produkte.add(new ProduktCO2("Mini-PC", "Computer", 60, 110, 12, 120, 6, 6));
        produkte.add(new ProduktCO2("All-in-One-PC", "Computer", 130, 240, 28, 250, 12, 6));
        produkte.add(new ProduktCO2("CAD-Workstation", "Computer", 280, 550, 60, 900, 35, 6));
        produkte.add(new ProduktCO2("Server 1HE", "Server", 350, 700, 80, 3500, 80, 5));
        produkte.add(new ProduktCO2("Rack-Server 2HE", "Server", 500, 950, 110, 5200, 120, 5));
        produkte.add(new ProduktCO2("Storage-Server", "Server", 600, 1100, 130, 4800, 130, 5));
        produkte.add(new ProduktCO2("NAS 4-Bay", "Server", 120, 220, 25, 600, 15, 5));
        produkte.add(new ProduktCO2("NAS 8-Bay", "Server", 220, 400, 45, 1100, 30, 5));

        produkte.add(new ProduktCO2("24-Zoll-Monitor", "Bildschirm", 80, 150, 18, 160, 8, 7));
        produkte.add(new ProduktCO2("27-Zoll-Monitor", "Bildschirm", 100, 190, 22, 210, 10, 7));
        produkte.add(new ProduktCO2("32-Zoll-Monitor", "Bildschirm", 140, 260, 30, 310, 15, 7));
        produkte.add(new ProduktCO2("Ultrawide-Monitor", "Bildschirm", 180, 330, 40, 420, 20, 7));
        produkte.add(new ProduktCO2("Beamer", "Bildschirm", 180, 300, 35, 650, 20, 6));
        produkte.add(new ProduktCO2("Interaktives Display", "Bildschirm", 450, 800, 90, 900, 40, 8));
        produkte.add(new ProduktCO2("Dokumentenkamera", "Peripherie", 30, 55, 8, 20, 2, 6));
        produkte.add(new ProduktCO2("Webcam HD", "Peripherie", 12, 25, 4, 8, 1, 4));
        produkte.add(new ProduktCO2("Webcam 4K", "Peripherie", 20, 40, 5, 12, 1, 4));
        produkte.add(new ProduktCO2("Konferenzkamera", "Peripherie", 60, 120, 15, 40, 4, 5));

        produkte.add(new ProduktCO2("Smartphone", "Mobilgerät", 20, 35, 5, 10, 2, 4));
        produkte.add(new ProduktCO2("iPhone 16", "Mobilgerät", 24, 28, 4, 4, 1, 4));
        produkte.add(new ProduktCO2("iPhone 16 Plus", "Mobilgerät", 26, 30, 4, 4, 1, 4));
        produkte.add(new ProduktCO2("Android Smartphone Mittelklasse", "Mobilgerät", 18, 30, 5, 9, 2, 4));
        produkte.add(new ProduktCO2("Android Smartphone High-End", "Mobilgerät", 28, 45, 6, 12, 2, 4));
        produkte.add(new ProduktCO2("Tablet 10 Zoll", "Mobilgerät", 35, 65, 8, 20, 2, 5));
        produkte.add(new ProduktCO2("iPad", "Mobilgerät", 40, 75, 8, 22, 2, 5));
        produkte.add(new ProduktCO2("Rugged Tablet", "Mobilgerät", 65, 120, 12, 35, 4, 5));
        produkte.add(new ProduktCO2("E-Book-Reader", "Mobilgerät", 18, 30, 4, 5, 1, 6));
        produkte.add(new ProduktCO2("Smartwatch", "Mobilgerät", 8, 15, 2, 3, 1, 3));

        produkte.add(new ProduktCO2("Laserdrucker SW", "Drucker", 120, 220, 30, 350, 15, 7));
        produkte.add(new ProduktCO2("Laserdrucker Farbe", "Drucker", 180, 330, 40, 500, 20, 7));
        produkte.add(new ProduktCO2("Multifunktionsdrucker", "Drucker", 220, 400, 50, 600, 25, 7));
        produkte.add(new ProduktCO2("Tintenstrahldrucker", "Drucker", 70, 120, 18, 120, 8, 6));
        produkte.add(new ProduktCO2("Dokumentenscanner", "Drucker", 80, 140, 20, 90, 8, 7));
        produkte.add(new ProduktCO2("Etikettendrucker", "Drucker", 40, 80, 10, 60, 4, 6));
        produkte.add(new ProduktCO2("3D-Drucker", "Drucker", 180, 350, 45, 500, 20, 6));
        produkte.add(new ProduktCO2("Plotter", "Drucker", 400, 750, 100, 900, 45, 8));
        produkte.add(new ProduktCO2("Toner-Kartusche", "Verbrauchsmaterial", 4, 8, 2, 0, 1, 1));
        produkte.add(new ProduktCO2("Druckerpapier 500 Blatt", "Verbrauchsmaterial", 2, 3, 1, 0, 0.2, 1));

        produkte.add(new ProduktCO2("Switch 8-Port", "Netzwerk", 25, 45, 6, 90, 3, 6));
        produkte.add(new ProduktCO2("Switch 24-Port", "Netzwerk", 70, 130, 15, 250, 8, 6));
        produkte.add(new ProduktCO2("Switch 48-Port", "Netzwerk", 120, 220, 25, 500, 12, 6));
        produkte.add(new ProduktCO2("WLAN Access Point", "Netzwerk", 30, 55, 8, 120, 3, 5));
        produkte.add(new ProduktCO2("Router KMU", "Netzwerk", 50, 90, 10, 180, 5, 6));
        produkte.add(new ProduktCO2("Firewall Appliance", "Netzwerk", 90, 170, 20, 350, 10, 6));
        produkte.add(new ProduktCO2("LTE-Router", "Netzwerk", 35, 65, 8, 100, 4, 5));
        produkte.add(new ProduktCO2("Glasfaser-Modem", "Netzwerk", 25, 45, 6, 80, 3, 6));
        produkte.add(new ProduktCO2("Patchpanel", "Netzwerk", 20, 35, 5, 0, 2, 10));
        produkte.add(new ProduktCO2("Netzwerkschrank", "Netzwerk", 180, 250, 60, 0, 25, 12));

        produkte.add(new ProduktCO2("Tastatur", "Zubehör", 8, 15, 3, 2, 1, 5));
        produkte.add(new ProduktCO2("Maus", "Zubehör", 5, 10, 2, 1, 0.5, 4));
        produkte.add(new ProduktCO2("Headset", "Zubehör", 10, 20, 3, 5, 1, 4));
        produkte.add(new ProduktCO2("USB-C-Dockingstation", "Zubehör", 25, 50, 6, 15, 2, 5));
        produkte.add(new ProduktCO2("Notebook-Netzteil", "Zubehör", 8, 15, 3, 8, 1, 5));
        produkte.add(new ProduktCO2("USB-Stick 64 GB", "Speicher", 2, 4, 1, 0.2, 0.2, 4));
        produkte.add(new ProduktCO2("Externe SSD 1 TB", "Speicher", 15, 30, 4, 3, 1, 5));
        produkte.add(new ProduktCO2("Externe HDD 4 TB", "Speicher", 25, 45, 6, 20, 2, 5));
        produkte.add(new ProduktCO2("Powerbank", "Zubehör", 12, 25, 4, 5, 1, 4));
        produkte.add(new ProduktCO2("USB-C-Kabel", "Zubehör", 1, 2, 0.5, 0, 0.1, 3));

        produkte.add(new ProduktCO2("SSD intern 1 TB", "Komponente", 18, 35, 4, 5, 1, 5));
        produkte.add(new ProduktCO2("HDD intern 4 TB", "Komponente", 30, 55, 6, 35, 2, 5));
        produkte.add(new ProduktCO2("RAM-Modul 16 GB", "Komponente", 12, 25, 3, 0, 1, 6));
        produkte.add(new ProduktCO2("Mainboard", "Komponente", 50, 100, 10, 0, 4, 6));
        produkte.add(new ProduktCO2("CPU", "Komponente", 35, 80, 5, 0, 2, 6));
        produkte.add(new ProduktCO2("Grafikkarte Office", "Komponente", 60, 120, 10, 120, 5, 5));
        produkte.add(new ProduktCO2("Grafikkarte High-End", "Komponente", 180, 350, 25, 600, 15, 5));
        produkte.add(new ProduktCO2("PC-Netzteil", "Komponente", 40, 80, 8, 30, 4, 6));
        produkte.add(new ProduktCO2("PC-Gehäuse", "Komponente", 45, 70, 12, 0, 5, 8));
        produkte.add(new ProduktCO2("CPU-Kühler", "Komponente", 15, 25, 4, 0, 1, 6));

        produkte.add(new ProduktCO2("USV klein", "Rechenzentrum", 80, 150, 20, 100, 10, 5));
        produkte.add(new ProduktCO2("USV Rack", "Rechenzentrum", 200, 350, 45, 350, 30, 5));
        produkte.add(new ProduktCO2("Server-Rack 42HE", "Rechenzentrum", 500, 800, 150, 0, 80, 12));
        produkte.add(new ProduktCO2("Klimagerät Serverraum", "Rechenzentrum", 700, 1200, 180, 6000, 100, 10));
        produkte.add(new ProduktCO2("PDU Steckdosenleiste", "Rechenzentrum", 30, 60, 8, 20, 3, 8));
        produkte.add(new ProduktCO2("Rack-KVM-Konsole", "Rechenzentrum", 120, 220, 25, 100, 8, 8));
        produkte.add(new ProduktCO2("Backup-Tape-Library", "Rechenzentrum", 600, 1100, 120, 900, 80, 8));
        produkte.add(new ProduktCO2("LTO-Band", "Speicher", 8, 12, 3, 0, 1, 10));
        produkte.add(new ProduktCO2("Server-Lüftermodul", "Rechenzentrum", 15, 30, 4, 20, 1, 5));
        produkte.add(new ProduktCO2("Server-Netzteil redundant", "Rechenzentrum", 50, 100, 8, 80, 4, 5));

        produkte.add(new ProduktCO2("IP-Telefon", "Kommunikation", 25, 45, 6, 50, 3, 6));
        produkte.add(new ProduktCO2("DECT-Basisstation", "Kommunikation", 20, 35, 5, 40, 2, 6));
        produkte.add(new ProduktCO2("VoIP-Konferenztelefon", "Kommunikation", 45, 80, 10, 60, 4, 6));
        produkte.add(new ProduktCO2("Smartboard-Stiftset", "Zubehör", 3, 6, 1, 0, 0.2, 3));
        produkte.add(new ProduktCO2("VR-Brille", "Spezialgerät", 80, 160, 18, 40, 6, 4));
        produkte.add(new ProduktCO2("AR-Brille", "Spezialgerät", 100, 200, 22, 45, 8, 4));
        produkte.add(new ProduktCO2("Barcode-Scanner", "Peripherie", 35, 65, 8, 20, 3, 6));
        produkte.add(new ProduktCO2("Zeiterfassungsterminal", "Peripherie", 60, 110, 15, 80, 5, 8));
        produkte.add(new ProduktCO2("Digital-Signage-Player", "Spezialgerät", 50, 90, 12, 150, 5, 6));
        produkte.add(new ProduktCO2("Digital-Signage-Display", "Bildschirm", 220, 400, 60, 700, 25, 8));
    }
}