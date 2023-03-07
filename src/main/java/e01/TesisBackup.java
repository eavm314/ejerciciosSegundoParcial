package e01;

import java.util.Date;

public class TesisBackup {
    private Tesis tesis;
    private Date date;

    public TesisBackup(Tesis tesis) {
        this.tesis = tesis;
        this.date = new Date();
    }

    public Tesis getTesis() {
        return tesis;
    }

    public Date getDate() {
        return date;
    }
}
