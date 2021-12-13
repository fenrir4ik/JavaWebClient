
package client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Executed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Executed"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Processing"/&gt;
 *     &lt;enumeration value="Done"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Executed", namespace = "http://rtx_computershop.ua/entity/orders")
@XmlEnum
public enum Executed {

    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("Done")
    DONE("Done");
    private final String value;

    Executed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Executed fromValue(String v) {
        for (Executed c: Executed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
