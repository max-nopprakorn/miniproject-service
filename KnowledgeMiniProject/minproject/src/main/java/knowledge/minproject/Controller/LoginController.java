package knowledge.minproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import knowledge.minproject.model.User;
import knowledge.minproject.repository.UserRepo;

@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping(method=RequestMethod.POST)
	public boolean login(@RequestBody User user){
	List<User> list = userRepo.findAll();
		for(User temp : list){
			if(user.getUsername().equals(temp.getUsername())){
				if(user.getPassword().equals(temp.getPassword())){
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
		return true;
	}
}
