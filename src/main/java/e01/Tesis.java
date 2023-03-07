package e01;

public class Tesis {
    private String titulo;
    private String contenido = "";

    public Tesis(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Tesis setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Tesis addContenido(String contenido) {
        this.contenido += contenido+'\n';
        return this;
    }

    public TesisBackup createBackup() {
        Tesis backup = new Tesis(this.titulo);
        backup.setContenido(this.contenido);
        return new TesisBackup(backup);

    }

    public void show() {
        System.out.println("Titulo: "+titulo);
        System.out.println("---------------------------");
        System.out.println(contenido);
        System.out.println("***************************************");
    }
}
