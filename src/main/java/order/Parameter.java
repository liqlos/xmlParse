package order;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.SortedSet;

public class Parameter {
    @XmlAttribute
    private int step;

    @XmlAttribute
    private String name;

    @XmlAttribute
    private String fullname;

    @XmlAttribute
    private String comment;

    @XmlAttribute
    private int isEditable;

    @XmlAttribute
    private int isScanable;

    @XmlAttribute
    private int isVisible;

    @XmlAttribute
    private int isRequired;

    @XmlAttribute
    private int isPrinted;

    @XmlAttribute
    private int isValidateOnLine;

    @XmlAttribute
    private String type;

    @XmlAttribute(name = "min_length")
    private int min_length;

    @XmlAttribute(name = "max_length")
    private int max_length;

    @XmlAttribute
    private int double_input;

    @XmlAttribute
    private  String value;

    @XmlAttribute(name = "reg_exp")
    private  String reg_exp;

    @XmlAttribute(name = "from_debt")
    private int from_debt;

    @XmlElement(name = "par_list")
    private SortedSet<ParameterValue> parameterValues;

    public int getStep() {
        return step;
    }

    public String getName() {
        return name;
    }

    public String getFullname() {
        return fullname;
    }

    public String getComment() {
        return comment;
    }

    public int getIsEditable() {
        return isEditable;
    }

    public int getIsScanable() {
        return isScanable;
    }

    public int getIsVisible() {
        return isVisible;
    }

    public int getIsRequired() {
        return isRequired;
    }

    public int getIsPrinted() {
        return isPrinted;
    }

    public int getIsValidateOnLine() {
        return isValidateOnLine;
    }

    public String getType() {
        return type;
    }

    public int getMin_length() {
        return min_length;
    }

    public int getMax_length() {
        return max_length;
    }

    public int getDouble_input() {
        return double_input;
    }

    public String getValue() {
        return value;
    }

    public String getReg_exp() {
        return reg_exp;
    }

    public int getFrom_debt() {
        return from_debt;
    }

    public SortedSet<ParameterValue> getParameterValues() {
        return parameterValues;
    }

    @Override
    public String toString() {
        return "step=" + step +
                ", name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", comment='" + comment + '\'' +
                ", isEditable=" + isEditable +
                ", isScanable=" + isScanable +
                ", isVisible=" + isVisible +
                ", isRequired=" + isRequired +
                ", isPrinted=" + isPrinted +
                ", isValidateOnLine=" + isValidateOnLine +
                ", type='" + type + '\'' +
                ", min_length=" + min_length +
                ", max_length=" + max_length +
                ", double_input=" + double_input +
                ", value='" + value + '\'' +
                ", reg_exp='" + reg_exp + '\'' +
                ", from_debt=" + from_debt;
    }
}
