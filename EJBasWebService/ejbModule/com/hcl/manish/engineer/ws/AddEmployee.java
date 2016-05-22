
package com.hcl.manish.engineer.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.hcl.manish.engineer.ws.ct.Employee;


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
 *         &lt;element name="AddEmp" type="{http://manish.hcl.com/engineer/ws/ct}Employee"/>
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
    "addEmp"
})
@XmlRootElement(name = "AddEmployee")
public class AddEmployee {

    @XmlElement(name = "AddEmp", required = true)
    protected Employee addEmp;

    /**
     * Gets the value of the addEmp property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getAddEmp() {
        return addEmp;
    }

    /**
     * Sets the value of the addEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setAddEmp(Employee value) {
        this.addEmp = value;
    }

}
