package main;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFile
{
	public void create_testfile() 
	{
		try {
			File t_file = new File("Test.md");

			if (t_file.createNewFile())
				IO.println("File created!");
			else
				IO.println("ERROR: The file already exists.");
		} catch (IOException ioe) {
			IO.println("ERROR: The file cannot be created." + ioe.getMessage());
		}
	}

	public void write_testfile() {
		try {
			FileWriter writer = new FileWriter("Test.md");

			writer.write("# Heading Test");
			writer.close();

			IO.println("Successfully writed.");
		} catch (IOException ioe) {
			IO.println("ERROR: The file cannot be writed." + ioe.getMessage());
		}
	}

	public void read_testfile() {
		try {
			File t_file = new File("Test.md");
			Scanner read = new Scanner(t_file);

			while (read.hasNextLine()) {
				String data = read.nextLine();
				IO.println(data);
			}
			read.close();
		} catch (FileNotFoundException fnfe) {
			IO.println("ERROR: The file cannot be read." + fnfe.getMessage());
		}
	}
}
