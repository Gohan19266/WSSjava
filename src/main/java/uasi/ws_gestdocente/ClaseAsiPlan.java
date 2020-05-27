
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseAsiPlan complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseAsiPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomasicorto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciclo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desccurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ofertada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crdtsteo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crdtspra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crdtsects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tfg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseAsiPlan", propOrder = {
    "codest",
    "caca",
    "codasi",
    "nomasi",
    "nomasicorto",
    "tipo",
    "ciclo",
    "curso",
    "desccurso",
    "ofertada",
    "docencia",
    "complform",
    "crdtsteo",
    "crdtspra",
    "crdtsects",
    "duracion",
    "tfg",
    "estadoasi"
})
public class ClaseAsiPlan {

    protected String codest;
    protected String caca;
    protected String codasi;
    protected String nomasi;
    protected String nomasicorto;
    protected String tipo;
    protected String ciclo;
    protected String curso;
    protected String desccurso;
    protected String ofertada;
    protected String docencia;
    protected String complform;
    protected String crdtsteo;
    protected String crdtspra;
    protected String crdtsects;
    protected String duracion;
    protected String tfg;
    protected String estadoasi;

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
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad ciclo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiclo() {
        return ciclo;
    }

    /**
     * Define el valor de la propiedad ciclo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiclo(String value) {
        this.ciclo = value;
    }

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
     * Obtiene el valor de la propiedad desccurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesccurso() {
        return desccurso;
    }

    /**
     * Define el valor de la propiedad desccurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesccurso(String value) {
        this.desccurso = value;
    }

    /**
     * Obtiene el valor de la propiedad ofertada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfertada() {
        return ofertada;
    }

    /**
     * Define el valor de la propiedad ofertada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfertada(String value) {
        this.ofertada = value;
    }

    /**
     * Obtiene el valor de la propiedad docencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocencia() {
        return docencia;
    }

    /**
     * Define el valor de la propiedad docencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocencia(String value) {
        this.docencia = value;
    }

    /**
     * Obtiene el valor de la propiedad complform.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplform() {
        return complform;
    }

    /**
     * Define el valor de la propiedad complform.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplform(String value) {
        this.complform = value;
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
     * Obtiene el valor de la propiedad crdtsects.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtsects() {
        return crdtsects;
    }

    /**
     * Define el valor de la propiedad crdtsects.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtsects(String value) {
        this.crdtsects = value;
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
     * Obtiene el valor de la propiedad estadoasi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoasi() {
        return estadoasi;
    }

    /**
     * Define el valor de la propiedad estadoasi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoasi(String value) {
        this.estadoasi = value;
    }

}
