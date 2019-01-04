
package com.cs.tmt.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getInfoDataDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getInfoDataDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="root" type="{http://api.service.tmt.cs.com/}infoData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoDataDetailsResponse", propOrder = {
    "root"
})
public class GetInfoDataDetailsResponse {

    protected InfoData root;

    /**
     * Gets the value of the root property.
     * 
     * @return
     *     possible object is
     *     {@link InfoData }
     *     
     */
    public InfoData getRoot() {
        return root;
    }

    /**
     * Sets the value of the root property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoData }
     *     
     */
    public void setRoot(InfoData value) {
        this.root = value;
    }

}
