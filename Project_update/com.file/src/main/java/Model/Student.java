package Model;

import java.io.Serializable;

public class Student implements Serializable 
{

private static final long serialVersionUID = 1L;
private String id;
private String name;
private String dept;
private int creditComplete;


public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public int getCreditComplete() {
	return creditComplete;
}

@Override
public String toString() {
	return "Details [id=" + id + ", name=" + name + ", dept=" + dept + ", creditComplete=" + creditComplete + "]";
}

public void setCreditComplete(int creditComplete) {
	this.creditComplete = creditComplete;
}


public Student(String id, String name, String dept, int creditComplete) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.creditComplete = creditComplete;
}

public Student() {
	super();
	
};
}