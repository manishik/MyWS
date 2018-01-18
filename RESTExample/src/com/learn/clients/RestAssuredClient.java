package com.learn.clients;

import static com.jayway.restassured.RestAssured.given;

import java.util.Base64;
import org.junit.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;

public class RestAssuredClient {

	public String authenticationString = "fj5tuser:crowbar1";

	public String basicAuth = "Basic " + Base64.getEncoder().encodeToString(authenticationString.getBytes());

	public String jwsToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJNT0JJTEVfTlVNQkVSIjoiKDIwMikgNzUyLTYyOTkiLCJERUZBVUxUX1NFTExFUl9TRVJWSUNFX05VTUJFUiI6IiIsIkZJUlNUTkFNRSI6IktpcmFuIEt1bWFyIiwiVVNFUl9OQU1FIjoiZzh1a3BtIiwiRU1BSUwiOiJraXJhbl9rdW1hcl9tZWdyYWpAZmFubmllbWFlLmNvbSIsIkRFQUxFUl9PUkdfTkFNRSI6IkZhbm5pZSBNYWUiLCJJTlNUSVRVVElPTl9JRCI6IiIsIkNVU1RPTUVSX05BTUUiOiIiLCJMQVNUTkFNRSI6Ik1lZ3JhaiIsIldPUktfTlVNQkVSIjoiKDIwMikgNzUyLTYyOTkiLCJST0xFUyI6WyJSQ1JfVHJhZGluZ19JbnRlcm5hbCJdLCJTRUxMRVJfU0VSVklDRV9OVU1CRVIiOiIiLCJERUFMRVJfT1JHX0lEIjoiMjQiLCJGQU5OSUVNQUVfVVNFUiI6dHJ1ZSwiZXhwIjoxNTE1Nzk1OTc5LCJpYXQiOjE1MTU1OTU5Nzl9.QEWkpMaWYZMAYL00rew4um8GssYJVBw6JWtwLEtusopwsJf_CIFfIOWWFtgCARDEMsqkoY5n4iPT162oVJrDdMhwAjSkBeReQOQt7UXIEjtu-W364pQoz1fgyg107KiqDrxbK43cf0xq-CUsCpTUzO7fB5s41W7m7WvQK1tKC_mfESD5nvk8gBEX0wHMUaTqakv4K0EmcAyxauyZ4TXjQ650dkIaRM4LNqvi1z5xmO7KvVLcEyL6a0GvJEd4HDa9o04LilLN2OEdiR3eM_2CP3kgWN_PihtVz3heRvFooy01L_Qc45J30FKs6XrpgtZSdI668yK3sWvhv5KQsC4GRA";

	@Test
	public void testCreateMessage() {
		RestAssured.baseURI = "http://localhost:7001/sttswebservice/api/exchange/create-downstream-msg";
		RcrExchange rcrExchange = createRCRExchangeData();
		Response response = given().contentType("application/json").header("x-fnma-jws-token", jwsToken)
				.header("Authorization", basicAuth).body(rcrExchange).post();
		System.out.println("Result = " + response.asString());
	}

	public RcrExchange createRCRExchangeData() {
		RcrExchange rcrExchange = new RcrExchange();
		rcrExchange.setRemicId(2017008);
		rcrExchange.setAgencyCode(777);
		rcrExchange.setAgencyType("f");
		rcrExchange.setUser("y3uebc");
		rcrExchange.setDealerId("00Q69");
		rcrExchange.setExchangeTypeCode("REMIC");
		return rcrExchange;
	}

}

class RcrExchange {

	protected int remicId;
	protected int agencyCode;
	protected String agencyType;
	protected String user;
	protected BigDecimal fee;
	protected String dealerId;
	protected String exchangeTypeCode;
	protected XMLGregorianCalendar exchangeDate;
	protected XMLGregorianCalendar entryDate;
	protected XMLGregorianCalendar updtTime;
	protected List<RcrExchange.ClassExchange> classExchange;

	public int getRemicId() {
		return remicId;
	}

	public void setRemicId(int value) {
		this.remicId = value;
	}

	public int getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(int value) {
		this.agencyCode = value;
	}

	public String getAgencyType() {
		return agencyType;
	}

	public void setAgencyType(String value) {
		this.agencyType = value;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String value) {
		this.user = value;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal value) {
		this.fee = value;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String value) {
		this.dealerId = value;
	}

	public String getExchangeTypeCode() {
		return exchangeTypeCode;
	}

	public void setExchangeTypeCode(String value) {
		this.exchangeTypeCode = value;
	}

	public XMLGregorianCalendar getExchangeDate() {
		return exchangeDate;
	}

	public void setExchangeDate(XMLGregorianCalendar value) {
		this.exchangeDate = value;
	}

	public XMLGregorianCalendar getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(XMLGregorianCalendar value) {
		this.entryDate = value;
	}

	public XMLGregorianCalendar getUpdtTime() {
		return updtTime;
	}

	public void setUpdtTime(XMLGregorianCalendar value) {
		this.updtTime = value;
	}

	public List<RcrExchange.ClassExchange> getClassExchange() {
		if (classExchange == null) {
			classExchange = new ArrayList<RcrExchange.ClassExchange>();
		}
		return this.classExchange;
	}

	public static class ClassExchange {

		protected String className;
		protected String cusip;
		protected String clearingInstitution;
		protected BigDecimal receiveAmount;
		protected BigDecimal dealerAmount;

		public String getClassName() {
			return className;
		}

		public void setClassName(String value) {
			this.className = value;
		}

		public String getCusip() {
			return cusip;
		}

		public void setCusip(String value) {
			this.cusip = value;
		}

		public String getClearingInstitution() {
			return clearingInstitution;
		}

		public void setClearingInstitution(String value) {
			this.clearingInstitution = value;
		}

		public BigDecimal getReceiveAmount() {
			return receiveAmount;
		}

		public void setReceiveAmount(BigDecimal value) {
			this.receiveAmount = value;
		}

		public BigDecimal getDealerAmount() {
			return dealerAmount;
		}

		public void setDealerAmount(BigDecimal value) {
			this.dealerAmount = value;
		}

	}

}
