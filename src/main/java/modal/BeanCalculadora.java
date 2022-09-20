package modal;

public class BeanCalculadora {
    double firstNumber;
    double SecondNumber;
    String typeOperation;
    String response;


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return SecondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        SecondNumber = secondNumber;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
