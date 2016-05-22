package com.javaInterview.IO.Serialization;

import java.io.*;

class SuperNotSerial {
	public static void main(String[] args) {
		Dog dog = new Dog(35, "Fido");
		System.out.println("before: " + dog.name + " " + dog.weight);
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("testSer.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(dog);
			objectOutputStream.close();
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		try {
			FileInputStream fileInputStream = new FileInputStream("testSer.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			dog = (Dog) objectInputStream.readObject();
			objectInputStream.close();
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		System.out.println("after: " + dog.name + " " + dog.weight);
		//The key here is that because Animal is not serializable, when the Dog was
		//deserialized, the Animal constructor ran and reset the Dog's inherited weight variable.
	}
}

class Dog extends Animal implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String name;

	Dog(int w, String n) {
		this.name = n; // not inherited
		weight = w; // inherited
	}
}

class Animal { // not serializable !
	int weight = 42;
}