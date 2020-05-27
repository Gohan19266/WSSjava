
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
 *         &lt;element name="wscalificacionesResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseCalificaciones" minOccurs="0"/&gt;
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
    "wscalificacionesResult"
})
@XmlRootElement(name = "wscalificacionesResponse")
public class WscalificacionesResponse {

    protected ArrayOfClaseCalificaciones wscalificacionesResult;

    /**
     * Obtiene el valor de la propiedad wscalificacionesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseCalificaciones }
     *     
     */
    public ArrayOfClaseCalificaciones getWscalificacionesResult() {
        return wscalificacionesResult;
    }

    /**
     * Define el valor de la propiedad wscalificacionesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseCalificaciones }
     *     
     */
    public void setWscalificacionesResult(ArrayOfClaseCalificaciones value) {
        this.wscalificacionesResult = value;
    }

}
