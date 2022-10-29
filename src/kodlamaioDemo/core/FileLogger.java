package kodlamaioDemo.core;

public class FileLogger implements Logger{



	@Override
	public void log(String data) {
		System.out.println("fileLogger ile loglandı");		
	}

}
