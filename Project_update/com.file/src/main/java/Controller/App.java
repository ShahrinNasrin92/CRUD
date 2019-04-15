package Controller;

import java.io.IOException;

import java.util.ArrayList;

import Model.Student;
import Service.CrudService;

public class App {
	public static void main(String args[]) throws IOException {

		Student st = new Student("1", "Ana", "CSE", 140);
		Student st1 = new Student("9", "Riffu", "CSE", 140);
		Student st2 = new Student("4", "Ria", "EEE", 140);

		CrudService crudService = new CrudService();
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st);
        list.add(st1);
		list.add(st2);
		// System.out.println(al);

		crudService.add1(list);
		crudService.read();
		//crudService.search();

	}

}
