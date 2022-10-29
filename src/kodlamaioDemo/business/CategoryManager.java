package kodlamaioDemo.business;

import kodlamaioDemo.core.Logger;
import kodlamaioDemo.dataAccess.category.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;
	
	
	public CategoryDao getCategoryDao() {
		return categoryDao;
	}
	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}
	public Logger[] getLoggers() {
		return loggers;
	}
	public void setLoggers(Logger[] loggers) {
		this.loggers = loggers;
	}
	public Category[] getCategories() {
		return categories;
	}
	public void setCategories(Category[] categories) {
		this.categories = categories;
	}
	public CategoryManager() {
		
	}
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers,Category[] categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	public void addCategory(Category category) throws Exception{
		for (Category currentCategory : categories) {
			if (currentCategory != category) {
				if (currentCategory.getId() == category.getId()) {
					throw new Exception("ID of the categories can not be the same");
				}
			}
		}
		for (Category currentCategory : categories) {
			if (currentCategory != category) {
				if (currentCategory.getName() == category.getName()) {
					throw new Exception("Category  can not be the same");
				}
			}
		}
		 categoryDao.add(category);
	        for (Logger logger: loggers) {
	            logger.log(category.getName());
	        }
	}

	
}
