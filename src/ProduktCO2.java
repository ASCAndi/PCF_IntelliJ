/**
 * Die Klasse ProduktCO2 repräsentiert ein einzelnes Produkt
 * der MünsterlandIT GmbH. Zu jedem Produkt werden die
 * CO2-Emissionen der einzelnen Lebenszyklusphasen gespeichert.
 * Außerdem können der gesamte Product Carbon Footprint (PCF)
 * und die CO2-Emissionen pro Nutzungsjahr berechnet werden.
 */


public class ProduktCO2 {
    private String produkt;
    private String kategorie;
    private double rohstoffe;
    private double produktion;
    private double transport;
    private double nutzung;
    private double recycling;
    private int nutzungsdauer;

    public ProduktCO2(String produkt, String kategorie, double rohstoffe, double produktion,
                      double transport, double nutzung, double recycling, int nutzungsdauer) {
        this.produkt = produkt;
        this.kategorie = kategorie;
        this.rohstoffe = rohstoffe;
        this.produktion = produktion;
        this.transport = transport;
        this.nutzung = nutzung;
        this.recycling = recycling;
        this.nutzungsdauer = nutzungsdauer;
    }

    public String getProdukt() { return produkt; }
    public String getKategorie() { return kategorie; }
    public double getRohstoffe() { return rohstoffe; }
    public double getProduktion() { return produktion; }
    public double getTransport() { return transport; }
    public double getNutzung() { return nutzung; }
    public double getRecycling() { return recycling; }
    public int getNutzungsdauer() { return nutzungsdauer; }

    public double berechnePCF() {
        // TODO: Berechnen Sie den gesamten PCF des Produkts.
        return 0;
    }

    public double berechneCO2ProJahr() {
        // TODO: Berechnen Sie den durchschnittlichen CO2-Ausstoß pro Nutzungsjahr.
        return 0;
    }
}