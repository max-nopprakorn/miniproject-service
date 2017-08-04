package knowledge.minproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import knowledge.minproject.model.User;

public interface UserRepo extends MongoRepository<User,String>{

}
