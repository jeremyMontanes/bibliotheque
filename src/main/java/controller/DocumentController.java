package controller;


import MongoDB.DocumentRepository;
import data.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Document")
public class DocumentController {

    @Autowired
    private DocumentRepository repository ;

    @GetMapping(value = "/add/{id}/{type}/{nom}/{auteur}/{dateSortie}")
    public String addDocument(@PathVariable long id, @PathVariable String type, @PathVariable String nom, @PathVariable String auteur, @PathVariable String dateSortie){
        Document document = new Document(id,type,nom,auteur,dateSortie);
        repository.insert(document);
        return "reussi" + id + type;
    }

    @GetMapping(value="/get/{id}")
    public String getId(@PathVariable long id){
        return repository.findById(id).toString();
    }


}
