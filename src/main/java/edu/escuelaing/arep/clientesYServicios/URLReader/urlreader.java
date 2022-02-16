package edu.escuelaing.arep.clientesYServicios.URLReader;

import java.net.MalformedURLException;
import java.net.URL;

public class urlreader {

    /**
     * Esta clase sirve para conocer los 8 metodos base para conocer de que manera esta formada una URL
     * @param args
     * @throws MalformedURLException
     */
    public static void main(String ... args) throws MalformedURLException{
        URL sitioweb = new URL("https://www.metrocuadrado.com:8080/cas/login?service=https%3A%2F%2Fwww.metrocuadrado.com%2Fmetrocuadrado-personal-account%2Flogin%2Fcas#Login");
        System.out.println(" El protocolo es :  "+ sitioweb.getProtocol());
        System.out.println(" El Host es :  "+ sitioweb.getHost());
        System.out.println(" El puerto es :  "+ sitioweb.getPort());
        System.out.println(" El Path es :  "+ sitioweb.getPath());
        System.out.println(" El File es :  "+ sitioweb.getFile());
        System.out.println(" El Ref es :  "+ sitioweb.getRef());
        System.out.println(" El Query es :  "+ sitioweb.getQuery());
        System.out.println(" El Authority es :  "+ sitioweb.getAuthority());
    }
}
