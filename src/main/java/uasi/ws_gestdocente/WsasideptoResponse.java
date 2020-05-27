
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
 *         &lt;element name="wsasideptoResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseAsiDepto" minOccurs="0"/&gt;
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
    "wsasideptoResult"
})
@XmlRootElement(name = "wsasideptoResponse")
public class WsasideptoResponse {

    protected ArrayOfClaseAsiDepto wsasideptoResult;

    /**
     * Obtiene el valor de la propiedad wsasideptoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseAsiDepto }
     *     
     */
    public ArrayOfClaseAsiDepto getWsasideptoResult() {
        return wsasideptoResult;
    }

    /**
     * Define el valor de la propiedad wsasideptoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseAsiDepto }
     *     
     */
    public void setWsasideptoResult(ArrayOfClaseAsiDepto value) {
        this.wsasideptoResult = value;
    }

}
