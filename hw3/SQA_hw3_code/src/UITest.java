import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.After;

public class UITest {
	UI testingUI = null;
	
	@Before
	public void testUI() throws IOException{
		this.testingUI = new UI();
		FileOutputStream f = new FileOutputStream("file.txt");
		System.setOut(new PrintStream(f));
	}
	@After
	public void stop() throws IOException{
		this.testingUI=null;
		System.setOut(null);
	}

	@Test
	public void test_square() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		testingUI.start();
		assertEquals("The highest priority shape is square. \n\r\n",outContent.toString());
	}
	
	@Test
	public void test_rhombus() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		testingUI.start();
		assertEquals("The highest priority shape is rhombus. \n\r\n",outContent.toString());
	}
	@Test
	public void test_rectangle() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		testingUI.start();
		assertEquals("The highest priority shape is rectangle. \n\r\n",outContent.toString());
	}
	@Test
	public void test_harrier_shape() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		testingUI.start();
		assertEquals("The highest priority shape is harrier-shape. \n\r\n",outContent.toString());
	}
	@Test
	public void test_parallelogram() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		testingUI.start();
		assertEquals("The highest priority shape is parallelogram. \n\r\n",outContent.toString());
	}
	@Test
	public void test_trapezium() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		testingUI.start();
		assertEquals("The highest priority shape is trapezium. \n\r\n",outContent.toString());
	}
	@Test
	public void test_quadrilateral() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		testingUI.start();
		assertEquals("The highest priority shape is quadrilateral. \n\r\n",outContent.toString());
	}
	@Test
	public void test_over_long() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		testingUI.start();
		assertEquals("Input Error!\n\r\n",outContent.toString());
	}
	@Test
	public void test_less_long() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		testingUI.start();
		assertEquals("Input Error!\n\r\n",outContent.toString());
	}
	@Test
	public void test_angle() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		testingUI.start();
		assertEquals("Input Error!\n\r\n",outContent.toString());
	}	
	
}
