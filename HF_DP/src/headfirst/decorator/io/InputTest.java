package headfirst.decorator.io;

import java.io.*;

public class InputTest {
	
	public static void main(String[] args) throws IOException {
		int c;

		BufferedWriter out = null;
		InputStream in = null;
		try {
			in = new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("C:\\Professional Life\\WorkSpace\\Learning WS\\HF_DP\\src\\headfirst\\decorator\\io\\test.txt")));

			out = new BufferedWriter(
					new FileWriter("C:\\Professional Life\\WorkSpace\\Learning WS\\HF_DP\\src\\headfirst\\decorator\\io\\result.txt"));
			
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
				out.write(c);
			}

			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			in.close();
			out.close();
		}
	}
}
