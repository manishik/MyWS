package com.javaInterview.basics;

public class SystemProperties {

	public static void main(String[] args) {
		String FILE_SEPARATOR = System.getProperty("file.separator");
		System.out.println(FILE_SEPARATOR);
		
		System.out.println("Line 2"+ System.getProperty("file.separator")+"Same Line ");
		
		System.out.println("Line 3"+ System.getProperty("line.separator")+"Line 4 ");
		
		long startTime = System.currentTimeMillis();
		final long startTm = System.nanoTime();
		
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.vm.name"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("path.separator"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.library.path"));
		System.out.println(System.getProperty("java.compiler"));
		System.out.println(System.getProperty("java.specification.version"));

		/*java.util.Properties properties = System.getProperties();
	    properties.list(System.out);*/
		
		long endTime = System.currentTimeMillis();
		
		final long duration = System.nanoTime() - startTm;
		
		long totalTime = endTime - startTime;
		System.out.println("TotalTime = " + totalTime);
		System.out.println("Duration = " + duration);
		
	}

}
