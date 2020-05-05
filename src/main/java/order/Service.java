package order;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class Service {
    @XmlAttribute(name="isClosed")
    private int isClosed;

    @XmlElement(name = "serv_id")
    private String servId;

    @XmlElement
    private int bic;

    @XmlElement
    private String schet;

    @XmlElement
    private int corrSchet;

    @XmlElement(name = "pars")
    private ParameterGroup pars;

    @XmlElement(name = "sys_message")
    private String sysMessage;

    public int getIsClosed() {
        return isClosed;
    }

    public String getServId() {
        return servId;
    }

    public int getBic() {
        return bic;
    }

    public String getSchet() {
        return schet;
    }

    public int getCorrSchet() {
        return corrSchet;
    }

    public ParameterGroup getPars() {
        return pars;
    }

    public String getSysMessage() {
        return sysMessage;
    }
}
