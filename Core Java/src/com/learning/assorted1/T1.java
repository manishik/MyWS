package com.learning.assorted1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T1 {

	static String body = "";

	public static void main(String[] args) {
		try {
			String html = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">^M"
					+ "<HTML><HEAD><TITLE></TITLE>^M"
					+ "<META http-equiv=Content-Type content=\"text/html; charset=us-ascii\">^M"
					+ "<META content=\"MSHTML 6.00.2900.3492\" name=GENERATOR></HEAD>^M"
					+ "<BODY>^M"
					+ "<DIV dir=ltr align=left><FONT size=4><SPAN class=087550110-27072009><FONT ^M"
					+ "color=#0000ff><FONT ^M"
					+ "color=#000000>H</FONT></FONT></SPAN>i<STRONG>,</STRONG></FONT></DIV>^M"
					+ "<P><FONT size=4><STRONG>Testing Bold<BR></STRONG><EM>Testing ^M"
					+ "Italics</EM><BR><U>Testing Underline</U><SPAN class=087550110-27072009><FONT ^M"
					+ "color=#0000ff>&nbsp;<SPAN ^M"
					+ "class=354032807-28072009>&nbsp;&nbsp;</SPAN></FONT></SPAN></FONT></P>^M"
					+ "<P><SPAN class=087550110-27072009><SPAN class=354032807-28072009><FONT ^M"
					+ "color=#0000ff size=4>HTML with<SPAN class=578044107-28072009><FONT face=Arial ^M"
					+ "size=2>&nbsp;out&nbsp;</FONT></SPAN> attachments</FONT></SPAN></SPAN></P>^M"
					+ "<P><FONT size=4><SPAN class=087550110-27072009><FONT color=#0000ff><FONT ^M"
					+ "color=#000000>F</FONT></FONT></SPAN>or testing,<BR>Manish K ^M"
					+ "I</P></FONT></BODY></HTML>^M";

			InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
						
			body = new String(readContent(is));
			
			System.out.println("Body = "+body);
			
			String resultBody = body.replace("^M", "");
			
			System.out.println("ResultBody = "+resultBody);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static byte[] readContent(InputStream ins) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for (int i = 0; (i = ins.read()) != -1;) {
			baos.write(i);
		}
		ins.close();
		return baos.toByteArray();
	}

}
