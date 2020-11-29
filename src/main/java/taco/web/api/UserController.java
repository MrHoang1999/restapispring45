package taco.web.api;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.taco.*;
import taco.data.*;

@RestController
@RequestMapping(path = "/user", produces = "application/json")
@CrossOrigin(origins = "*")
public class UserController {
	public UserRepository userRepo;
	@Autowired
	EntityLinks entityLinks;
	
	public UserController(UserRepository userRepositpry) {
		this.userRepo = userRepo;
	}
	
	@GetMapping
	public Iterable<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping(value = "/{id}" )
	public User userById(@PathVariable("id") String id) {
		Optional<User> optUser = userRepo.findById(id);
		if(optUser.isPresent()) {
			return optUser.get();
		}
		return null;
	}
}
