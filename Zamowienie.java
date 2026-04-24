import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private KlientKawiarni klient;
    private List<ProduktMenu> listaProduktow;
    private boolean czyOplacone;

    public Zamowienie(KlientKawiarni klient) {
        this.klient = klient;
        this.listaProduktow = new ArrayList<>();
        this.czyOplacone = false;
    }

    public void dodajProdukt(ProduktMenu p) {
        if (p != null) {
            this.listaProduktow.add(p);
        }
    }

    public double policzWartosc() {
        double suma = 0.0;
        for (ProduktMenu p : listaProduktow) {
            suma += p.getCena();
        }
        return suma;
    }

    public int policzLiczbeProduktow() {
        return listaProduktow.size();
    }

    public void oznaczJakoOplacone() {
        this.czyOplacone = true;
    }

    @Override
    public String toString() {
        String status = czyOplacone ? "OPŁACONE" : "NIEOPŁACONE";
        StringBuilder sb = new StringBuilder();
        sb.append("ZAMÓWIENIE [Status: ").append(status).append("]\n");
        sb.append("Klient: ").append(klient.toString()).append("\n");
        sb.append("Pozycje:\n");
        for (ProduktMenu p : listaProduktow) {
            sb.append("  - ").append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}