package esprit.fgsc.congesmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import esprit.fgsc.congesmicroservice.entities.Conges;

@Repository
public interface ICongesRepository extends MongoRepository<Conges, String> {
}
