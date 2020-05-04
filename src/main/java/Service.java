import java.util.List;

public class Service {
    private boolean isClosed;
    private String servId;
    private int bic;
    private int schet;
    private int corrSchet;
    private String sysMessage;
    private List<OrderParameter> orderParameters;

    public List<OrderParameter> getOrderParameters() {
        return orderParameters;
    }


}
