package edu.escuelaing.arep.clientesYServicios.URLgetinfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class urlreadinfo {
    public static void main(String[] args) throws Exception {
        URL site = new URL("https://www.metrocuadrado.com/");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(site.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}