
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
 *         &lt;element name="wsfechaexamenesasitotalResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseFechaExamenesAsiTotal" minOccurs="0"/&gt;
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
    "wsfechaexamenesasitotalResult"
})
@XmlRootElement(name = "wsfechaexamenesasitotalResponse")
public class WsfechaexamenesasitotalResponse {

    protected ArrayOfClaseFechaExamenesAsiTotal wsfechaexamenesasitotalResult;

    /**
     * Obtiene el valor de la propiedad wsfechaexamenesasitotalResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseFechaExamenesAsiTotal }
     *     
     */
    public ArrayOfClaseFechaExamenesAsiTotal getWsfechaexamenesasitotalResult() {
        return wsfechaexamenesasitotalResult;
    }

    /**
     * Define el valor de la propiedad wsfechaexamenesasitotalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseFechaExamenesAsiTotal }
     *     
     */
    public void setWsfechaexamenesasitotalResult(ArrayOfClaseFechaExamenesAsiTotal value) {
        this.wsfechaexamenesasitotalResult = value;
    }

}
