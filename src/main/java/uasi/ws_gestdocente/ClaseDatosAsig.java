
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseDatosAsig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseDatosAsig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomasicorto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crdtsteo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crdtspra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crdtects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tfg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="programa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseDatosAsig", propOrder = {
    "caca",
    "codasi",
    "nomasi",
    "nomasicorto",
    "crdtsteo",
    "crdtspra",
    "crdtects",
    "duracion",
    "tfg",
    "programa"
})
public class ClaseDatosAsig {

    protected String caca;
    protected String codasi;
    protected String nomasi;
    protected String nomasicorto;
    protected String crdtsteo;
    protected String crdtspra;
    protected String crdtects;
    protected String duracion;
    protected String tfg;
    protected String programa;

    /**
     * Obtiene el valor de la propiedad caca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaca() {
        return caca;
    }

    /**
     * Define el valor de la propiedad caca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaca(String value) {
        this.caca = value;
    }

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
     * Obtiene el valor de la propiedad nomasicorto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomasicorto() {
        return nomasicorto;
    }

    /**
     * Define el valor de la propiedad nomasicorto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomasicorto(String value) {
        this.nomasicorto = value;
    }

    /**
     * Obtiene el valor de la propiedad crdtsteo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtsteo() {
        return crdtsteo;
    }

    /**
     * Define el valor de la propiedad crdtsteo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtsteo(String value) {
        this.crdtsteo = value;
    }

    /**
     * Obtiene el valor de la propiedad crdtspra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtspra() {
        return crdtspra;
    }

    /**
     * Define el valor de la propiedad crdtspra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtspra(String value) {
        this.crdtspra = value;
    }

    /**
     * Obtiene el valor de la propiedad crdtects.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtects() {
        return crdtects;
    }

    /**
     * Define el valor de la propiedad crdtects.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtects(String value) {
        this.crdtects = value;
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
     * Obtiene el valor de la propiedad tfg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTfg() {
        return tfg;
    }

    /**
     * Define el valor de la propiedad tfg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTfg(String value) {
        this.tfg = value;
    }

    /**
     * Obtiene el valor de la propiedad programa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * Define el valor de la propiedad programa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrograma(String value) {
        this.programa = value;
    }

}
