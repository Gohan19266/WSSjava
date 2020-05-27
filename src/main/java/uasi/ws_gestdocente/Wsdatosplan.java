
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
 *         &lt;element name="ptipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="psubtipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pcodcen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pcurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pflgmovil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "ptipo",
    "psubtipo",
    "pcodcen",
    "pcurso",
    "pflgmovil"
})
@XmlRootElement(name = "wsdatosplan")
public class Wsdatosplan {

    protected String plengua;
    protected String pcodest;
    protected String ptipo;
    protected String psubtipo;
    protected String pcodcen;
    protected String pcurso;
    protected String pflgmovil;

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
     * Obtiene el valor de la propiedad ptipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtipo() {
        return ptipo;
    }

    /**
     * Define el valor de la propiedad ptipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtipo(String value) {
        this.ptipo = value;
    }

    /**
     * Obtiene el valor de la propiedad psubtipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsubtipo() {
        return psubtipo;
    }

    /**
     * Define el valor de la propiedad psubtipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsubtipo(String value) {
        this.psubtipo = value;
    }

    /**
     * Obtiene el valor de la propiedad pcodcen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcodcen() {
        return pcodcen;
    }

    /**
     * Define el valor de la propiedad pcodcen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcodcen(String value) {
        this.pcodcen = value;
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
     * Obtiene el valor de la propiedad pflgmovil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPflgmovil() {
        return pflgmovil;
    }

    /**
     * Define el valor de la propiedad pflgmovil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPflgmovil(String value) {
        this.pflgmovil = value;
    }

}
