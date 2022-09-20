package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import server.Methods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClientRPC {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        String option = "",firstNumber="",SecondNumber="",typeOperation="",response="",result="";
        do{
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4.División");
            System.out.println("5. Exponente");
            System.out.println("6. Raíz");
            System.out.println("7. Consultar historial");
            System.out.println("8. Salir");
            System.out.println("Seleccione una opción...");
            option = sc.next();

            Methods operation = new Methods();
            if (isNumber(option)){
                switch (Integer.parseInt(option)){
                    case 1:
                        System.out.println("SUMA");
                        do{
                            System.out.println("Ingrese  el primer número");
                            firstNumber = sc.next();

                            if (isDouble(firstNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese  el segundo número");
                            SecondNumber = sc.next();

                            if (isDouble(SecondNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(SecondNumber));
                        //Ejecucion del metodo en el servidor...
                        Object[] data = {Double.parseDouble(firstNumber),Double.parseDouble(SecondNumber)};
                        response = (String) client.execute("Methods.suma", data);
                        System.out.println("Resultado: "+response);
                        typeOperation = "Suma";
                        break;
                    case 2:
                        System.out.println("RESTA");
                        do{
                            System.out.println("Ingrese  el primer número");
                            firstNumber = sc.next();

                            if (isDouble(firstNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese  el segundo número");
                            SecondNumber = sc.next();

                            if (isDouble(SecondNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(SecondNumber));
                        //Ejecucion del metodo en el servidor...
                        Object[] data1 = {Double.parseDouble(firstNumber),Double.parseDouble(SecondNumber)};
                        response = (String) client.execute("Methods.resta", data1);
                        System.out.println("Resultado: "+response);
                        typeOperation = "Resta";
                        break;
                    case 3:
                        System.out.println("MULTIPLICACIÓN");
                        do{
                            System.out.println("Ingrese  el primer número");
                            firstNumber = sc.next();

                            if (isDouble(firstNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese  el segundo número");
                            SecondNumber = sc.next();

                            if (isDouble(SecondNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(SecondNumber));
                        //Ejecucion del metodo en el servidor...
                        Object[] data2 = {Double.parseDouble(firstNumber),Double.parseDouble(SecondNumber)};
                        response = (String) client.execute("Methods.multiplicacion", data2);
                        System.out.println("Resultado: "+response);
                        typeOperation = "Multiplicacion";
                        break;
                    case 4:
                        System.out.println("DIVISIÓN");
                        do{
                            System.out.println("Ingrese  el primer número");
                            firstNumber = sc.next();

                            if (isDouble(firstNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese  el segundo número");
                            SecondNumber = sc.next();

                            if (isDouble(SecondNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(SecondNumber));
                        //Ejecucion del metodo en el servidor...
                        Object[] data3 = {Double.parseDouble(firstNumber),Double.parseDouble(SecondNumber)};
                        response = (String) client.execute("Methods.division", data3);
                        System.out.println("Resultado: "+response);
                        typeOperation = "Division";
                        break;
                    case 5:

                        System.out.println("EXPONENTE");
                        do{
                            System.out.println("Ingrese  el primer número");
                            firstNumber = sc.next();

                            if (isDouble(firstNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese  el segundo número");
                            SecondNumber = sc.next();

                            if (isDouble(SecondNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(SecondNumber));
                        //Ejecucion del metodo en el servidor...
                        Object[] data4 = {Double.parseDouble(firstNumber),Double.parseDouble(SecondNumber)};
                        response = (String) client.execute("Methods.exponente", data4);
                        System.out.println("Resultado: "+response);
                        typeOperation = "Exponente";
                        break;
                    case 6:
                        System.out.println("RAIZ");
                        do{
                            System.out.println("Ingrese  el primer número");
                            firstNumber = sc.next();

                            if (isDouble(firstNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese  el segundo número");
                            SecondNumber = sc.next();

                            if (isDouble(SecondNumber))
                                System.out.println("Ingrese un número válido");
                        }while (!isDouble(SecondNumber));
                        //Ejecucion del metodo en el servidor...
                        Object[] data5 = {Double.parseDouble(firstNumber),Double.parseDouble(SecondNumber)};
                        response = (String) client.execute("Methods.raiz", data5);
                        System.out.println("Resultado: "+response);
                        typeOperation = "Raíz";
                        break;
                    case 7:
                        System.out.println("CONSULTAR HISTORIAL");

                        break;
                    default:
                        System.out.println("NO existe esa opcion");
                }
                operation.setTypeOperation(typeOperation);
                operation.setFirstNumber(Double.parseDouble(firstNumber));
                operation.setSecondNumber(Double.parseDouble(SecondNumber));
                operation.setResponse(response);
                result = String.valueOf(operation.saveOperation(operation));
                System.out.println(result);
            }else {
                System.out.println("La opcion es incorrecta. Intente nuevamente...");
            }
        }while (!option.equals("8"));
    }

    public static boolean isNumber(String number){
        try{
            Integer.parseInt(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean isDouble(String number){
        try{
            Double.parseDouble(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
