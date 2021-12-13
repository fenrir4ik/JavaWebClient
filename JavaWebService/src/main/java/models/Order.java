
package models;

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
 * &lt;complexType name="Order">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rtx_computershop.ua/entity/orders}Entity">
 *       &lt;sequence>
 *         &lt;element name="User" type="{http://rtx_computershop.ua/entity/orders}User"/>
 *         &lt;element name="date_updated" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="order_status" type="{http://rtx_computershop.ua/entity/orders}Order_status"/>
 *         &lt;element name="order_contact_data" type="{http://rtx_computershop.ua/entity/orders}Contact_data"/>
 *         &lt;element name="address" type="{http://rtx_computershop.ua/entity/orders}Address"/>
 *         &lt;element name="shopping_cart" type="{http://rtx_computershop.ua/entity/orders}Shopping_cart"/>
 *       &lt;/sequence>
 *       &lt;attribute name="executed" type="{http://rtx_computershop.ua/entity/orders}Executed" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    @XmlElement(name = "User", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected User user;
    @XmlElement(name = "date_updated", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateUpdated;
    @XmlElement(name = "order_status", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    @XmlSchemaType(name = "string")
    protected OrderStatus orderStatus;
    @XmlElement(name = "order_contact_data", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected ContactData orderContactData;
    @XmlElement(namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected String address;
    @XmlElement(name = "shopping_cart", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected ShoppingCart shoppingCart;
    @XmlAttribute(name = "executed")
    protected Executed executed;

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
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setOrderStatus(OrderStatus value) {
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
                ", user=" + user +
                ", dateUpdated=" + dateUpdated +
                ", orderStatus=" + orderStatus +
                ", orderContactData=" + orderContactData +
                ", address='" + address + '\'' +
                ", shoppingCart=" + shoppingCart +
                ", executed=" + executed +
                '}';
    }
}
