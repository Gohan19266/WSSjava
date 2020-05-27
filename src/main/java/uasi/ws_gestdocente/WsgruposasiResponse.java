
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
 *         &lt;element name="wsgruposasiResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseGrupoAsi" minOccurs="0"/&gt;
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
    "wsgruposasiResult"
})
@XmlRootElement(name = "wsgruposasiResponse")
public class WsgruposasiResponse {

    protected ArrayOfClaseGrupoAsi wsgruposasiResult;

    /**
     * Obtiene el valor de la propiedad wsgruposasiResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseGrupoAsi }
     *     
     */
    public ArrayOfClaseGrupoAsi getWsgruposasiResult() {
        return wsgruposasiResult;
    }

    /**
     * Define el valor de la propiedad wsgruposasiResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseGrupoAsi }
     *     
     */
    public void setWsgruposasiResult(ArrayOfClaseGrupoAsi value) {
        this.wsgruposasiResult = value;
    }

}
