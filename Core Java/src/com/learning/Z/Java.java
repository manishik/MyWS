package com.learning.Z;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(
					new File(
							"D:\\Manish\\My Work\\IDE\\eclipse\\MyLearningWS\\X\\src\\com\\learning\\Z\\input.txt"));
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String string;
			int i = 0;
			int counter = -1;
			List<String> l1 = new ArrayList<String>();
			
			try {
				while ((string = bufferedReader.readLine()) != null) {
					counter++;
					//System.out.println("Line = " + counter + " " + string);
					if (counter == 0) {
						i = Integer.parseInt(string);
						//System.out.println(i);
					}
					if (counter != 0 && counter <= i) {
						l1.add(string);//adding each row from 1 to 85
					}
				}
				//System.out.println("List = "+l1);
				List ll = null;
				List rows = new ArrayList();
				for(String string2 : l1){
					String[] starr = string2.split("\\s");
					ll = Arrays.asList(starr);
					System.out.println("List row= "+ll);
				}
				
				/*for(int x=0;x<rows.size();x++){
					System.out.println("Z = "+rows.get(x));
				}*/
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
