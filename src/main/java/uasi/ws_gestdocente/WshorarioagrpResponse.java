
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wshorarioagrpResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseHorarioAgrp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wshorarioagrpResult"
})
@XmlRootElement(name = "wshorarioagrpResponse")
public class WshorarioagrpResponse {

    protected ArrayOfClaseHorarioAgrp wshorarioagrpResult;

    /**
     * Obtiene el valor de la propiedad wshorarioagrpResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseHorarioAgrp }
     *     
     */
    public ArrayOfClaseHorarioAgrp getWshorarioagrpResult() {
        return wshorarioagrpResult;
    }

    /**
     * Define el valor de la propiedad wshorarioagrpResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseHorarioAgrp }
     *     
     */
    public void setWshorarioagrpResult(ArrayOfClaseHorarioAgrp value) {
        this.wshorarioagrpResult = value;
    }

}
