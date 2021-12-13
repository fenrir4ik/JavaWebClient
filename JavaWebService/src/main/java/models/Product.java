
package models;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rtx_computershop.ua/entity/orders}Entity">
 *       &lt;sequence>
 *         &lt;element name="product_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product_amount" type="{http://rtx_computershop.ua/entity/orders}Product_amount"/>
 *         &lt;element name="product_price" type="{http://rtx_computershop.ua/entity/orders}Price"/>
 *         &lt;element name="product_type" type="{http://rtx_computershop.ua/entity/orders}Product_type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", namespace = "http://rtx_computershop.ua/entity/orders", propOrder = {
    "productName",
    "productAmount",
    "productPrice",
    "productType"
})
public class Product
    extends Entity
{

    @XmlElement(name = "product_name", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected String productName;
    @XmlElement(name = "product_amount", namespace = "http://rtx_computershop.ua/entity/orders")
    protected int productAmount;
    @XmlElement(name = "product_price", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    protected BigDecimal productPrice;
    @XmlElement(name = "product_type", namespace = "http://rtx_computershop.ua/entity/orders", required = true)
    @XmlSchemaType(name = "string")
    protected ProductType productType;

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productAmount property.
     * 
     */
    public int getProductAmount() {
        return productAmount;
    }

    /**
     * Sets the value of the productAmount property.
     * 
     */
    public void setProductAmount(int value) {
        this.productAmount = value;
    }

    /**
     * Gets the value of the productPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the value of the productPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductPrice(BigDecimal value) {
        this.productPrice = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
    }

}
