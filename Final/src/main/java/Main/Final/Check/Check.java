package Main.Final.Check;

public class Check {
    private String Status;
    private String Message;
    private Object Data;

    public Check() {}

    public Check(String Status, String Message, Object Data) {
        this.Status = Status;
        this.Message = Message;
        this.Data = Data;
    }

    public String getStatus() {
        return Status;
    }
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getMessage() {
        return Message;
    }
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public Object getData() {
        return Data;
    }
    public void setData(Object Data) {
        this.Data = Data;
    }
}
