package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  
  
@XmlRootElement
public class Employee {
    private int id;  
    private String name;  
    private float salary;  
  
public Employee() {}  
public Employee(int id, String name, float salary) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.salary = salary;  
}  
@XmlAttribute  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
@XmlElement(name = "name", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01")
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
@XmlElement(name = "salary", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.001.001.01")
public float getSalary() {  
    return salary;  
}  
public void setSalary(float salary) {  
    this.salary = salary;  
}  
  
  
}  