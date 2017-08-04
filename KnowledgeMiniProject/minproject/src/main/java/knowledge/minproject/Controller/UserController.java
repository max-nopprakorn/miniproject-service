package knowledge.minproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import knowledge.minproject.model.User;
import knowledge.minproject.repository.UserRepo;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping(value ="/create",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public User create(@RequestBody User user){
		userRepo.save(user);
		return user;
	}
	
	@RequestMapping(value = "/getalluser",method=RequestMethod.GET)
	public List<User> getAll(){
		List<User> list = userRepo.findAll();
		return list;
	}
}
