abstract class Nava {
    protected String nume;
    protected String pavilion;

    public Nava(String nume, String pavilion) {
        this.nume = nume;
        this.pavilion = pavilion;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return  "nume=" + nume  +
                ", pavilion=" + pavilion;
    }
    public abstract void utilizare();
}
