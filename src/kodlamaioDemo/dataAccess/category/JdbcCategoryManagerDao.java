package kodlamaioDemo.dataAccess.category;

import kodlamaioDemo.entities.Category;

public class JdbcCategoryManagerDao implements CategoryDao{

	@Override
	public void add(Category category) {
        System.out.println("It has been added via Jdbc!");
		
	}
	
}
