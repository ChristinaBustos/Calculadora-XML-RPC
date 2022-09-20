package server;

import client.ClientRPC;
import modal.BeanCalculadora;
import modal.DaoCalculadora;

public class Methods {
    DaoCalculadora daoCalculadora = new DaoCalculadora();

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

    public void saveOperation(String typeOperation,double firstNumber,double SecondNumber,String response){
        daoCalculadora.saveOperation(typeOperation,firstNumber,SecondNumber, response);
    }

}
