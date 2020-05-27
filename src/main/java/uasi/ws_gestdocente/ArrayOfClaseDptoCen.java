
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseDptoCen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseDptoCen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseDptoCen" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseDptoCen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseDptoCen", propOrder = {
    "claseDptoCen"
})
public class ArrayOfClaseDptoCen {

    @XmlElement(name = "ClaseDptoCen", nillable = true)
    protected List<ClaseDptoCen> claseDptoCen;

    /**
     * Gets the value of the claseDptoCen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseDptoCen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseDptoCen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseDptoCen }
     * 
     * 
     */
    public List<ClaseDptoCen> getClaseDptoCen() {
        if (claseDptoCen == null) {
            claseDptoCen = new ArrayList<ClaseDptoCen>();
        }
        return this.claseDptoCen;
    }

}
