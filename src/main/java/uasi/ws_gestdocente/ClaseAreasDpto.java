
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseAreasDpto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseAreasDpto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codarea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomarea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseAreasDpto", propOrder = {
    "codarea",
    "nomarea"
})
public class ClaseAreasDpto {

    protected String codarea;
    protected String nomarea;

    /**
     * Obtiene el valor de la propiedad codarea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodarea() {
        return codarea;
    }

    /**
     * Define el valor de la propiedad codarea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodarea(String value) {
        this.codarea = value;
    }

    /**
     * Obtiene el valor de la propiedad nomarea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomarea() {
        return nomarea;
    }

    /**
     * Define el valor de la propiedad nomarea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomarea(String value) {
        this.nomarea = value;
    }

}
