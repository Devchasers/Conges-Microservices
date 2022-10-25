package esprit.fgsc.congesmicroservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Conges {

@Id
private String id;
private String employeId;
private String firstName;
private String lastName;
private String start_date;
private String end_date;
private String type;
public String getEmployeId() {
	return employeId;
}
public void setEmployeId(String employeId) {
	this.employeId = employeId;
}
public String getStart_date() {
	return start_date;
}
public void setStart_date(String start_date) {
	this.start_date = start_date;
}
public String getEnd_date() {
	return end_date;
}
public void setEnd_date(String end_date) {
	this.end_date = end_date;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
