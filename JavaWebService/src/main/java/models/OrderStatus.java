
package models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Order_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Order_status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Formed"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="Executed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Order_status", namespace = "http://rtx_computershop.ua/entity/orders")
@XmlEnum
public enum OrderStatus {

    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Formed")
    FORMED("Formed"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Executed")
    EXECUTED("Executed");
    private final String value;

    OrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatus fromValue(String v) {
        for (OrderStatus c: OrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
