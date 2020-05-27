
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
 *         &lt;element name="wsasiplanResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseAsiPlan" minOccurs="0"/&gt;
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
    "wsasiplanResult"
})
@XmlRootElement(name = "wsasiplanResponse")
public class WsasiplanResponse {

    protected ArrayOfClaseAsiPlan wsasiplanResult;

    /**
     * Obtiene el valor de la propiedad wsasiplanResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseAsiPlan }
     *     
     */
    public ArrayOfClaseAsiPlan getWsasiplanResult() {
        return wsasiplanResult;
    }

    /**
     * Define el valor de la propiedad wsasiplanResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseAsiPlan }
     *     
     */
    public void setWsasiplanResult(ArrayOfClaseAsiPlan value) {
        this.wsasiplanResult = value;
    }

}
