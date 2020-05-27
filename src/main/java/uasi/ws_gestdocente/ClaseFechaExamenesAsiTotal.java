
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseFechaExamenesAsiTotal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseFechaExamenesAsiTotal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codgrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codconv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numcurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desccurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechareal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horafin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aulasig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descaula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flgaula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capacidad_aulas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observa_ge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseFechaExamenesAsiTotal", propOrder = {
    "id",
    "fecha",
    "codasi",
    "nomasi",
    "codgrp",
    "codconv",
    "conv",
    "observaciones",
    "codest",
    "numcurso",
    "desccurso",
    "complform",
    "fechareal",
    "horaini",
    "horafin",
    "aula",
    "aulasig",
    "descaula",
    "dia",
    "orden",
    "flgaula",
    "turno",
    "duracion",
    "capacidadAulas",
    "observaGe"
})
public class ClaseFechaExamenesAsiTotal {

    protected String id;
    protected String fecha;
    protected String codasi;
    protected String nomasi;
    protected String codgrp;
    protected String codconv;
    protected String conv;
    protected String observaciones;
    protected String codest;
    protected String numcurso;
    protected String desccurso;
    protected String complform;
    protected String fechareal;
    protected String horaini;
    protected String horafin;
    protected String aula;
    protected String aulasig;
    protected String descaula;
    protected String dia;
    protected String orden;
    protected String flgaula;
    protected String turno;
    protected String duracion;
    @XmlElement(name = "capacidad_aulas")
    protected String capacidadAulas;
    @XmlElement(name = "observa_ge")
    protected String observaGe;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
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
     * Obtiene el valor de la propiedad codconv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodconv() {
        return codconv;
    }

    /**
     * Define el valor de la propiedad codconv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodconv(String value) {
        this.codconv = value;
    }

    /**
     * Obtiene el valor de la propiedad conv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv() {
        return conv;
    }

    /**
     * Define el valor de la propiedad conv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv(String value) {
        this.conv = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
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
     * Obtiene el valor de la propiedad fechareal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechareal() {
        return fechareal;
    }

    /**
     * Define el valor de la propiedad fechareal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechareal(String value) {
        this.fechareal = value;
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
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrden(String value) {
        this.orden = value;
    }

    /**
     * Obtiene el valor de la propiedad flgaula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgaula() {
        return flgaula;
    }

    /**
     * Define el valor de la propiedad flgaula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgaula(String value) {
        this.flgaula = value;
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
     * Obtiene el valor de la propiedad capacidadAulas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapacidadAulas() {
        return capacidadAulas;
    }

    /**
     * Define el valor de la propiedad capacidadAulas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapacidadAulas(String value) {
        this.capacidadAulas = value;
    }

    /**
     * Obtiene el valor de la propiedad observaGe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaGe() {
        return observaGe;
    }

    /**
     * Define el valor de la propiedad observaGe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaGe(String value) {
        this.observaGe = value;
    }

}
