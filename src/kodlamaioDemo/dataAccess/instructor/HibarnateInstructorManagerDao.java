package kodlamaioDemo.dataAccess.instructor;

import kodlamaioDemo.entities.Instructor;

public class HibarnateInstructorManagerDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
        System.out.println("It has been added via Hibernate!");
		
	}

}
