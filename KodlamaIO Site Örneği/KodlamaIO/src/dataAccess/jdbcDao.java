package dataAccess;

import entities.Category;

public class jdbcDao implements ICategoryDao {

	public void add(Category category) {
		System.out.println("JDBC ile veritabanına eklendi");
	}

}
