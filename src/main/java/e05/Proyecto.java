package e05;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String name;
    private List<String> files = new ArrayList<>();

    public Proyecto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Proyecto setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getFiles() {
        return files;
    }

    private void setFiles(List<String> files) {
        this.files = files;
    }

    public Proyecto addFile(String file) {
        files.add(file);
        return this;
    }

    public CommitProyecto createBackup() {
        Proyecto backup = new Proyecto(this.name);
        backup.setFiles(new ArrayList<>(this.files));
        return new CommitProyecto(backup);

    }

    public void show() {
        System.out.println("Nombre: "+ name);
        System.out.println("---------------------------");
        System.out.println("Archivos: ");
        for (String file : files) {
            System.out.println("> "+file);
        }
        System.out.println("***************************************");
    }
}
