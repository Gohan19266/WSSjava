
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseAgrupaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseAgrupaciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idagrupa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descagr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enlaceagrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codcen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desccen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numcurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomturno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseAgrupaciones", propOrder = {
    "idagrupa",
    "descagr",
    "enlaceagrp",
    "codcen",
    "desccen",
    "codest",
    "nomest",
    "numcurso",
    "nomturno"
})
public class ClaseAgrupaciones {

    protected String idagrupa;
    protected String descagr;
    protected String enlaceagrp;
    protected String codcen;
    protected String desccen;
    protected String codest;
    protected String nomest;
    protected String numcurso;
    protected String nomturno;

    /**
     * Obtiene el valor de la propiedad idagrupa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdagrupa() {
        return idagrupa;
    }

    /**
     * Define el valor de la propiedad idagrupa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdagrupa(String value) {
        this.idagrupa = value;
    }

    /**
     * Obtiene el valor de la propiedad descagr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescagr() {
        return descagr;
    }

    /**
     * Define el valor de la propiedad descagr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescagr(String value) {
        this.descagr = value;
    }

    /**
     * Obtiene el valor de la propiedad enlaceagrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnlaceagrp() {
        return enlaceagrp;
    }

    /**
     * Define el valor de la propiedad enlaceagrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnlaceagrp(String value) {
        this.enlaceagrp = value;
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
     * Obtiene el valor de la propiedad desccen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesccen() {
        return desccen;
    }

    /**
     * Define el valor de la propiedad desccen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesccen(String value) {
        this.desccen = value;
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

    /**
     * Obtiene el valor de la propiedad numcurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumcurso() {
        return numcurso;
    }

    /**
     * Define el valor de la propiedad numcurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumcurso(String value) {
        this.numcurso = value;
    }

    /**
     * Obtiene el valor de la propiedad nomturno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomturno() {
        return nomturno;
    }

    /**
     * Define el valor de la propiedad nomturno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomturno(String value) {
        this.nomturno = value;
    }

}
