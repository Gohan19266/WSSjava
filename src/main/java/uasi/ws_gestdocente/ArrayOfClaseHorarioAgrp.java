
package uasi.ws_gestdocente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseHorarioAgrp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseHorarioAgrp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaseHorarioAgrp" type="{http://UASI/WS_GESTDOCENTE.wsdl}ClaseHorarioAgrp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseHorarioAgrp", propOrder = {
    "claseHorarioAgrp"
})
public class ArrayOfClaseHorarioAgrp {

    @XmlElement(name = "ClaseHorarioAgrp", nillable = true)
    protected List<ClaseHorarioAgrp> claseHorarioAgrp;

    /**
     * Gets the value of the claseHorarioAgrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseHorarioAgrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseHorarioAgrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseHorarioAgrp }
     * 
     * 
     */
    public List<ClaseHorarioAgrp> getClaseHorarioAgrp() {
        if (claseHorarioAgrp == null) {
            claseHorarioAgrp = new ArrayList<ClaseHorarioAgrp>();
        }
        return this.claseHorarioAgrp;
    }

}
