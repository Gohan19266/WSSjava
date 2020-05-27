
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
 *         &lt;element name="plengua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pcodasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "plengua",
    "pcodasi"
})
@XmlRootElement(name = "wscalificaciones")
public class Wscalificaciones {

    protected String plengua;
    protected String pcodasi;

    /**
     * Obtiene el valor de la propiedad plengua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlengua() {
        return plengua;
    }

    /**
     * Define el valor de la propiedad plengua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlengua(String value) {
        this.plengua = value;
    }

    /**
     * Obtiene el valor de la propiedad pcodasi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcodasi() {
        return pcodasi;
    }

    /**
     * Define el valor de la propiedad pcodasi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcodasi(String value) {
        this.pcodasi = value;
    }

}
