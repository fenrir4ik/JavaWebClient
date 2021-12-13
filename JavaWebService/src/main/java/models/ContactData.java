
package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact_data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact_data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="order_email" type="{http://rtx_computershop.ua/entity/orders}Email"/>
 *         &lt;element name="order_telno" type="{http://rtx_computershop.ua/entity/orders}Telno"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact_data", namespace = "http://rtx_computershop.ua/entity/orders", propOrder = {
    "orderEmail",
    "orderTelno"
})
public class ContactData {

    @XmlElement(name = "order_email", namespace = "http://rtx_computershop.ua/entity/orders")
    protected String orderEmail;
    @XmlElement(name = "order_telno", namespace = "http://rtx_computershop.ua/entity/orders")
    protected String orderTelno;

    /**
     * Gets the value of the orderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderEmail() {
        return orderEmail;
    }

    /**
     * Sets the value of the orderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderEmail(String value) {
        this.orderEmail = value;
    }

    /**
     * Gets the value of the orderTelno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTelno() {
        return orderTelno;
    }

    /**
     * Sets the value of the orderTelno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTelno(String value) {
        this.orderTelno = value;
    }

}
