public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String emial){
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = emial;
    }

    public void info(){
        System.out.println("Id Klienta: "+idKlienta);
        System.out.println("Imie i nazwisko: "+imie+" "+nazwisko);
        System.out.println("Emial: "+email);
    }

    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        KlientKawiarni that = (KlientKawiarni) obj;
        return idKlienta == that.idKlienta;
    }
}
