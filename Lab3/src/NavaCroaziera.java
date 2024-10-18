class NavaCroaziera extends Nava{
    protected int nrPasageri;

    public NavaCroaziera( int nrPasageri,String nume, String pavilion) {
        super(nume, pavilion);
        this.nrPasageri = nrPasageri;
    }

    @Override
    public String toString() {
        return "NavaCroaziera-" +super.toString()+
                ", nrPasageri=" + nrPasageri ;
    }

    @Override
    public void utilizare() {
        System.out.println("Croaziere de lux");
    }
}
