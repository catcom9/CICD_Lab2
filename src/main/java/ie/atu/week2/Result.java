package ie.atu.week2;

public class Result {
    private String operation;
    private int total;

    public Result(String operation, int total){
        this.operation = operation;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public String getOperation() {
        return operation;
    }
}
