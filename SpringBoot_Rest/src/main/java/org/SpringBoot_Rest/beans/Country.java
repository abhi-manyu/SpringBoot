package org.SpringBoot_Rest.beans;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/*@JsonPropertyOrder({"capital","name","id"})
@JsonIgnoreProperties({"id"})*/
//@XmlRootElement
//@JacksonXmlRootElement(localName="country")
public class Country
{
   private int id;
   private String name;
   private String capital;
   public Country() {
	// TODO Auto-generated constructor stub
   }
public Country(int id, String name, String capital) {
	super();
	this.id = id;
	this.name = name;
	this.capital = capital;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}
   
}
