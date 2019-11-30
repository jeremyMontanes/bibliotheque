package MongoDB;

import java.util.List;

import data.Document;import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Service;

//@RepositoryRestResource(collectionResourceRel = "Document", path = "Document")
@Service
public interface DocumentRepository extends MongoRepository<Document, Long> {

    //List<Document> findByType(@Param("type") String type);

    Document findById(@Param("id") long id);

    Document findBy



}