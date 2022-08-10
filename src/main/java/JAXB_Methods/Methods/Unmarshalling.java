package JAXB_Methods.Methods;

import JAXB_Methods.entity.Mobile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Unmarshalling {
    public Mobile convertXmlToObj(File input){
        Mobile mob = null;
        try {
            JAXBContext context = JAXBContext.newInstance(Mobile.class);
            Unmarshaller u = context.createUnmarshaller();
            mob =  (Mobile) u.unmarshal(input);

        } catch (JAXBException e) {
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return mob;
    }
}
