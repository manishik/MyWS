package com.javaInterview.IO.Externalizable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyExternalizable implements Externalizable {

	private String userName;
	private String passWord;
	private Integer roll;

	public MyExternalizable() {
	}

	public MyExternalizable(String userName, String passWord, Integer roll) {
		this.userName = userName;
		this.passWord = passWord;
		this.roll = roll;
	}

	public void writeExternal(ObjectOutput oo) throws IOException {
		oo.writeObject(userName);
		oo.writeObject(roll);
	}

	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
		userName = (String) oi.readObject();
		roll = (Integer) oi.readObject();
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("userName: ");
		stringBuilder.append(userName);
		stringBuilder.append("  passWord: ");
		stringBuilder.append(passWord);
		stringBuilder.append("  roll: ");
		stringBuilder.append(roll);
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		try {
			MyExternalizable m = new MyExternalizable("manish", "manish11", 04);
			System.out.println(m);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Temp.txt"));
			oos.writeObject(m);
			oos.close();

			System.out.println("***********************************************************************");
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Temp.txt"));
			MyExternalizable mm = (MyExternalizable) ois.readObject();
			System.out.println(mm);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(MyExternalizable.class.getName()).log(
					Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(MyExternalizable.class.getName()).log(
					Level.SEVERE, null, ex);
		}
	}
}
