
package com.hcl.manish.engineer.ws.ct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmpId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmpFName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmpLName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://manish.hcl.com/engineer/ws/ct}Address" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", propOrder = {
    "empId",
    "empFName",
    "empLName",
    "department",
    "address"
})
public class Employee {

    @XmlElement(name = "EmpId", required = true)
    protected String empId;
    @XmlElement(name = "EmpFName", required = true)
    protected String empFName;
    @XmlElement(name = "EmpLName", required = true)
    protected String empLName;
    @XmlElement(name = "Department", required = true)
    protected String department;
    @XmlElement(name = "Address")
    protected List<Address> address;

    /**
     * Gets the value of the empId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * Sets the value of the empId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpId(String value) {
        this.empId = value;
    }

    /**
     * Gets the value of the empFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpFName() {
        return empFName;
    }

    /**
     * Sets the value of the empFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpFName(String value) {
        this.empFName = value;
    }

    /**
     * Gets the value of the empLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpLName() {
        return empLName;
    }

    /**
     * Sets the value of the empLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpLName(String value) {
        this.empLName = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

}
