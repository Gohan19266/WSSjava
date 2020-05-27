
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
 *         &lt;element name="wsplanesasigResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClasePlanesAsig" minOccurs="0"/&gt;
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
    "wsplanesasigResult"
})
@XmlRootElement(name = "wsplanesasigResponse")
public class WsplanesasigResponse {

    protected ArrayOfClasePlanesAsig wsplanesasigResult;

    /**
     * Obtiene el valor de la propiedad wsplanesasigResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClasePlanesAsig }
     *     
     */
    public ArrayOfClasePlanesAsig getWsplanesasigResult() {
        return wsplanesasigResult;
    }

    /**
     * Define el valor de la propiedad wsplanesasigResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClasePlanesAsig }
     *     
     */
    public void setWsplanesasigResult(ArrayOfClasePlanesAsig value) {
        this.wsplanesasigResult = value;
    }

}
