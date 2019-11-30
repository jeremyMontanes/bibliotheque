package data;

import org.springframework.data.annotation.Id;

public class Document {

    @Id
    public long id;

    //savoir le type deu document (livre , dvd , figurine )
    public String type;
    public String nom;

    // partie commune entre les livre /DVD/ BLU-RAY
    public String auteur;
    public String dateSortie;

    public Document(Long id, String type,String nom, String auteur, String dateSortie) {
        this.id = id;
        this.type = type;
        this.nom = nom;
        this.auteur = auteur;
        this.dateSortie = dateSortie;
    }

    public String toString(){
        return id + " " + type+ " " + nom + " " + auteur + " " + dateSortie;
    }

}
