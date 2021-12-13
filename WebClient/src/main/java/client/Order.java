
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rtx_computershop.ua/entity/orders}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="User" type="{http://rtx_computershop.ua/entity/orders}User" form="qualified"/&gt;
 *         &lt;element name="date_updated" type="{http://www.w3.org/2001/XMLSchema}date" form="qualified"/&gt;
 *         &lt;element name="order_status" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="order_contact_data" type="{http://rtx_computershop.ua/entity/orders}Contact_data" form="qualified"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="shopping_cart" type="{http://rtx_computershop.ua/entity/orders}Shopping_cart" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="executed" type="{http://rtx_computershop.ua/entity/orders}Executed" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", namespace = "http://rtx_computershop.ua/entity/orders", propOrder = {
    "user",
    "dateUpdated",
    "orderStatus",
    "orderContactData",
    "address",
    "shoppingCart"
})
public class Order
    extends Entity
{

    @XmlElement(name = "User", required = true)
    protected User user;
    @XmlElement(name = "date_updated", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateUpdated;
    @XmlElement(name = "order_status", required = true)
    protected String orderStatus;
    @XmlElement(name = "order_contact_data", required = true)
    protected ContactData orderContactData;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(name = "shopping_cart", required = true)
    protected ShoppingCart shoppingCart;
    @XmlAttribute(name = "executed")
    protected Executed executed;

    public Order(){
    }

    public Order(int id, XMLGregorianCalendar dateUpdated, String orderStatus, ContactData orderContactData, String address, Executed executed) {
        this.id = id;
        this.dateUpdated = dateUpdated;
        this.orderStatus = orderStatus;
        this.address = address;
        this.executed = executed;
        this.orderContactData = orderContactData;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the dateUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUpdated() {
        return dateUpdated;
    }

    /**
     * Sets the value of the dateUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUpdated(XMLGregorianCalendar value) {
        this.dateUpdated = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the orderContactData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactData }
     *     
     */
    public ContactData getOrderContactData() {
        return orderContactData;
    }

    /**
     * Sets the value of the orderContactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactData }
     *     
     */
    public void setOrderContactData(ContactData value) {
        this.orderContactData = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the shoppingCart property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCart }
     *     
     */
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    /**
     * Sets the value of the shoppingCart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCart }
     *     
     */
    public void setShoppingCart(ShoppingCart value) {
        this.shoppingCart = value;
    }

    /**
     * Gets the value of the executed property.
     * 
     * @return
     *     possible object is
     *     {@link Executed }
     *     
     */
    public Executed getExecuted() {
        return executed;
    }

    /**
     * Sets the value of the executed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Executed }
     *     
     */
    public void setExecuted(Executed value) {
        this.executed = value;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateUpdated=" + dateUpdated +
                ", orderStatus='" + orderStatus + '\'' +
                ", contactData='" + orderContactData + '\'' +
                ", address='" + address + '\'' +
                ", executed=" + executed +
                '}';
    }
}
