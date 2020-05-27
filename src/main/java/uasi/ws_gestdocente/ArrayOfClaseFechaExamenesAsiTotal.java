
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseFechaExamenesAsiTotal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseFechaExamenesAsiTotal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseFechaExamenesAsiTotal" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseFechaExamenesAsiTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseFechaExamenesAsiTotal", propOrder = {
    "claseFechaExamenesAsiTotal"
})
public class ArrayOfClaseFechaExamenesAsiTotal {

    @XmlElement(name = "ClaseFechaExamenesAsiTotal", nillable = true)
    protected List<ClaseFechaExamenesAsiTotal> claseFechaExamenesAsiTotal;

    /**
     * Gets the value of the claseFechaExamenesAsiTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseFechaExamenesAsiTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseFechaExamenesAsiTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseFechaExamenesAsiTotal }
     * 
     * 
     */
    public List<ClaseFechaExamenesAsiTotal> getClaseFechaExamenesAsiTotal() {
        if (claseFechaExamenesAsiTotal == null) {
            claseFechaExamenesAsiTotal = new ArrayList<ClaseFechaExamenesAsiTotal>();
        }
        return this.claseFechaExamenesAsiTotal;
    }

}
