import java.util.logging.Logger;

import Core.logging.DatabaseLogger;
import Core.logging.FileLogger;
import Core.logging.ILogger;
import Core.logging.MailLogger;
import business.CategoryManager;
import business.CoursesManager;
import business.InstructorManager;
import dataAccess.HibernateDao;
import dataAccess.jdbcDao;
import entities.Category;
import entities.Courses;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		

		ILogger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		
		Category category1 = new Category(1, "Mobile Programming");
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		categoryManager.add(category1);
		
		
		Courses courses1 = new Courses(2 , "Programlamaya giriş için temel kurs", 0);
		CoursesManager coursesManager = new CoursesManager(new (HibernateDao(), loggers);
		coursesManager.add(courses1);
		
		
		 Instructor instructor1  = new Instructor(3,"Engin ","Demiroğ");
		 InstructorManager instructorManager = new InstructorManager(loggers , new HibernateDao());
		 instructorManager.add(instructor1);
	}

}
