
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
 *         &lt;element name="ptipoflujo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "ptipoflujo"
})
@XmlRootElement(name = "wsconvemovilidad")
public class Wsconvemovilidad {

    protected String ptipoflujo;

    /**
     * Obtiene el valor de la propiedad ptipoflujo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtipoflujo() {
        return ptipoflujo;
    }

    /**
     * Define el valor de la propiedad ptipoflujo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtipoflujo(String value) {
        this.ptipoflujo = value;
    }

}
