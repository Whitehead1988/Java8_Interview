package base_java_struc.base_java.first;

import java.io.IOException;
import java.util.Scanner;

public class first {
	
	private final static String MESSAGE_TEMPLATE_BINARY = "Printed value is: %b";
	private final static String MESSAGE_TEMPLATE_DECIMAL = "Printed value is: %d";
	private final static String MESSAGE_TEMPLATE_HEX = "Printed value is: %X";
	private final static String MESSAGE_TEMPLATE_HEX_FLOAT = "Printed value is: %a";

	public static void main(String[] args) throws IOException {
		int sueprNumber = readDecimal();
		printBinary(sueprNumber);
		printDecimal(sueprNumber);
		printHex(sueprNumber);
		printInverseHexFloat(sueprNumber);	
	}
	
	@SuppressWarnings("resource")
	private static int readDecimal() {
		System.out.println("Enter value: ");
		return new Scanner(System.in).nextInt();
	}
	
	private static void printBinary(int value) {
		System.out.printf(MESSAGE_TEMPLATE_BINARY, value);
	}
	
	private static void printDecimal(int value) {
		System.out.printf(MESSAGE_TEMPLATE_DECIMAL, value);
	}
	
	private static void printHex(int value) {
		System.out.printf(MESSAGE_TEMPLATE_HEX, value);
	}
	
	private static void printInverseHexFloat(int value) {
		System.out.printf(MESSAGE_TEMPLATE_HEX_FLOAT, 1.0/value);
	}
	
	
}
