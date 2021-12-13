
package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rtx_computershop.ua/entity/orders}Entity">
 *       &lt;sequence>
 *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_patronymic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_email" type="{http://rtx_computershop.ua/entity/orders}Email"/>
 *         &lt;element name="user_telno" type="{http://rtx_computershop.ua/entity/orders}Telno"/>
 *         &lt;element name="user_role" type="{http://rtx_computershop.ua/entity/orders}User_role"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", namespace = "http://rtx_computershop.ua/entity/orders", propOrder = {
    "userName",
    "userSurname",
    "userPatronymic",
    "userEmail",
    "userTelno",
    "userRole"
})
public class User
    extends Entity
{

    @XmlElement(name = "user_name", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected String userName;
    @XmlElement(name = "user_surname", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected String userSurname;
    @XmlElement(name = "user_patronymic", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected String userPatronymic;
    @XmlElement(name = "user_email", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected String userEmail;
    @XmlElement(name = "user_telno", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected String userTelno;
    @XmlElement(name = "user_role", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    @XmlSchemaType(name = "string")
    protected UserRole userRole;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSurname() {
        return userSurname;
    }

    /**
     * Sets the value of the userSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSurname(String value) {
        this.userSurname = value;
    }

    /**
     * Gets the value of the userPatronymic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPatronymic() {
        return userPatronymic;
    }

    /**
     * Sets the value of the userPatronymic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPatronymic(String value) {
        this.userPatronymic = value;
    }

    /**
     * Gets the value of the userEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Sets the value of the userEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }

    /**
     * Gets the value of the userTelno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTelno() {
        return userTelno;
    }

    /**
     * Sets the value of the userTelno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTelno(String value) {
        this.userTelno = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link UserRole }
     *     
     */
    public UserRole getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRole }
     *     
     */
    public void setUserRole(UserRole value) {
        this.userRole = value;
    }

}
