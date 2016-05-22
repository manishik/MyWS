package com.learning;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Here is an example of parsing of XML data
 * with help of document-handler.
 */

public class SimpleSaxHandler {
	
	/**
	 * Application entry point
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		try {
			// creates and returns new instance of SAX-implementation:
			SAXParserFactory factory = SAXParserFactory.newInstance();

			// create SAX-parser...
			SAXParser parser = factory.newSAXParser();
			// .. define our handler:
			SaxHandler handler = new SaxHandler();

			// and parse:
			parser.parse("SimpleXML.xml", handler);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Our own implementation of SAX handler reading
	 * a purchase-order data.
	 */
	private static final class SaxHandler extends DefaultHandler {
		private String value;
		// invoked when document-parsing is started:
		public void startDocument() throws SAXException {
			System.out.println("Document processing started");
		}

		// notifies about finish of parsing:
		public void endDocument() throws SAXException {
			System.out.println("Document processing finished");
		}

		// we enter to element 'qName':
		public void startElement(String uri, String localName, String qName,
				Attributes attrs) throws SAXException {

			/*if (qName.equals("purchase-order")) {
			} else if (qName.equals("date")) {
				System.out.println("date = "+qName +"="+value);
			} else if (qName.equals("number")) {
			} else if (qName.equals("purchased-by")) {
			} else if (qName.equals("address")) {
			} else if (qName.equals("order-items")) {
			} else if (qName.equals("item")) {
			} else if (qName.equals("code")) {
			} else if (qName.equals("type")) {
			} else if (qName.equals("label")) {
			} else if (qName.equals("Manish")) {
				throw new IllegalArgumentException("Element '" + qName
						+ "' is not allowed here");
			}*/
		}

		// we leave element 'qName' without any actions:
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			/*if (qName.equals("date")) {
				System.out.println(qName +"="+value);
			} */
		}
		
		public void characters(char ch[], int start, int length) {
			removeInvalidXMLCharacters(new String(ch, start, length));
		}
		
		
		 public static String removeInvalidXMLCharacters(String s) {
			StringBuilder out = new StringBuilder(); // Used to hold the output.
			int codePoint; // Used to reference the current character.
			//String ss = "\ud801\udc00";                           // This is actualy one unicode character, represented by two code units!!!.
			//System.out.println(ss.codePointCount(0, ss.length()));// See: 1
			int i = 0;
			while (i < s.length()) {
				System.out.println("i=" + i);
				codePoint = s.codePointAt(i); // This is the unicode code of the character.
				if ((codePoint == 0x9) || // Consider testing larger ranges first to improve speed. 
						(codePoint == 0xA) ||
						(codePoint == 0xD) ||
						((codePoint >= 0x20) && (codePoint <= 0xD7FF)) ||
						((codePoint >= 0xE000) && (codePoint <= 0xFFFD)) ||
						((codePoint >= 0x10000) && (codePoint <= 0x10FFFF))) {
					out.append(Character.toChars(codePoint));
				}
				i += Character.charCount(codePoint); // Increment with the number of code units(java chars) needed to represent a Unicode char.  
			}
			return out.toString();
		} 
		 
		/* public static String stripNonValidXMLCharacters(String in) {
			StringBuffer out = new StringBuffer(); // Used to hold the output.
			char current; // Used to reference the current character.

			if (in == null || ("".equals(in)))
				return ""; // vacancy test.

			for (int i = 0; i < in.length(); i++) {
				current = in.charAt(i); // NOTE: No IndexOutOfBoundsException caught here; it should not happen.
				if ((current == 0x9) || (current == 0xA) || (current == 0xD)
						|| ((current >= 0x20) && (current <= 0xD7FF))
						|| ((current >= 0xE000) && (current <= 0xFFFD))
						|| ((current > -0x10000) && (current <= 0x10FFFF)))
					out.append(current);
			}
			return out.toString();
		}*/

	}
}