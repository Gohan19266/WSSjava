
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseAreasDpto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseAreasDpto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseAreasDpto" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseAreasDpto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseAreasDpto", propOrder = {
    "claseAreasDpto"
})
public class ArrayOfClaseAreasDpto {

    @XmlElement(name = "ClaseAreasDpto", nillable = true)
    protected List<ClaseAreasDpto> claseAreasDpto;

    /**
     * Gets the value of the claseAreasDpto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseAreasDpto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseAreasDpto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseAreasDpto }
     * 
     * 
     */
    public List<ClaseAreasDpto> getClaseAreasDpto() {
        if (claseAreasDpto == null) {
            claseAreasDpto = new ArrayList<ClaseAreasDpto>();
        }
        return this.claseAreasDpto;
    }

}
