
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseDptoCen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseDptoCen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codcen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coddep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomdep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseDptoCen", propOrder = {
    "codcen",
    "coddep",
    "nomdep"
})
public class ClaseDptoCen {

    protected String codcen;
    protected String coddep;
    protected String nomdep;

    /**
     * Obtiene el valor de la propiedad codcen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodcen() {
        return codcen;
    }

    /**
     * Define el valor de la propiedad codcen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodcen(String value) {
        this.codcen = value;
    }

    /**
     * Obtiene el valor de la propiedad coddep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoddep() {
        return coddep;
    }

    /**
     * Define el valor de la propiedad coddep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoddep(String value) {
        this.coddep = value;
    }

    /**
     * Obtiene el valor de la propiedad nomdep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomdep() {
        return nomdep;
    }

    /**
     * Define el valor de la propiedad nomdep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomdep(String value) {
        this.nomdep = value;
    }

}
