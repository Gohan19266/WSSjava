
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseDatosAsig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseDatosAsig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseDatosAsig" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseDatosAsig" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseDatosAsig", propOrder = {
    "claseDatosAsig"
})
public class ArrayOfClaseDatosAsig {

    @XmlElement(name = "ClaseDatosAsig", nillable = true)
    protected List<ClaseDatosAsig> claseDatosAsig;

    /**
     * Gets the value of the claseDatosAsig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseDatosAsig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseDatosAsig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseDatosAsig }
     * 
     * 
     */
    public List<ClaseDatosAsig> getClaseDatosAsig() {
        if (claseDatosAsig == null) {
            claseDatosAsig = new ArrayList<ClaseDatosAsig>();
        }
        return this.claseDatosAsig;
    }

}
