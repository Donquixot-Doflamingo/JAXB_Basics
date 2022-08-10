package JAXB_Methods.Methods;

import JAXB_Methods.entity.Mobile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class Marshalling {
    public void objToXml(Mobile mob, File output){
        try{
            JAXBContext context = JAXBContext.newInstance(mob.getClass());
//        JAXBContext context = JAXBContext.newInstance(Mobile.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(mob,System.out);
            m.marshal(mob, output);

        }catch (JAXBException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
