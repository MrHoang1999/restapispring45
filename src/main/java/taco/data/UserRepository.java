package taco.data;
import org.springframework.data.repository.CrudRepository;
import com.example.taco.User;
public interface UserRepository extends CrudRepository<User, String>{ //CrudRepo la

} 
