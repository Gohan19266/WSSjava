
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
 *         &lt;element name="wsplanesdepResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClasePlanesDep" minOccurs="0"/&gt;
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
    "wsplanesdepResult"
})
@XmlRootElement(name = "wsplanesdepResponse")
public class WsplanesdepResponse {

    protected ArrayOfClasePlanesDep wsplanesdepResult;

    /**
     * Obtiene el valor de la propiedad wsplanesdepResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClasePlanesDep }
     *     
     */
    public ArrayOfClasePlanesDep getWsplanesdepResult() {
        return wsplanesdepResult;
    }

    /**
     * Define el valor de la propiedad wsplanesdepResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClasePlanesDep }
     *     
     */
    public void setWsplanesdepResult(ArrayOfClasePlanesDep value) {
        this.wsplanesdepResult = value;
    }

}
