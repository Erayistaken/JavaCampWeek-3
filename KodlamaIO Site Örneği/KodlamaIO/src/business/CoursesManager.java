package business;

import Core.logging.ILogger;
import dataAccess.ICoursesDao;
import entities.Courses;

public class CoursesManager {

	private ICoursesDao coursesDao;
	private ILogger[] loggers;

	public CoursesManager(ICoursesDao coursesDao,ILogger[] loggers) {
		this.loggers = loggers;
		this.coursesDao = coursesDao;
	}

	public void add(Courses courses) throws Exception {

		if (courses.getCoursePrice() < 0) {
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz");
		}
		
		coursesDao.add(courses);
		
		for (ILogger iLogger : loggers) {
			iLogger.log(courses.getCourseName());
		}

	}

}
