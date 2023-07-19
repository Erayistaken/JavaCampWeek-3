package business;

import java.util.List;

import Core.logging.ILogger;
import dataAccess.ICategoryDao;
import dataAccess.jdbcDao;
import entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] loggers;

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {

		if (category.getCategoryName() == category.getCategoryName()) {
			throw new Exception("Kurs ismi tekrar edemez! ");
		}

		categoryDao.add(category);

		for (ILogger iLogger : loggers) {

			iLogger.log(category.getCategoryName());

		}

	}

}
