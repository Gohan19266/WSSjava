
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plengua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pcodcen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pcoddep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plengua",
    "pcodcen",
    "pcoddep"
})
@XmlRootElement(name = "wsdptocen")
public class Wsdptocen {

    protected String plengua;
    protected String pcodcen;
    protected String pcoddep;

    /**
     * Obtiene el valor de la propiedad plengua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlengua() {
        return plengua;
    }

    /**
     * Define el valor de la propiedad plengua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlengua(String value) {
        this.plengua = value;
    }

    /**
     * Obtiene el valor de la propiedad pcodcen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcodcen() {
        return pcodcen;
    }

    /**
     * Define el valor de la propiedad pcodcen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcodcen(String value) {
        this.pcodcen = value;
    }

    /**
     * Obtiene el valor de la propiedad pcoddep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcoddep() {
        return pcoddep;
    }

    /**
     * Define el valor de la propiedad pcoddep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcoddep(String value) {
        this.pcoddep = value;
    }

}
