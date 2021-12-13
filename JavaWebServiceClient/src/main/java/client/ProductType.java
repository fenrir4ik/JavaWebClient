
package client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Product_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Graphic Card"/&gt;
 *     &lt;enumeration value="Processor"/&gt;
 *     &lt;enumeration value="RAM"/&gt;
 *     &lt;enumeration value="Power Unit"/&gt;
 *     &lt;enumeration value="Motherboard"/&gt;
 *     &lt;enumeration value="Hard Drive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
