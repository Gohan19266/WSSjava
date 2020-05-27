
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseHorarioAgrp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseHorarioAgrp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idagrupa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descagr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codgrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomgrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descaula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idplaza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomplaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechainicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechafin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horafin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idactiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="teopra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diasem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="edificio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aulasig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseHorarioAgrp", propOrder = {
    "idagrupa",
    "descagr",
    "codgrp",
    "nomgrp",
    "aula",
    "descaula",
    "dni",
    "nombre",
    "apellido1",
    "apellido2",
    "idplaza",
    "nomplaz",
    "fechainicio",
    "fechafin",
    "horaini",
    "horafin",
    "idactiv",
    "nomact",
    "teopra",
    "codasi",
    "nomasi",
    "dia",
    "diasem",
    "edificio",
    "aulasig"
})
public class ClaseHorarioAgrp {

    protected String idagrupa;
    protected String descagr;
    protected String codgrp;
    protected String nomgrp;
    protected String aula;
    protected String descaula;
    protected String dni;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String idplaza;
    protected String nomplaz;
    protected String fechainicio;
    protected String fechafin;
    protected String horaini;
    protected String horafin;
    protected String idactiv;
    protected String nomact;
    protected String teopra;
    protected String codasi;
    protected String nomasi;
    protected String dia;
    protected String diasem;
    protected String edificio;
    protected String aulasig;

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
     * Obtiene el valor de la propiedad codgrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodgrp() {
        return codgrp;
    }

    /**
     * Define el valor de la propiedad codgrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodgrp(String value) {
        this.codgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad nomgrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomgrp() {
        return nomgrp;
    }

    /**
     * Define el valor de la propiedad nomgrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomgrp(String value) {
        this.nomgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad aula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAula() {
        return aula;
    }

    /**
     * Define el valor de la propiedad aula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAula(String value) {
        this.aula = value;
    }

    /**
     * Obtiene el valor de la propiedad descaula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescaula() {
        return descaula;
    }

    /**
     * Define el valor de la propiedad descaula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescaula(String value) {
        this.descaula = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDni(String value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Define el valor de la propiedad apellido1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido1(String value) {
        this.apellido1 = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Define el valor de la propiedad apellido2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido2(String value) {
        this.apellido2 = value;
    }

    /**
     * Obtiene el valor de la propiedad idplaza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdplaza() {
        return idplaza;
    }

    /**
     * Define el valor de la propiedad idplaza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdplaza(String value) {
        this.idplaza = value;
    }

    /**
     * Obtiene el valor de la propiedad nomplaz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomplaz() {
        return nomplaz;
    }

    /**
     * Define el valor de la propiedad nomplaz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomplaz(String value) {
        this.nomplaz = value;
    }

    /**
     * Obtiene el valor de la propiedad fechainicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechainicio() {
        return fechainicio;
    }

    /**
     * Define el valor de la propiedad fechainicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechainicio(String value) {
        this.fechainicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechafin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechafin() {
        return fechafin;
    }

    /**
     * Define el valor de la propiedad fechafin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechafin(String value) {
        this.fechafin = value;
    }

    /**
     * Obtiene el valor de la propiedad horaini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraini() {
        return horaini;
    }

    /**
     * Define el valor de la propiedad horaini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraini(String value) {
        this.horaini = value;
    }

    /**
     * Obtiene el valor de la propiedad horafin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorafin() {
        return horafin;
    }

    /**
     * Define el valor de la propiedad horafin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorafin(String value) {
        this.horafin = value;
    }

    /**
     * Obtiene el valor de la propiedad idactiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdactiv() {
        return idactiv;
    }

    /**
     * Define el valor de la propiedad idactiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdactiv(String value) {
        this.idactiv = value;
    }

    /**
     * Obtiene el valor de la propiedad nomact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomact() {
        return nomact;
    }

    /**
     * Define el valor de la propiedad nomact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomact(String value) {
        this.nomact = value;
    }

    /**
     * Obtiene el valor de la propiedad teopra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeopra() {
        return teopra;
    }

    /**
     * Define el valor de la propiedad teopra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeopra(String value) {
        this.teopra = value;
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
     * Obtiene el valor de la propiedad dia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDia() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDia(String value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad diasem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiasem() {
        return diasem;
    }

    /**
     * Define el valor de la propiedad diasem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiasem(String value) {
        this.diasem = value;
    }

    /**
     * Obtiene el valor de la propiedad edificio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdificio() {
        return edificio;
    }

    /**
     * Define el valor de la propiedad edificio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdificio(String value) {
        this.edificio = value;
    }

    /**
     * Obtiene el valor de la propiedad aulasig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAulasig() {
        return aulasig;
    }

    /**
     * Define el valor de la propiedad aulasig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAulasig(String value) {
        this.aulasig = value;
    }

}
