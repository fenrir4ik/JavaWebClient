
package models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Product_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Graphic Card"/>
 *     &lt;enumeration value="Processor"/>
 *     &lt;enumeration value="RAM"/>
 *     &lt;enumeration value="Power Unit"/>
 *     &lt;enumeration value="Motherboard"/>
 *     &lt;enumeration value="Hard Drive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Product_type", namespace = "http://rtx_computershop.ua/entity/orders")
@XmlEnum
public enum ProductType {

    @XmlEnumValue("Graphic Card")
    GRAPHIC_CARD("Graphic Card"),
    @XmlEnumValue("Processor")
    PROCESSOR("Processor"),
    RAM("RAM"),
    @XmlEnumValue("Power Unit")
    POWER_UNIT("Power Unit"),
    @XmlEnumValue("Motherboard")
    MOTHERBOARD("Motherboard"),
    @XmlEnumValue("Hard Drive")
    HARD_DRIVE("Hard Drive");
    private final String value;

    ProductType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductType fromValue(String v) {
        for (ProductType c: ProductType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
