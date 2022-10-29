package kodlamaioDemo.dataAccess.course;

import kodlamaioDemo.entities.Course;

public class JdbcCourseManagerDao implements CourseDao{

	@Override
	public void add(Course course) {
        System.out.println("It has been added via JDBC!");
		
	}

}
