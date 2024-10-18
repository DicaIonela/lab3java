class Feribot extends NavaCroaziera{
    private int nrAuto;
    public Feribot(int nrAuto,String nume, String pavilion, int nrPasageri) {
        super(nrPasageri, pavilion, nume);
        this.nrAuto=nrAuto;
    }

    @Override
    public String toString() {
        return "Feribot-" +super.toString()+
                "nrAuto=" + nrAuto+"\n";
    }
    @Override
    public void utilizare() {
        System.out.println("Transport vehicule si pasageri");
    }
}
