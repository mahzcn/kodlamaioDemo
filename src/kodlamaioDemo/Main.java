package kodlamaioDemo;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.core.DatabaseLogger;
import kodlamaioDemo.core.FileLogger;
import kodlamaioDemo.core.Logger;
import kodlamaioDemo.dataAccess.category.HibarnateCategoryManagerDao;
import kodlamaioDemo.entities.Category;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger logger1 = new FileLogger();
		Logger logger2 = new DatabaseLogger();
		
		Logger[] loggers = {logger1,logger2};
		Category category1 = new Category(0, "Java");
		Category[] categoryes = {category1};
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.setCategories(categoryes);
		categoryManager.setCategoryDao(new HibarnateCategoryManagerDao());
		categoryManager.setLoggers(loggers);
		categoryManager.addCategory(category1);
	}

}

//kodlama.io web sitesinin ana sayfasında 
//bulunan eğitmen, kategori ve kurs bölümlerini 
//katmanlı mimaride kodlamak istiyoruz.
//
//Önceki derste yaptığımız tekniklerle 
//hem jdbc hem de hibernate üzerinde yazmış gibi simüle ediniz.
//
//Çoklu loglama yapısını simule ediniz.
//
//Aşağıdaki isterleri gerçekleştiriniz.
//
//Kurs ismi tekrar edemez
//Kategori ismi tekrar edemez
//Bir kursun fiyatı 0 dan küçük olamaz
//Kodlarınızı github'a aktarınız
//
//Diğer arkadaşlarınızın kodlarını inceleyip beğenirseniz yıldızlayınız.
//
//Not: Aldığınız yıldızlar github sayfa kaliteniz için sektörde çok belirleyicidir.

