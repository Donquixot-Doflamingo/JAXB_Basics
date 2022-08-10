# JAXB Basics

In this repository, I learnt about basics of JAXB, Marshalling and Unmarshalling.

Java Architecture for XML Binding (JAXB) is a software framework that allows Java developers to map Java classes to XML representations.
JAXB enables to marshal Java objects into XML and unmarshal XML back into Java objects.

* ## Marshalling
  Marshalling is the process of transforming Java objects into XML documents.
* ## Unmarshalling
  Unmarshalling is the process of reading XML documents into Java objects.

## Function Performed
- Made a entity class.
- Converted its object to the xml document.
- Converted back the same document to object of that type.

## Annotations Used
- XmlRootElement - <br>
   When a top level class or an enum type is annotated with the @XmlRootElement annotation, then its value is represented as XML element in an XML document.
  <br><br>
- Override - <br>
  The @Override annotation indicates that the child class method is over-writing its base class method. It extracts a warning from the compiler if the annotated method doesn't actually override anything.
  <br><br>
- XmlElement - <br>
  The XMLElement function is typically nested to produce an XML document with a nested structure, as in the example in the following section.
    

