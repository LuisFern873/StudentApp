package demo.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

// Business layer
@Service
public class StudentService {

	public List<Student> getStudents() {
		return List.of(
			new Student(
				1L,
				"Luis",
				"luis.mendez.l@utec.edu.pe",
				LocalDate.of(2003, Month.AUGUST, 6),
				21
			)
		);
	}

}
