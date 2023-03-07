package e05;

import java.util.Date;

public class CommitProyecto {
    private Proyecto proyecto;
    private Date date;

    public CommitProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
        this.date = new Date();
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Date getDate() {
        return date;
    }
}
