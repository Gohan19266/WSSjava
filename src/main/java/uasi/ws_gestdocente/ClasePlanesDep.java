
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClasePlanesDep complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClasePlanesDep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="curso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coddep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codplan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomplan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClasePlanesDep", propOrder = {
    "curso",
    "coddep",
    "codplan",
    "nomplan"
})
public class ClasePlanesDep {

    protected String curso;
    protected String coddep;
    protected String codplan;
    protected String nomplan;

    /**
     * Obtiene el valor de la propiedad curso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Define el valor de la propiedad curso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurso(String value) {
        this.curso = value;
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
     * Obtiene el valor de la propiedad codplan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodplan() {
        return codplan;
    }

    /**
     * Define el valor de la propiedad codplan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodplan(String value) {
        this.codplan = value;
    }

    /**
     * Obtiene el valor de la propiedad nomplan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomplan() {
        return nomplan;
    }

    /**
     * Define el valor de la propiedad nomplan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomplan(String value) {
        this.nomplan = value;
    }

}
