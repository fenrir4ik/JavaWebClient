
package models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for User_role.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="User_role">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Admin"/>
 *     &lt;enumeration value="User"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "User_role", namespace = "http://rtx_computershop.ua/entity/orders")
@XmlEnum
public enum UserRole {

    @XmlEnumValue("Admin")
    ADMIN("Admin"),
    @XmlEnumValue("User")
    USER("User");
    private final String value;

    UserRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserRole fromValue(String v) {
        for (UserRole c: UserRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
