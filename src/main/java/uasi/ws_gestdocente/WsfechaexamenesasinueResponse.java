
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
 *         &lt;element name="wsfechaexamenesasinueResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseFechaExamenesAsiNue" minOccurs="0"/&gt;
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
    "wsfechaexamenesasinueResult"
})
@XmlRootElement(name = "wsfechaexamenesasinueResponse")
public class WsfechaexamenesasinueResponse {

    protected ArrayOfClaseFechaExamenesAsiNue wsfechaexamenesasinueResult;

    /**
     * Obtiene el valor de la propiedad wsfechaexamenesasinueResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseFechaExamenesAsiNue }
     *     
     */
    public ArrayOfClaseFechaExamenesAsiNue getWsfechaexamenesasinueResult() {
        return wsfechaexamenesasinueResult;
    }

    /**
     * Define el valor de la propiedad wsfechaexamenesasinueResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseFechaExamenesAsiNue }
     *     
     */
    public void setWsfechaexamenesasinueResult(ArrayOfClaseFechaExamenesAsiNue value) {
        this.wsfechaexamenesasinueResult = value;
    }

}
