package main;

import java.io.File;

public class Main 
{
	void main()
	{	
		TestFile tf = new TestFile();

		tf.create_testfile();
		tf.write_testfile();
		tf.read_testfile();
	}
}
