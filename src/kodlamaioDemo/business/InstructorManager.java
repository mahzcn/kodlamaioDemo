package kodlamaioDemo.business;

import kodlamaioDemo.core.Logger;
import kodlamaioDemo.dataAccess.instructor.InstructorDao;
import kodlamaioDemo.entities.Instructor;

public class InstructorManager {
	private Instructor[] instructors;
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager() {
		
	}
	public InstructorManager(Instructor[] instructors,InstructorDao instructorDao,Logger[] loggers) {
		this.instructors = instructors;
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		
		
	}
	public Instructor[] getInstructors() {
		return instructors;
	}
	public void setInstructors(Instructor[] instructors) {
		this.instructors = instructors;
	}
	public InstructorDao getInstructorDao() {
		return instructorDao;
	}
	public void setInstructorDao(InstructorDao instructorDao) {
		this.instructorDao = instructorDao;
	}
	public Logger[] getLoggers() {
		return loggers;
	}
	public void setLoggers(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void addInstructor(Instructor instructor)throws Exception {
		for (Instructor instructor1 : instructors) {
			if (instructor1 != instructor){
				if (instructor1.getInstructorName() == instructor.getInstructorName()) {
					throw new Exception("Instructor names cannot be the same!!");
				}
				instructorDao.add(instructor);
				for (Logger logger : loggers) {
					logger.log(instructor.getInstructorName());
				}
			}
		}
	
	}
}
