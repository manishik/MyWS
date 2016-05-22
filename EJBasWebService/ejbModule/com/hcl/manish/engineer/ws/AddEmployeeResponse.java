
package com.hcl.manish.engineer.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddEmpResp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addEmpResp"
})
@XmlRootElement(name = "AddEmployeeResponse")
public class AddEmployeeResponse {

    @XmlElement(name = "AddEmpResp")
    protected boolean addEmpResp;

    /**
     * Gets the value of the addEmpResp property.
     * 
     */
    public boolean isAddEmpResp() {
        return addEmpResp;
    }

    /**
     * Sets the value of the addEmpResp property.
     * 
     */
    public void setAddEmpResp(boolean value) {
        this.addEmpResp = value;
    }

}
