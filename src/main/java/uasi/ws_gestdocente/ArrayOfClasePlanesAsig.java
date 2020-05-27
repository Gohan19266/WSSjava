
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClasePlanesAsig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClasePlanesAsig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClasePlanesAsig" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClasePlanesAsig" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClasePlanesAsig", propOrder = {
    "clasePlanesAsig"
})
public class ArrayOfClasePlanesAsig {

    @XmlElement(name = "ClasePlanesAsig", nillable = true)
    protected List<ClasePlanesAsig> clasePlanesAsig;

    /**
     * Gets the value of the clasePlanesAsig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clasePlanesAsig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasePlanesAsig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClasePlanesAsig }
     * 
     * 
     */
    public List<ClasePlanesAsig> getClasePlanesAsig() {
        if (clasePlanesAsig == null) {
            clasePlanesAsig = new ArrayList<ClasePlanesAsig>();
        }
        return this.clasePlanesAsig;
    }

}
