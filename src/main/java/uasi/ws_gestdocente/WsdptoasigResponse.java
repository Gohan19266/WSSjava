
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
 *         &lt;element name="wsdptoasigResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseDptoAsig" minOccurs="0"/&gt;
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
    "wsdptoasigResult"
})
@XmlRootElement(name = "wsdptoasigResponse")
public class WsdptoasigResponse {

    protected ArrayOfClaseDptoAsig wsdptoasigResult;

    /**
     * Obtiene el valor de la propiedad wsdptoasigResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseDptoAsig }
     *     
     */
    public ArrayOfClaseDptoAsig getWsdptoasigResult() {
        return wsdptoasigResult;
    }

    /**
     * Define el valor de la propiedad wsdptoasigResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseDptoAsig }
     *     
     */
    public void setWsdptoasigResult(ArrayOfClaseDptoAsig value) {
        this.wsdptoasigResult = value;
    }

}
