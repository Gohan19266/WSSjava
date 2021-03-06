
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
 *         &lt;element name="wsagrupacionesResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseAgrupaciones" minOccurs="0"/&gt;
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
    "wsagrupacionesResult"
})
@XmlRootElement(name = "wsagrupacionesResponse")
public class WsagrupacionesResponse {

    protected ArrayOfClaseAgrupaciones wsagrupacionesResult;

    /**
     * Obtiene el valor de la propiedad wsagrupacionesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseAgrupaciones }
     *     
     */
    public ArrayOfClaseAgrupaciones getWsagrupacionesResult() {
        return wsagrupacionesResult;
    }

    /**
     * Define el valor de la propiedad wsagrupacionesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseAgrupaciones }
     *     
     */
    public void setWsagrupacionesResult(ArrayOfClaseAgrupaciones value) {
        this.wsagrupacionesResult = value;
    }

}
