
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
 *         &lt;element name="wstitulosuniResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseTitulosUni" minOccurs="0"/&gt;
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
    "wstitulosuniResult"
})
@XmlRootElement(name = "wstitulosuniResponse")
public class WstitulosuniResponse {

    protected ArrayOfClaseTitulosUni wstitulosuniResult;

    /**
     * Obtiene el valor de la propiedad wstitulosuniResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseTitulosUni }
     *     
     */
    public ArrayOfClaseTitulosUni getWstitulosuniResult() {
        return wstitulosuniResult;
    }

    /**
     * Define el valor de la propiedad wstitulosuniResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseTitulosUni }
     *     
     */
    public void setWstitulosuniResult(ArrayOfClaseTitulosUni value) {
        this.wstitulosuniResult = value;
    }

}
