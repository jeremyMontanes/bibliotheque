package data;

public class Figurine extends Document {

    //partie figurine
    // a mettre dans le document qui concernera les figurine
    public String desc;

    public Figurine(long id, String type, String nom, String auteur, String dateSortie, String desc) {
        super(id, type, nom, auteur, dateSortie);

        this.desc = desc;
    }
}
