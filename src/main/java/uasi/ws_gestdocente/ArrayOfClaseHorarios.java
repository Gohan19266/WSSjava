
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseHorarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseHorarios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseHorarios" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseHorarios" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseHorarios", propOrder = {
    "claseHorarios"
})
public class ArrayOfClaseHorarios {

    @XmlElement(name = "ClaseHorarios", nillable = true)
    protected List<ClaseHorarios> claseHorarios;

    /**
     * Gets the value of the claseHorarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseHorarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseHorarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseHorarios }
     * 
     * 
     */
    public List<ClaseHorarios> getClaseHorarios() {
        if (claseHorarios == null) {
            claseHorarios = new ArrayList<ClaseHorarios>();
        }
        return this.claseHorarios;
    }

}
