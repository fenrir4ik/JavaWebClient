
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


/**
 * <p>Java class for Contact_data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact_data"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="order_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="order_telno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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

    @XmlElement(name = "order_email")
    protected String orderEmail;
    @XmlElement(name = "order_telno")
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

    @Override
    public String toString() {
        if (!Objects.isNull(orderEmail))
        {
            return orderEmail;
        }
        else if (!Objects.isNull(orderTelno))
        {
            return orderTelno;
        }
        else
        {
            return null;
        }
    }

}
