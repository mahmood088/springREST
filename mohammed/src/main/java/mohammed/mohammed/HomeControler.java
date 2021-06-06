package mohammed.mohammed;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {

	
	@GetMapping("/home")
	public String gethome() {
		return "home is calling.... "+LocalDateTime.now();
	}
	
	@PostMapping("/home")
	public String posthome(@RequestBody Student student) {
		return "home post is calling.... "+LocalDateTime.now()+"   student details:"+student.toString();
	}
	
	@PutMapping("/home")
	public String puthome() {
		return "home put is calling.... "+LocalDateTime.now();
	}
	
	@DeleteMapping("/home")
	public String deletehome() {
		return "home delete is calling.... "+LocalDateTime.now();
	}
}
