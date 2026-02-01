package main;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class TestFile {
  public void create_testfile() {
    try {
      File t_file = new File("Test.md");

      if (t_file.createNewFile())
        IO.println("File created!");
      else
        IO.println("WARNING: The file already exists.");
    } catch (IOException ioe) {
      IO.println("ERROR: The file cannot be created." + ioe.getMessage());
    }
  }

  public void write_testfile() {
    try {
      FileWriter writer = new FileWriter("Test.md");

      writer.write("# Heading 1\n");
      writer.write("## Heading 2\n");
      writer.write("### Heading 3\n");
      writer.write("**Bold**\n");
      writer.write("*Italic*\n");
      writer.write("Some text");
      writer.close();

      IO.println("Successfully writed.");
    } catch (IOException ioe) {
      IO.println("ERROR: The file cannot be writed." + ioe.getMessage());
    }
  }

  public void read_testfile() {
    try {
      BufferedReader read = new BufferedReader(new FileReader("Test.md"));
      String line = read.readLine();

      Bold bold = new Bold();

      while (line != null) {
        bold = contain_bold(line);
        IO.println(line);
        line = read.readLine();
      }

      read.close();
    } catch (IOException ioe) {
      IO.println("ERROR: The file cannot be read." + ioe.getMessage());
    }
  }
}
