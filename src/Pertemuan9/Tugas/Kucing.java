package Pertemuan9.Tugas;

public class Kucing extends Hewan {
    private String ras;
    private String warnaMata;
    private String warnaBulu;

    public Kucing(String nama, int umur, String ras,
                  String warnaBulu, String warnaMata) {
        super(nama, umur);
        this.ras = ras;
        this.warnaMata = warnaMata;
        this.warnaBulu = warnaBulu;

    }
     public String getRas() {
        return ras;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public String getWarnaMata() {
        return warnaMata;
    }
}
