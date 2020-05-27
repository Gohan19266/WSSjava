
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
 *         &lt;element name="wstitulospropiosuniResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseTitulosPropiosUni" minOccurs="0"/&gt;
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
    "wstitulospropiosuniResult"
})
@XmlRootElement(name = "wstitulospropiosuniResponse")
public class WstitulospropiosuniResponse {

    protected ArrayOfClaseTitulosPropiosUni wstitulospropiosuniResult;

    /**
     * Obtiene el valor de la propiedad wstitulospropiosuniResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseTitulosPropiosUni }
     *     
     */
    public ArrayOfClaseTitulosPropiosUni getWstitulospropiosuniResult() {
        return wstitulospropiosuniResult;
    }

    /**
     * Define el valor de la propiedad wstitulospropiosuniResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseTitulosPropiosUni }
     *     
     */
    public void setWstitulospropiosuniResult(ArrayOfClaseTitulosPropiosUni value) {
        this.wstitulospropiosuniResult = value;
    }

}
