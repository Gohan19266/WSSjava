
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseConvocatorias complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseConvocatorias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseConvocatorias" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseConvocatorias" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseConvocatorias", propOrder = {
    "claseConvocatorias"
})
public class ArrayOfClaseConvocatorias {

    @XmlElement(name = "ClaseConvocatorias", nillable = true)
    protected List<ClaseConvocatorias> claseConvocatorias;

    /**
     * Gets the value of the claseConvocatorias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseConvocatorias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseConvocatorias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseConvocatorias }
     * 
     * 
     */
    public List<ClaseConvocatorias> getClaseConvocatorias() {
        if (claseConvocatorias == null) {
            claseConvocatorias = new ArrayList<ClaseConvocatorias>();
        }
        return this.claseConvocatorias;
    }

}
