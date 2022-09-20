package server;

import client.ClientRPC;
import modal.DaoCalculadora;

public class Methods {
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

    public String suma(double firstNumber, double SecondNumber){
        String suma;
        suma = String.valueOf(firstNumber + SecondNumber);
        return suma;
    }

    public String resta(double firstNumber,double SecondNumber){
        String resta;
        resta = String.valueOf(firstNumber - SecondNumber);
        return resta;
    }

    public String multiplicacion(double firstNumber,double SecondNumber){
        String multiplicacion;
        multiplicacion = String.valueOf(firstNumber * SecondNumber);
        return multiplicacion;
    }

    public String division(double firstNumber,double SecondNumber){
        String division;
        division = String.valueOf(firstNumber / SecondNumber);
        return division;
    }

    public String exponente(double firstNumber,double SecondNumber){
        String exponente;
        exponente = String.valueOf(Math.pow(firstNumber,SecondNumber));
        return exponente;
    }

    public String raiz(double firstNumber,double SecondNumber){
        String raiz;
        raiz = String.valueOf(Math.sqrt(firstNumber));
        return raiz;
    }

    public boolean saveOperation(Methods operation){
        DaoCalculadora daoCalculadora = new DaoCalculadora();

        if(daoCalculadora.saveOperation(operation)){
            System.out.println("Se guardaron los datos con exito!");
            return true;
        }else{
            System.out.println("Error al guardar los datos");
            return false;
        }
    }
}
