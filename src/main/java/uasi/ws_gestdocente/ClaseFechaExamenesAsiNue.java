
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseFechaExamenesAsiNue complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseFechaExamenesAsiNue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codexa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idactiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codgrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codconv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idperiodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechareal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horafin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diasemana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="abrdsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aulasig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descaula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="campus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="edificio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ClaseFechaExamenesAsiNue", propOrder = {
    "codexa",
    "fecha",
    "codasi",
    "nomasi",
    "idactiv",
    "codgrp",
    "codconv",
    "conv",
    "idperiodo",
    "observaciones",
    "fechareal",
    "horaini",
    "horafin",
    "diasemana",
    "abrdsm",
    "dsm",
    "aula",
    "aulasig",
    "descaula",
    "campus",
    "edificio",
    "orden",
    "flgaula",
    "turno",
    "duracion",
    "capacidadAulas",
    "observaGe"
})
public class ClaseFechaExamenesAsiNue {

    protected String codexa;
    protected String fecha;
    protected String codasi;
    protected String nomasi;
    protected String idactiv;
    protected String codgrp;
    protected String codconv;
    protected String conv;
    protected String idperiodo;
    protected String observaciones;
    protected String fechareal;
    protected String horaini;
    protected String horafin;
    protected String diasemana;
    protected String abrdsm;
    protected String dsm;
    protected String aula;
    protected String aulasig;
    protected String descaula;
    protected String campus;
    protected String edificio;
    protected String orden;
    protected String flgaula;
    protected String turno;
    protected String duracion;
    @XmlElement(name = "capacidad_aulas")
    protected String capacidadAulas;
    @XmlElement(name = "observa_ge")
    protected String observaGe;

    /**
     * Obtiene el valor de la propiedad codexa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodexa() {
        return codexa;
    }

    /**
     * Define el valor de la propiedad codexa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodexa(String value) {
        this.codexa = value;
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
     * Obtiene el valor de la propiedad idperiodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdperiodo() {
        return idperiodo;
    }

    /**
     * Define el valor de la propiedad idperiodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdperiodo(String value) {
        this.idperiodo = value;
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
     * Obtiene el valor de la propiedad abrdsm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbrdsm() {
        return abrdsm;
    }

    /**
     * Define el valor de la propiedad abrdsm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbrdsm(String value) {
        this.abrdsm = value;
    }

    /**
     * Obtiene el valor de la propiedad dsm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsm() {
        return dsm;
    }

    /**
     * Define el valor de la propiedad dsm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsm(String value) {
        this.dsm = value;
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
     * Obtiene el valor de la propiedad campus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampus() {
        return campus;
    }

    /**
     * Define el valor de la propiedad campus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampus(String value) {
        this.campus = value;
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
