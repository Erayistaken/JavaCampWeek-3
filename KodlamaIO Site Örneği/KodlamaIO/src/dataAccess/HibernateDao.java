package dataAccess;

import entities.Category;

public class HibernateDao implements ICategoryDao {

	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
