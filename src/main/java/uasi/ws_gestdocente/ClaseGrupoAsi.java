
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseGrupoAsi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseGrupoAsi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ejecodnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vaccodnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gaccodnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idgrpactiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claseactiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descactiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capacidadgrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseGrupoAsi", propOrder = {
    "ejecodnum",
    "vaccodnum",
    "gaccodnum",
    "turno",
    "idioma",
    "duracion",
    "idgrpactiv",
    "descripcion",
    "claseactiv",
    "descactiv",
    "capacidadgrupo"
})
public class ClaseGrupoAsi {

    protected String ejecodnum;
    protected String vaccodnum;
    protected String gaccodnum;
    protected String turno;
    protected String idioma;
    protected String duracion;
    protected String idgrpactiv;
    protected String descripcion;
    protected String claseactiv;
    protected String descactiv;
    protected String capacidadgrupo;

    /**
     * Obtiene el valor de la propiedad ejecodnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjecodnum() {
        return ejecodnum;
    }

    /**
     * Define el valor de la propiedad ejecodnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjecodnum(String value) {
        this.ejecodnum = value;
    }

    /**
     * Obtiene el valor de la propiedad vaccodnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVaccodnum() {
        return vaccodnum;
    }

    /**
     * Define el valor de la propiedad vaccodnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaccodnum(String value) {
        this.vaccodnum = value;
    }

    /**
     * Obtiene el valor de la propiedad gaccodnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGaccodnum() {
        return gaccodnum;
    }

    /**
     * Define el valor de la propiedad gaccodnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGaccodnum(String value) {
        this.gaccodnum = value;
    }

    /**
     * Obtiene el valor de la propiedad turno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Define el valor de la propiedad turno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurno(String value) {
        this.turno = value;
    }

    /**
     * Obtiene el valor de la propiedad idioma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Define el valor de la propiedad idioma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdioma(String value) {
        this.idioma = value;
    }

    /**
     * Obtiene el valor de la propiedad duracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Define el valor de la propiedad duracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuracion(String value) {
        this.duracion = value;
    }

    /**
     * Obtiene el valor de la propiedad idgrpactiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdgrpactiv() {
        return idgrpactiv;
    }

    /**
     * Define el valor de la propiedad idgrpactiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdgrpactiv(String value) {
        this.idgrpactiv = value;
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
     * Obtiene el valor de la propiedad claseactiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaseactiv() {
        return claseactiv;
    }

    /**
     * Define el valor de la propiedad claseactiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaseactiv(String value) {
        this.claseactiv = value;
    }

    /**
     * Obtiene el valor de la propiedad descactiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescactiv() {
        return descactiv;
    }

    /**
     * Define el valor de la propiedad descactiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescactiv(String value) {
        this.descactiv = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidadgrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapacidadgrupo() {
        return capacidadgrupo;
    }

    /**
     * Define el valor de la propiedad capacidadgrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapacidadgrupo(String value) {
        this.capacidadgrupo = value;
    }

}
