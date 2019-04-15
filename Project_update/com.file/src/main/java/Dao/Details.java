package Dao;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import Model.Student;

public interface Details {

	public String add1(ArrayList<Student> myList);

	public String read();

	public String search() throws FileNotFoundException ;

	public String update();

}