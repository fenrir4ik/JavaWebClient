
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddOrder_QNAME = new QName("http://services/", "addOrder");
    private final static QName _AddOrderResponse_QNAME = new QName("http://services/", "addOrderResponse");
    private final static QName _ChangeOrder_QNAME = new QName("http://services/", "changeOrder");
    private final static QName _ChangeOrderResponse_QNAME = new QName("http://services/", "changeOrderResponse");
    private final static QName _DeleteOrder_QNAME = new QName("http://services/", "deleteOrder");
    private final static QName _DeleteOrderResponse_QNAME = new QName("http://services/", "deleteOrderResponse");
    private final static QName _GetOrderDetails_QNAME = new QName("http://services/", "getOrderDetails");
    private final static QName _GetOrderDetailsResponse_QNAME = new QName("http://services/", "getOrderDetailsResponse");
    private final static QName _GetOrders_QNAME = new QName("http://services/", "getOrders");
    private final static QName _GetOrdersResponse_QNAME = new QName("http://services/", "getOrdersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOrder }
     * 
     */
    public AddOrder createAddOrder() {
        return new AddOrder();
    }

    /**
     * Create an instance of {@link AddOrderResponse }
     * 
     */
    public AddOrderResponse createAddOrderResponse() {
        return new AddOrderResponse();
    }

    /**
     * Create an instance of {@link ChangeOrder }
     * 
     */
    public ChangeOrder createChangeOrder() {
        return new ChangeOrder();
    }

    /**
     * Create an instance of {@link ChangeOrderResponse }
     * 
     */
    public ChangeOrderResponse createChangeOrderResponse() {
        return new ChangeOrderResponse();
    }

    /**
     * Create an instance of {@link DeleteOrder }
     * 
     */
    public DeleteOrder createDeleteOrder() {
        return new DeleteOrder();
    }

    /**
     * Create an instance of {@link DeleteOrderResponse }
     * 
     */
    public DeleteOrderResponse createDeleteOrderResponse() {
        return new DeleteOrderResponse();
    }

    /**
     * Create an instance of {@link GetOrderDetails }
     * 
     */
    public GetOrderDetails createGetOrderDetails() {
        return new GetOrderDetails();
    }

    /**
     * Create an instance of {@link GetOrderDetailsResponse }
     * 
     */
    public GetOrderDetailsResponse createGetOrderDetailsResponse() {
        return new GetOrderDetailsResponse();
    }

    /**
     * Create an instance of {@link GetOrders }
     * 
     */
    public GetOrders createGetOrders() {
        return new GetOrders();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ContactData }
     * 
     */
    public ContactData createContactData() {
        return new ContactData();
    }

    /**
     * Create an instance of {@link ShoppingCart }
     * 
     */
    public ShoppingCart createShoppingCart() {
        return new ShoppingCart();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "addOrder")
    public JAXBElement<AddOrder> createAddOrder(AddOrder value) {
        return new JAXBElement<AddOrder>(_AddOrder_QNAME, AddOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddOrderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "addOrderResponse")
    public JAXBElement<AddOrderResponse> createAddOrderResponse(AddOrderResponse value) {
        return new JAXBElement<AddOrderResponse>(_AddOrderResponse_QNAME, AddOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "changeOrder")
    public JAXBElement<ChangeOrder> createChangeOrder(ChangeOrder value) {
        return new JAXBElement<ChangeOrder>(_ChangeOrder_QNAME, ChangeOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeOrderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeOrderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "changeOrderResponse")
    public JAXBElement<ChangeOrderResponse> createChangeOrderResponse(ChangeOrderResponse value) {
        return new JAXBElement<ChangeOrderResponse>(_ChangeOrderResponse_QNAME, ChangeOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteOrder")
    public JAXBElement<DeleteOrder> createDeleteOrder(DeleteOrder value) {
        return new JAXBElement<DeleteOrder>(_DeleteOrder_QNAME, DeleteOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteOrderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteOrderResponse")
    public JAXBElement<DeleteOrderResponse> createDeleteOrderResponse(DeleteOrderResponse value) {
        return new JAXBElement<DeleteOrderResponse>(_DeleteOrderResponse_QNAME, DeleteOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrderDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getOrderDetails")
    public JAXBElement<GetOrderDetails> createGetOrderDetails(GetOrderDetails value) {
        return new JAXBElement<GetOrderDetails>(_GetOrderDetails_QNAME, GetOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderDetailsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrderDetailsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getOrderDetailsResponse")
    public JAXBElement<GetOrderDetailsResponse> createGetOrderDetailsResponse(GetOrderDetailsResponse value) {
        return new JAXBElement<GetOrderDetailsResponse>(_GetOrderDetailsResponse_QNAME, GetOrderDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrders }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrders }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getOrders")
    public JAXBElement<GetOrders> createGetOrders(GetOrders value) {
        return new JAXBElement<GetOrders>(_GetOrders_QNAME, GetOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getOrdersResponse")
    public JAXBElement<GetOrdersResponse> createGetOrdersResponse(GetOrdersResponse value) {
        return new JAXBElement<GetOrdersResponse>(_GetOrdersResponse_QNAME, GetOrdersResponse.class, null, value);
    }

}
