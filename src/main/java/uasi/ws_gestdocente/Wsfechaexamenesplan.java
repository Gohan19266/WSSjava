
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
 *         &lt;element name="pcodest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pcurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pcodconv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="porden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "pcodest",
    "pcurso",
    "pcodconv",
    "porden"
})
@XmlRootElement(name = "wsfechaexamenesplan")
public class Wsfechaexamenesplan {

    protected String plengua;
    protected String pcodest;
    protected String pcurso;
    protected String pcodconv;
    protected String porden;

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
     * Obtiene el valor de la propiedad pcodest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcodest() {
        return pcodest;
    }

    /**
     * Define el valor de la propiedad pcodest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcodest(String value) {
        this.pcodest = value;
    }

    /**
     * Obtiene el valor de la propiedad pcurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcurso() {
        return pcurso;
    }

    /**
     * Define el valor de la propiedad pcurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcurso(String value) {
        this.pcurso = value;
    }

    /**
     * Obtiene el valor de la propiedad pcodconv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcodconv() {
        return pcodconv;
    }

    /**
     * Define el valor de la propiedad pcodconv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcodconv(String value) {
        this.pcodconv = value;
    }

    /**
     * Obtiene el valor de la propiedad porden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorden() {
        return porden;
    }

    /**
     * Define el valor de la propiedad porden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorden(String value) {
        this.porden = value;
    }

}
