
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseConveMovilidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseConveMovilidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tip_codnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uni_codalf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pai_codalf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomuni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="are_codalf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_area_eng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_area_val" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_area_cas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plazas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vigente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flgmodificable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disp_desidi2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prog_codnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cen_codnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nom_centro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idi_universidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idiomas_nivel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idiomas_nivel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idiomas_nivel3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomcoordina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promotor_ua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="web_uni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="web_oficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseConveMovilidad", propOrder = {
    "tipCodnum",
    "uniCodalf",
    "paiCodalf",
    "nombre",
    "nomuni",
    "areCodalf",
    "descAreaEng",
    "descAreaVal",
    "descAreaCas",
    "nivel",
    "plazas",
    "meses",
    "vigente",
    "desde",
    "hasta",
    "flgmodificable",
    "dispDesidi2",
    "progCodnum",
    "cenCodnum",
    "nomCentro",
    "idiUniversidad",
    "modo",
    "idiomasNivel1",
    "idiomasNivel2",
    "idiomasNivel3",
    "nomcoordina",
    "promotorUa",
    "webUni",
    "webOficina"
})
public class ClaseConveMovilidad {

    @XmlElement(name = "tip_codnum")
    protected String tipCodnum;
    @XmlElement(name = "uni_codalf")
    protected String uniCodalf;
    @XmlElement(name = "pai_codalf")
    protected String paiCodalf;
    protected String nombre;
    protected String nomuni;
    @XmlElement(name = "are_codalf")
    protected String areCodalf;
    @XmlElement(name = "desc_area_eng")
    protected String descAreaEng;
    @XmlElement(name = "desc_area_val")
    protected String descAreaVal;
    @XmlElement(name = "desc_area_cas")
    protected String descAreaCas;
    protected String nivel;
    protected String plazas;
    protected String meses;
    protected String vigente;
    protected String desde;
    protected String hasta;
    protected String flgmodificable;
    @XmlElement(name = "disp_desidi2")
    protected String dispDesidi2;
    @XmlElement(name = "prog_codnum")
    protected String progCodnum;
    @XmlElement(name = "cen_codnum")
    protected String cenCodnum;
    @XmlElement(name = "nom_centro")
    protected String nomCentro;
    @XmlElement(name = "idi_universidad")
    protected String idiUniversidad;
    protected String modo;
    @XmlElement(name = "idiomas_nivel1")
    protected String idiomasNivel1;
    @XmlElement(name = "idiomas_nivel2")
    protected String idiomasNivel2;
    @XmlElement(name = "idiomas_nivel3")
    protected String idiomasNivel3;
    protected String nomcoordina;
    @XmlElement(name = "promotor_ua")
    protected String promotorUa;
    @XmlElement(name = "web_uni")
    protected String webUni;
    @XmlElement(name = "web_oficina")
    protected String webOficina;

    /**
     * Obtiene el valor de la propiedad tipCodnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipCodnum() {
        return tipCodnum;
    }

    /**
     * Define el valor de la propiedad tipCodnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipCodnum(String value) {
        this.tipCodnum = value;
    }

    /**
     * Obtiene el valor de la propiedad uniCodalf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniCodalf() {
        return uniCodalf;
    }

    /**
     * Define el valor de la propiedad uniCodalf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniCodalf(String value) {
        this.uniCodalf = value;
    }

    /**
     * Obtiene el valor de la propiedad paiCodalf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaiCodalf() {
        return paiCodalf;
    }

    /**
     * Define el valor de la propiedad paiCodalf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaiCodalf(String value) {
        this.paiCodalf = value;
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
     * Obtiene el valor de la propiedad nomuni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomuni() {
        return nomuni;
    }

    /**
     * Define el valor de la propiedad nomuni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomuni(String value) {
        this.nomuni = value;
    }

    /**
     * Obtiene el valor de la propiedad areCodalf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreCodalf() {
        return areCodalf;
    }

    /**
     * Define el valor de la propiedad areCodalf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreCodalf(String value) {
        this.areCodalf = value;
    }

    /**
     * Obtiene el valor de la propiedad descAreaEng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAreaEng() {
        return descAreaEng;
    }

    /**
     * Define el valor de la propiedad descAreaEng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAreaEng(String value) {
        this.descAreaEng = value;
    }

    /**
     * Obtiene el valor de la propiedad descAreaVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAreaVal() {
        return descAreaVal;
    }

    /**
     * Define el valor de la propiedad descAreaVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAreaVal(String value) {
        this.descAreaVal = value;
    }

    /**
     * Obtiene el valor de la propiedad descAreaCas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAreaCas() {
        return descAreaCas;
    }

    /**
     * Define el valor de la propiedad descAreaCas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAreaCas(String value) {
        this.descAreaCas = value;
    }

    /**
     * Obtiene el valor de la propiedad nivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Define el valor de la propiedad nivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivel(String value) {
        this.nivel = value;
    }

    /**
     * Obtiene el valor de la propiedad plazas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazas() {
        return plazas;
    }

    /**
     * Define el valor de la propiedad plazas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazas(String value) {
        this.plazas = value;
    }

    /**
     * Obtiene el valor de la propiedad meses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeses() {
        return meses;
    }

    /**
     * Define el valor de la propiedad meses.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeses(String value) {
        this.meses = value;
    }

    /**
     * Obtiene el valor de la propiedad vigente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigente() {
        return vigente;
    }

    /**
     * Define el valor de la propiedad vigente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigente(String value) {
        this.vigente = value;
    }

    /**
     * Obtiene el valor de la propiedad desde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesde() {
        return desde;
    }

    /**
     * Define el valor de la propiedad desde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesde(String value) {
        this.desde = value;
    }

    /**
     * Obtiene el valor de la propiedad hasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasta() {
        return hasta;
    }

    /**
     * Define el valor de la propiedad hasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasta(String value) {
        this.hasta = value;
    }

    /**
     * Obtiene el valor de la propiedad flgmodificable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgmodificable() {
        return flgmodificable;
    }

    /**
     * Define el valor de la propiedad flgmodificable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgmodificable(String value) {
        this.flgmodificable = value;
    }

    /**
     * Obtiene el valor de la propiedad dispDesidi2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispDesidi2() {
        return dispDesidi2;
    }

    /**
     * Define el valor de la propiedad dispDesidi2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispDesidi2(String value) {
        this.dispDesidi2 = value;
    }

    /**
     * Obtiene el valor de la propiedad progCodnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgCodnum() {
        return progCodnum;
    }

    /**
     * Define el valor de la propiedad progCodnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgCodnum(String value) {
        this.progCodnum = value;
    }

    /**
     * Obtiene el valor de la propiedad cenCodnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenCodnum() {
        return cenCodnum;
    }

    /**
     * Define el valor de la propiedad cenCodnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenCodnum(String value) {
        this.cenCodnum = value;
    }

    /**
     * Obtiene el valor de la propiedad nomCentro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCentro() {
        return nomCentro;
    }

    /**
     * Define el valor de la propiedad nomCentro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCentro(String value) {
        this.nomCentro = value;
    }

    /**
     * Obtiene el valor de la propiedad idiUniversidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiUniversidad() {
        return idiUniversidad;
    }

    /**
     * Define el valor de la propiedad idiUniversidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiUniversidad(String value) {
        this.idiUniversidad = value;
    }

    /**
     * Obtiene el valor de la propiedad modo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModo() {
        return modo;
    }

    /**
     * Define el valor de la propiedad modo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModo(String value) {
        this.modo = value;
    }

    /**
     * Obtiene el valor de la propiedad idiomasNivel1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiomasNivel1() {
        return idiomasNivel1;
    }

    /**
     * Define el valor de la propiedad idiomasNivel1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiomasNivel1(String value) {
        this.idiomasNivel1 = value;
    }

    /**
     * Obtiene el valor de la propiedad idiomasNivel2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiomasNivel2() {
        return idiomasNivel2;
    }

    /**
     * Define el valor de la propiedad idiomasNivel2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiomasNivel2(String value) {
        this.idiomasNivel2 = value;
    }

    /**
     * Obtiene el valor de la propiedad idiomasNivel3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiomasNivel3() {
        return idiomasNivel3;
    }

    /**
     * Define el valor de la propiedad idiomasNivel3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiomasNivel3(String value) {
        this.idiomasNivel3 = value;
    }

    /**
     * Obtiene el valor de la propiedad nomcoordina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomcoordina() {
        return nomcoordina;
    }

    /**
     * Define el valor de la propiedad nomcoordina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomcoordina(String value) {
        this.nomcoordina = value;
    }

    /**
     * Obtiene el valor de la propiedad promotorUa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotorUa() {
        return promotorUa;
    }

    /**
     * Define el valor de la propiedad promotorUa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotorUa(String value) {
        this.promotorUa = value;
    }

    /**
     * Obtiene el valor de la propiedad webUni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUni() {
        return webUni;
    }

    /**
     * Define el valor de la propiedad webUni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUni(String value) {
        this.webUni = value;
    }

    /**
     * Obtiene el valor de la propiedad webOficina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebOficina() {
        return webOficina;
    }

    /**
     * Define el valor de la propiedad webOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebOficina(String value) {
        this.webOficina = value;
    }

}
