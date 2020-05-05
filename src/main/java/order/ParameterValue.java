package order;

import javax.xml.bind.annotation.XmlAttribute;

public class ParameterValue implements Comparable<ParameterValue> {
    @XmlAttribute
    private String value;

    public String getValue() {
        return value;
    }

    //ParameterListValue objects are ordered lexicographically by "value" field
    public int compareTo(ParameterValue o) {
        return this.value.compareTo(o.value);
    }

    @Override
    public String toString() {
        return "value='" + value;
    }
}
