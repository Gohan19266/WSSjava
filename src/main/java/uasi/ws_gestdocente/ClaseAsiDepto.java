
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseAsiDepto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseAsiDepto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enlaceasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseAsiDepto", propOrder = {
    "codasi",
    "nomasi",
    "enlaceasi",
    "codest",
    "nomest"
})
public class ClaseAsiDepto {

    protected String codasi;
    protected String nomasi;
    protected String enlaceasi;
    protected String codest;
    protected String nomest;

    /**
     * Obtiene el valor de la propiedad codasi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodasi() {
        return codasi;
    }

    /**
     * Define el valor de la propiedad codasi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodasi(String value) {
        this.codasi = value;
    }

    /**
     * Obtiene el valor de la propiedad nomasi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomasi() {
        return nomasi;
    }

    /**
     * Define el valor de la propiedad nomasi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomasi(String value) {
        this.nomasi = value;
    }

    /**
     * Obtiene el valor de la propiedad enlaceasi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnlaceasi() {
        return enlaceasi;
    }

    /**
     * Define el valor de la propiedad enlaceasi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnlaceasi(String value) {
        this.enlaceasi = value;
    }

    /**
     * Obtiene el valor de la propiedad codest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodest() {
        return codest;
    }

    /**
     * Define el valor de la propiedad codest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodest(String value) {
        this.codest = value;
    }

    /**
     * Obtiene el valor de la propiedad nomest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomest() {
        return nomest;
    }

    /**
     * Define el valor de la propiedad nomest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomest(String value) {
        this.nomest = value;
    }

}
