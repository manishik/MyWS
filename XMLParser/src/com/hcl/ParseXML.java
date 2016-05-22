package com.hcl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.hcl.model.WorkFlow;

public class ParseXML extends DefaultHandler {

	List<WorkFlow> workFlowList;

	String xmlFileName;
	String tmpStr;
	WorkFlow workFlow;
	
	public ParseXML(String xmlFileName) {
		this.xmlFileName = xmlFileName;
		workFlowList = new ArrayList<WorkFlow>();
		parseXML();
	}

	private void parseXML() {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse(xmlFileName, this);
		} catch (ParserConfigurationException e) {
			System.out.println("ParserConfig error");
		} catch (SAXException e) {
			System.out.println("SAXException : xml not well formed");
		} catch (IOException ioException) {
			ioException.printStackTrace();
			System.out.println("IO error");
		}
	}

	public List<WorkFlow> returnData(){
		return workFlowList;
	}
	
	@Override
	public void startElement(String s, String s1, String elementName, Attributes attributes) throws SAXException {
		if (elementName.equalsIgnoreCase("WORKFLOW")) {
			workFlow = new WorkFlow();
			workFlow.setDesc(attributes.getValue("DESCRIPTION"));
		}
	}

	@Override
	public void endElement(String s, String s1, String element)
			throws SAXException {
		if (element.equals("WORKFLOW")) {
			workFlowList.add(workFlow);
		}
	}

	@Override
	public void characters(char[] ac, int i, int j) throws SAXException {
		tmpStr = new String(ac, i, j);
	}

}
