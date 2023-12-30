public class Student {
    private String ime;
    private String prezime;
    private String indeks;

    public Student(String ime, String prezime, String indeks) {
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
    }

    public String getIme() {
        return this.ime;
    }
    public String getPrezime() {
        return this.prezime;
    }
    public String getIndeks() {
        return this.indeks;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }
}
