package project.com.file;

import static org.junit.Assert.*;

import Service.CrudService;

public class Test {

	CrudService crud = new CrudService();

	@org.junit.Test
	public void test() {
		//assertEquals("Not present", crud.search("C://Users/shahrin.nasrin/Desktop/file1/Record.txt", "Ana"));
		assertEquals("", crud.read());
	}

}
