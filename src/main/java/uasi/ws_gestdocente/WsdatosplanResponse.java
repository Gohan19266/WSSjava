
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
 *         &lt;element name="wsdatosplanResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseDatosPlan" minOccurs="0"/&gt;
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
    "wsdatosplanResult"
})
@XmlRootElement(name = "wsdatosplanResponse")
public class WsdatosplanResponse {

    protected ArrayOfClaseDatosPlan wsdatosplanResult;

    /**
     * Obtiene el valor de la propiedad wsdatosplanResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseDatosPlan }
     *     
     */
    public ArrayOfClaseDatosPlan getWsdatosplanResult() {
        return wsdatosplanResult;
    }

    /**
     * Define el valor de la propiedad wsdatosplanResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseDatosPlan }
     *     
     */
    public void setWsdatosplanResult(ArrayOfClaseDatosPlan value) {
        this.wsdatosplanResult = value;
    }

}
