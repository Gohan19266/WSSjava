
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
 *         &lt;element name="wsconvemovilidadResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseConveMovilidad" minOccurs="0"/&gt;
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
    "wsconvemovilidadResult"
})
@XmlRootElement(name = "wsconvemovilidadResponse")
public class WsconvemovilidadResponse {

    protected ArrayOfClaseConveMovilidad wsconvemovilidadResult;

    /**
     * Obtiene el valor de la propiedad wsconvemovilidadResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseConveMovilidad }
     *     
     */
    public ArrayOfClaseConveMovilidad getWsconvemovilidadResult() {
        return wsconvemovilidadResult;
    }

    /**
     * Define el valor de la propiedad wsconvemovilidadResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseConveMovilidad }
     *     
     */
    public void setWsconvemovilidadResult(ArrayOfClaseConveMovilidad value) {
        this.wsconvemovilidadResult = value;
    }

}
