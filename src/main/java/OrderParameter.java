import java.util.List;

public class OrderParameter {
    private int step;
    private String name;
    private String fullName;
    private String comment;
    private int isEditable;
    private int isScanable;
    private int isVisible;
    private int isRequired;
    private int isPrinted;
    private int isValidateOnLine;
    private String type;
    private int min_length;
    private int max_length;
    private int double_input;
    private  String value;
    private  String regexp;
    private int from_debt;
    private List selectableValuesList;

    public int getStep() {
        return step;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
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

    public String getRegexp() {
        return regexp;
    }

    public int getFrom_debt() {
        return from_debt;
    }

    public List getSelectableValuesList() {
        return selectableValuesList;
    }


}
