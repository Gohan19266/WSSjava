
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseFechaExamenesAsiNue complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseFechaExamenesAsiNue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseFechaExamenesAsiNue" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseFechaExamenesAsiNue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseFechaExamenesAsiNue", propOrder = {
    "claseFechaExamenesAsiNue"
})
public class ArrayOfClaseFechaExamenesAsiNue {

    @XmlElement(name = "ClaseFechaExamenesAsiNue", nillable = true)
    protected List<ClaseFechaExamenesAsiNue> claseFechaExamenesAsiNue;

    /**
     * Gets the value of the claseFechaExamenesAsiNue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseFechaExamenesAsiNue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseFechaExamenesAsiNue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseFechaExamenesAsiNue }
     * 
     * 
     */
    public List<ClaseFechaExamenesAsiNue> getClaseFechaExamenesAsiNue() {
        if (claseFechaExamenesAsiNue == null) {
            claseFechaExamenesAsiNue = new ArrayList<ClaseFechaExamenesAsiNue>();
        }
        return this.claseFechaExamenesAsiNue;
    }

}
