package demo.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Makes this class to serve rest endpoints
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	private final StudentService studentService;

	// Unnecessary `@Autowired` annotation
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
    
    @GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
}
