
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
 *         &lt;element name="wsfechaexamenesasiResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseFechaExamenesAsi" minOccurs="0"/&gt;
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
    "wsfechaexamenesasiResult"
})
@XmlRootElement(name = "wsfechaexamenesasiResponse")
public class WsfechaexamenesasiResponse {

    protected ArrayOfClaseFechaExamenesAsi wsfechaexamenesasiResult;

    /**
     * Obtiene el valor de la propiedad wsfechaexamenesasiResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseFechaExamenesAsi }
     *     
     */
    public ArrayOfClaseFechaExamenesAsi getWsfechaexamenesasiResult() {
        return wsfechaexamenesasiResult;
    }

    /**
     * Define el valor de la propiedad wsfechaexamenesasiResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseFechaExamenesAsi }
     *     
     */
    public void setWsfechaexamenesasiResult(ArrayOfClaseFechaExamenesAsi value) {
        this.wsfechaexamenesasiResult = value;
    }

}
