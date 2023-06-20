package throw_and_throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throws_Example {
	public void fileopen() throws FileNotFoundException {
		FileInputStream sc=new FileInputStream("D:\\practice.txt");
	}

	public void filesave() throws FileNotFoundException {
		FileOutputStream ss=new FileOutputStream("D:\\Java\\Array\\Satishb.");
	}

}
