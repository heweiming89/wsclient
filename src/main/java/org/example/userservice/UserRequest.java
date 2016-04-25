
package org.example.userservice;

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
 *       &lt;all>
 *         &lt;element name="userCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetCompany" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "UserRequest")
public class UserRequest {

    protected int userCount;
    @XmlElement(required = true)
    protected String targetCompany;

    /**
     * Gets the value of the userCount property.
     * 
     */
    public int getUserCount() {
        return userCount;
    }

    /**
     * Sets the value of the userCount property.
     * 
     */
    public void setUserCount(int value) {
        this.userCount = value;
    }

    /**
     * Gets the value of the targetCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCompany() {
        return targetCompany;
    }

    /**
     * Sets the value of the targetCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCompany(String value) {
        this.targetCompany = value;
    }

}
