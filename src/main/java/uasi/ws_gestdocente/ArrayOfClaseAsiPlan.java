
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseAsiPlan complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseAsiPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseAsiPlan" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseAsiPlan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseAsiPlan", propOrder = {
    "claseAsiPlan"
})
public class ArrayOfClaseAsiPlan {

    @XmlElement(name = "ClaseAsiPlan", nillable = true)
    protected List<ClaseAsiPlan> claseAsiPlan;

    /**
     * Gets the value of the claseAsiPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseAsiPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseAsiPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseAsiPlan }
     * 
     * 
     */
    public List<ClaseAsiPlan> getClaseAsiPlan() {
        if (claseAsiPlan == null) {
            claseAsiPlan = new ArrayList<ClaseAsiPlan>();
        }
        return this.claseAsiPlan;
    }

}
