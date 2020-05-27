
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseCalificaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseCalificaciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseCalificaciones" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseCalificaciones" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseCalificaciones", propOrder = {
    "claseCalificaciones"
})
public class ArrayOfClaseCalificaciones {

    @XmlElement(name = "ClaseCalificaciones", nillable = true)
    protected List<ClaseCalificaciones> claseCalificaciones;

    /**
     * Gets the value of the claseCalificaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseCalificaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseCalificaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseCalificaciones }
     * 
     * 
     */
    public List<ClaseCalificaciones> getClaseCalificaciones() {
        if (claseCalificaciones == null) {
            claseCalificaciones = new ArrayList<ClaseCalificaciones>();
        }
        return this.claseCalificaciones;
    }

}
