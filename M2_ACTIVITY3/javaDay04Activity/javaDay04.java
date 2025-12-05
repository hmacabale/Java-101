package javaDay04Activity;
import java.util.Scanner;



public class javaDay04 {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		System.out.println("===== STUDENT GRADING SYSTEM =====\n");
		System.out.println("A - Add Student Information");
		System.out.println("B - Compute Student Average");
		System.out.println("C - Display Student Information");
		System.out.println("D - Exit");
		*/
		
		WhiteBoard wb = new WhiteBoard();
	
		int sum = wb.addNumbers(1, 2);
		System.out.println("The total is:" + String.valueOf(sum));
		
	}
}

class WhiteBoard {

	private String lname;
	private String fname;
	
	public void setFname(String fname) {
        // 'this.currentNumber' refers to the private instance field.
        this.fname = fname; 
    }
	
	public void getFname(String fname) {
        // 'this.currentNumber' refers to the private instance field.
        this.fname = fname; 
    }
	
	int addNumbers(int addend1, int addend2) {
		int sum = addend1 + addend2;
		return sum;
	}
	
}