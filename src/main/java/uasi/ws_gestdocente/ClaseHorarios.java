
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseHorarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseHorarios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="teopra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codgrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejecodnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vaccodnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gaccodnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechainicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechafin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diasemana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horafin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descaula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aulasig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clase_activ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descactiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descgrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capacidadgrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flgcpc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseHorarios", propOrder = {
    "teopra",
    "codgrp",
    "ejecodnum",
    "vaccodnum",
    "gaccodnum",
    "fechainicio",
    "fechafin",
    "dia",
    "diasemana",
    "horaini",
    "horafin",
    "aula",
    "descaula",
    "aulasig",
    "claseActiv",
    "descactiv",
    "descgrupo",
    "idioma",
    "capacidadgrupo",
    "flgcpc"
})
public class ClaseHorarios {

    protected String teopra;
    protected String codgrp;
    protected String ejecodnum;
    protected String vaccodnum;
    protected String gaccodnum;
    protected String fechainicio;
    protected String fechafin;
    protected String dia;
    protected String diasemana;
    protected String horaini;
    protected String horafin;
    protected String aula;
    protected String descaula;
    protected String aulasig;
    @XmlElement(name = "clase_activ")
    protected String claseActiv;
    protected String descactiv;
    protected String descgrupo;
    protected String idioma;
    protected String capacidadgrupo;
    protected String flgcpc;

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
     * Obtiene el valor de la propiedad diasemana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiasemana() {
        return diasemana;
    }

    /**
     * Define el valor de la propiedad diasemana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiasemana(String value) {
        this.diasemana = value;
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

    /**
     * Obtiene el valor de la propiedad claseActiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaseActiv() {
        return claseActiv;
    }

    /**
     * Define el valor de la propiedad claseActiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaseActiv(String value) {
        this.claseActiv = value;
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
     * Obtiene el valor de la propiedad descgrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescgrupo() {
        return descgrupo;
    }

    /**
     * Define el valor de la propiedad descgrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescgrupo(String value) {
        this.descgrupo = value;
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

    /**
     * Obtiene el valor de la propiedad flgcpc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgcpc() {
        return flgcpc;
    }

    /**
     * Define el valor de la propiedad flgcpc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgcpc(String value) {
        this.flgcpc = value;
    }

}
