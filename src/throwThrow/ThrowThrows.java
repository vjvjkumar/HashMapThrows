package throwThrow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowThrows {
	
		 
		public static void main(String args[]) throws Exception {
			
			FileInputStream File1 = null;
			FileInputStream File2 = null;
			
			String fileName = "DriverTest.txt";
	 
			System.out.println("main: Starting " + ThrowThrows.class.getName() + " with file name = " + fileName);
	 
			// get file input stream 1
			try {
				File1 = Test1(fileName);
			} catch (FileNotFoundException ex) {
				System.out.println("main: Oops, FileNotFoundException caught");
			} catch (Exception ex) {
				System.out.println("main: Oops, genreal exception caught");
			}
	 
			// get file input stream 2
			File2 = Test2(fileName);
			System.out.println("main: " + ThrowThrows.class.getName() + " ended");
		}
	 
		public static FileInputStream Test1(String fileName) throws FileNotFoundException {
			
			FileInputStream File = new FileInputStream(fileName);
			System.out.println("Test1: File input stream created");
			return File;
		}
	 
		public static FileInputStream Test2(String fileName) throws Exception {
			FileInputStream File = null;
			try {
				File = new FileInputStream(fileName);
			} catch (FileNotFoundException ex) {
				throw new Exception("Test2: Oops, FileNotFoundException caught");
				//System.out.println("Test2: Oops, FileNotFoundException caught");
			} finally {
				System.out.println("Test2: finally block");
			}
			System.out.println("Test2: Returning from Test2");
			return File;
		}
	 
	}

