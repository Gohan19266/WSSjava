
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
 *         &lt;element name="wshorariosResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseHorarios" minOccurs="0"/&gt;
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
    "wshorariosResult"
})
@XmlRootElement(name = "wshorariosResponse")
public class WshorariosResponse {

    protected ArrayOfClaseHorarios wshorariosResult;

    /**
     * Obtiene el valor de la propiedad wshorariosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseHorarios }
     *     
     */
    public ArrayOfClaseHorarios getWshorariosResult() {
        return wshorariosResult;
    }

    /**
     * Define el valor de la propiedad wshorariosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseHorarios }
     *     
     */
    public void setWshorariosResult(ArrayOfClaseHorarios value) {
        this.wshorariosResult = value;
    }

}
