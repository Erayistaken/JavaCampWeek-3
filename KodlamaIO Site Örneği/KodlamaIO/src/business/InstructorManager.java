package business;

import Core.logging.ILogger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private ILogger[] loggers;

	public InstructorManager(InstructorDao instructorDao, ILogger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor Instructor) {

		instructorDao.add(Instructor);

		for (ILogger logger : loggers) {
			logger.log(Instructor.getInstructorName());
		}

	}

}
