public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow;

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        liczbaProduktow++;
    }

    public String getKod() {
        return kod;
    }
    public String getNazwa() {
        return nazwa;
    }
    public double getCena() {
        return cena;
    }
    public String getKategoria() {
        return kategoria;
    }
    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

     public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        ProduktMenu that = (ProduktMenu) obj;
        return kod.equals(that.kod);
    }

    @Override
    public String toString() {
        return String.format("[%s] %-15s | Cena: %6.2f zł | Kat: %s", kod, nazwa, cena, kategoria);
    }
}
