
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseFechaExamenesAsi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseFechaExamenesAsi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseFechaExamenesAsi" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseFechaExamenesAsi" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseFechaExamenesAsi", propOrder = {
    "claseFechaExamenesAsi"
})
public class ArrayOfClaseFechaExamenesAsi {

    @XmlElement(name = "ClaseFechaExamenesAsi", nillable = true)
    protected List<ClaseFechaExamenesAsi> claseFechaExamenesAsi;

    /**
     * Gets the value of the claseFechaExamenesAsi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseFechaExamenesAsi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseFechaExamenesAsi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseFechaExamenesAsi }
     * 
     * 
     */
    public List<ClaseFechaExamenesAsi> getClaseFechaExamenesAsi() {
        if (claseFechaExamenesAsi == null) {
            claseFechaExamenesAsi = new ArrayList<ClaseFechaExamenesAsi>();
        }
        return this.claseFechaExamenesAsi;
    }

}
