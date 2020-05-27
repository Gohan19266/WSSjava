
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseDatosPlan complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseDatosPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codestgen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomestgen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtiponombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomcen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="anoini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="anofin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codruct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ncursos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipogra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="urlmovil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagenmovil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseDatosPlan", propOrder = {
    "codest",
    "nomest",
    "codestgen",
    "nomestgen",
    "tipo",
    "subtipo",
    "subtiponombre",
    "codcen",
    "nomcen",
    "anoini",
    "anofin",
    "codruct",
    "ncursos",
    "tipogra",
    "area",
    "urlmovil",
    "imagenmovil"
})
public class ClaseDatosPlan {

    protected String codest;
    protected String nomest;
    protected String codestgen;
    protected String nomestgen;
    protected String tipo;
    protected String subtipo;
    protected String subtiponombre;
    protected String codcen;
    protected String nomcen;
    protected String anoini;
    protected String anofin;
    protected String codruct;
    protected String ncursos;
    protected String tipogra;
    protected String area;
    protected String urlmovil;
    protected String imagenmovil;

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

    /**
     * Obtiene el valor de la propiedad codestgen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodestgen() {
        return codestgen;
    }

    /**
     * Define el valor de la propiedad codestgen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodestgen(String value) {
        this.codestgen = value;
    }

    /**
     * Obtiene el valor de la propiedad nomestgen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomestgen() {
        return nomestgen;
    }

    /**
     * Define el valor de la propiedad nomestgen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomestgen(String value) {
        this.nomestgen = value;
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
     * Obtiene el valor de la propiedad subtipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtipo() {
        return subtipo;
    }

    /**
     * Define el valor de la propiedad subtipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtipo(String value) {
        this.subtipo = value;
    }

    /**
     * Obtiene el valor de la propiedad subtiponombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtiponombre() {
        return subtiponombre;
    }

    /**
     * Define el valor de la propiedad subtiponombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtiponombre(String value) {
        this.subtiponombre = value;
    }

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
     * Obtiene el valor de la propiedad nomcen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomcen() {
        return nomcen;
    }

    /**
     * Define el valor de la propiedad nomcen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomcen(String value) {
        this.nomcen = value;
    }

    /**
     * Obtiene el valor de la propiedad anoini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoini() {
        return anoini;
    }

    /**
     * Define el valor de la propiedad anoini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoini(String value) {
        this.anoini = value;
    }

    /**
     * Obtiene el valor de la propiedad anofin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnofin() {
        return anofin;
    }

    /**
     * Define el valor de la propiedad anofin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnofin(String value) {
        this.anofin = value;
    }

    /**
     * Obtiene el valor de la propiedad codruct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodruct() {
        return codruct;
    }

    /**
     * Define el valor de la propiedad codruct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodruct(String value) {
        this.codruct = value;
    }

    /**
     * Obtiene el valor de la propiedad ncursos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcursos() {
        return ncursos;
    }

    /**
     * Define el valor de la propiedad ncursos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcursos(String value) {
        this.ncursos = value;
    }

    /**
     * Obtiene el valor de la propiedad tipogra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipogra() {
        return tipogra;
    }

    /**
     * Define el valor de la propiedad tipogra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipogra(String value) {
        this.tipogra = value;
    }

    /**
     * Obtiene el valor de la propiedad area.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Define el valor de la propiedad area.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Obtiene el valor de la propiedad urlmovil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlmovil() {
        return urlmovil;
    }

    /**
     * Define el valor de la propiedad urlmovil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlmovil(String value) {
        this.urlmovil = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenmovil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagenmovil() {
        return imagenmovil;
    }

    /**
     * Define el valor de la propiedad imagenmovil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagenmovil(String value) {
        this.imagenmovil = value;
    }

}
