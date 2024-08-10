package com.uniq.MyFirstRestService.MyFirstRestService.bean;

//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "userXML")
public class UserXML {
    private int id;
    private String name;
    private String birthDate;

  //@XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  //@XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   // @XmlElement
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

	@Override
	public String toString() {
		return "UserXML [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
    
    
}

