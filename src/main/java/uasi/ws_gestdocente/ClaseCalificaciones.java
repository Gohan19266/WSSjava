
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseCalificaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseCalificaciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ranmin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ranmax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseCalificaciones", propOrder = {
    "cod",
    "descripcion",
    "descripcionasi",
    "ranmin",
    "ranmax"
})
public class ClaseCalificaciones {

    protected String cod;
    protected String descripcion;
    protected String descripcionasi;
    protected String ranmin;
    protected String ranmax;

    /**
     * Obtiene el valor de la propiedad cod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCod() {
        return cod;
    }

    /**
     * Define el valor de la propiedad cod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCod(String value) {
        this.cod = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionasi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionasi() {
        return descripcionasi;
    }

    /**
     * Define el valor de la propiedad descripcionasi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionasi(String value) {
        this.descripcionasi = value;
    }

    /**
     * Obtiene el valor de la propiedad ranmin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRanmin() {
        return ranmin;
    }

    /**
     * Define el valor de la propiedad ranmin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRanmin(String value) {
        this.ranmin = value;
    }

    /**
     * Obtiene el valor de la propiedad ranmax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRanmax() {
        return ranmax;
    }

    /**
     * Define el valor de la propiedad ranmax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRanmax(String value) {
        this.ranmax = value;
    }

}
