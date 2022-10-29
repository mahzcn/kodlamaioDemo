package kodlamaioDemo.core;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("database Logger ile loglandı");
	}

}
