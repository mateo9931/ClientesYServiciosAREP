package edu.escuelaing.arep.clientesYServicios.squareNumber;
import java.net.*;
import java.io.*;

public class EchoServer {

    /**
     * Clase Servidor que conecta al cliente
     * @param args
     * @throws IOException
     */
 public static void main(String[] args) throws IOException {
     Double resultado;
         ServerSocket serverSocket = null;
        try {
             serverSocket = new ServerSocket(36000);
        } catch (IOException e) {
             System.err.println("Could not listen on port: 35000.");
            System.exit(1);
             }
         Socket clientSocket = null;
        try {
             clientSocket = serverSocket.accept();
        } catch (IOException e) {
             System.err.println("Accept failed.");
            System.exit(1);
             }
         PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
         String inputLine;
         while ((inputLine = in.readLine()) != null) {
            System.out.println("Mensaje:" + inputLine);
             out.println(calcularpotencia(inputLine));
             if (Double.parseDouble(inputLine)==0.0) {
                 break;
             }
         }
        out.close();
         in.close();
        clientSocket.close();
         serverSocket.close();
    }

    /**
     * Metodo que recibe la linea enviada por el cliente y realiza la logica para obtener la potencia del numero y mandarla nuevamente al cliente
     * @param inputLine ingreso del cliente
     * @return DOuble con el cuadrado del numero ingreo del cliente
     */
    private static Double calcularpotencia(String inputLine) {
     return Math.pow(Double.parseDouble(inputLine),2);
    }

}