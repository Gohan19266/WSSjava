
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsdptocenResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseDptoCen" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wsdptocenResult"
})
@XmlRootElement(name = "wsdptocenResponse")
public class WsdptocenResponse {

    protected ArrayOfClaseDptoCen wsdptocenResult;

    /**
     * Obtiene el valor de la propiedad wsdptocenResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseDptoCen }
     *     
     */
    public ArrayOfClaseDptoCen getWsdptocenResult() {
        return wsdptocenResult;
    }

    /**
     * Define el valor de la propiedad wsdptocenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseDptoCen }
     *     
     */
    public void setWsdptocenResult(ArrayOfClaseDptoCen value) {
        this.wsdptocenResult = value;
    }

}
