package kodlamaioDemo.business;

import kodlamaioDemo.core.Logger;
import kodlamaioDemo.dataAccess.course.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private Course[] courses;
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager() {
		
	}
	public CourseManager(Course[] courses,CourseDao courseDao,Logger[] loggers) {
		this.courses = courses;
		this.courseDao = courseDao;
		this.loggers = loggers;
		
		
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	public CourseDao getCourseDao() {
		return courseDao;
	}
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	public Logger[] getLoggers() {
		return loggers;
	}
	public void setLoggers(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void addCourse(Course course) throws Exception{
		if (course.getCoursePrice()<0) {
			throw new Exception("Course prices could not be lower than 0!");
		}
		for (Course currentCourse : courses) {
			if (currentCourse.getCourseName() == course.getCourseName()) {
				throw new Exception("Name of the courses cold not be the same!!");
			}
		}
		for (Course currentCourse : courses) {
			if (currentCourse != course) {
				if (currentCourse.getId() == course.getId()) {
					throw new Exception("Id of the courses could not be the same!!");
				}
			}
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
}
