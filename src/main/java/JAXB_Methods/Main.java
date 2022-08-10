package JAXB_Methods;
import JAXB_Methods.Methods.Marshalling;
import JAXB_Methods.Methods.Unmarshalling;
import JAXB_Methods.entity.Mobile;

import java.io.File;

public class Main {

    // Marshaling Example
    public static void marshalExample(){
        Mobile M = new Mobile("iPhone","Black",4000);

        Marshalling m = new Marshalling();

        File output = new File("src//main//java//JAXB_Methods//Data/Files","toXml.xml");

        m.objToXml(M,output);
    }

    // Unmarshalling Example
    public static void unmarshalExample(){
        File input = new File("src//main//java//JAXB_Methods//Data/Files","toXml.xml");
        Unmarshalling m = new Unmarshalling();
        Mobile mob = m.convertXmlToObj(input);

        if(mob != null){
            System.out.println(mob);
        }

    }

    public static void main(String[] args) {
        unmarshalExample();
    }
}
