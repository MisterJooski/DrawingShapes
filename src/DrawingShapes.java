/*
 * 
 *
 * Purpose: The purpose of this program is produce any of the 5 shapes selected by user and based on the
 * size of the length and possibly the height inputed by the user. Once the inputs are in, the program will 
 * produce the a "*" based shape that aligns with the inputed length and height size.
 *
 * 
 */

import java.util.Scanner;

public class DrawingShapes {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); // set scanner instance keyboard
		
		String input; // set string and int for numbers.
		int l = 0;
		int h = 0;
		
		System.out.println("Enter a shape: r t h o p"); // enter user input for shape
		input = keyboard.nextLine();
		
		if (input.equals("r") || input.equals("t") || input.equals("h")
										|| input.equals("o") || input.equals("p")) {
										// if condition to determine whether user input is a valid shape choice
			System.out.println("Enter a length"); // enter user input for length
			l = keyboard.nextInt();
			
			if (l>1) {
				// Rectangle
				if (input.equals("r")) { // if condition when user chooses rectangle shape
					
					System.out.println("Enter a height"); // enter user input for height
					h = keyboard.nextInt();
					
					if (h>1) {
						
						System.out.println("Below is a " + l + " by " + h + " rectangle of *");
						
						for (int i=0; i<h; i++) { // outer loop based on height
							for (int j = 0; j < l; j++) { // inner loop based on length
								System.out.print("*");
							}
							System.out.print("\n"); // next line
						}
					}
					else { // if h is not greater than 1
						System.out.println("Height must be greater than 1");
						System.out.println("Goodbye!");
					}
				}
				// Triangle
				else if (input.equals("t")) { // if condition when user chooses triangle shape
					
					System.out.println("Below is a triangle with two side lengths of " + l + " *");
					
					for (int i=1; i<=l; i++) { // outer loop based on length; starts at index 1; less than or equal to
						for (int j=i; j<l; j++) { // inner loop based on length; less than, starts at index of i
							System.out.print(" ");
						}
						for(int k=1; k<(2*i); k++) { // inner loop based on 2*i b/c increasing by 2; starts at index 1
							System.out.print("*");
						}
						System.out.print("\n"); // next line
					}
				
				}// end of loop
				
				// Hexagon
				else if (input.equals("h")) { // if condition when user chooses hexagon.
					
					System.out.println("Below is a hexagon with side lengths of " + l + " *");
					
					for (int i=0; i<l; i++) { // outer loop based on length; starts at index 0
						for (int j=l-i; j>0; j--) { // inner loop (reverse); starts at length minus i
							System.out.print(" ");
						}
						for (int k=0; k<(2*i)+l; k++) { // inner loop based on (2*i) b/c increasing by 2; starts at index 0
							System.out.print("*");
						}
						System.out.print("\n"); // next line
					}
					
					for (int i=l-2; i>-1; i--) { // outer loop (reverse); starts at index (l-2)
						for (int j=l-i; j>0; j--) { // inner loop (reverse); starts at index (l-i)
							System.out.print(" ");
						}
						for (int k=0; k<(2*i)+l; k++) { // inner loop based on (2*i)+l b/c increases by 2 but also adds initial length
							System.out.print("*");
						}
						System.out.print("\n"); // next line
					}
					
				}
				
				// Octagon
				else if (input.equals("o")) { // if condition when users choose octagon
					
					System.out.println("Below is a octagon with side lengths of " + l + " *");
					// top half (cut-off triangle)
					for (int i=0; i<l; i++) { // outer loop based on length
						for (int j=l-i; j>0; j--) { // inner loop (reverse); index starts at (l-i)
							System.out.print(" ");
						}
						for (int k=0; k<(2*i)+l; k++) { // inner loop based on (2*i)+l b/c increases by 2 also adds initial length
							System.out.print("*");
						}
						System.out.print("\n"); // next line
					}
					// middle (rectangle)
					for (int i=2; i<l; i++) { // outer loop based on length
						System.out.print(" ");
						for (int j=2; j<(3*l); j++) { // inner loop based on (3*l) as it inc / dec by 3;
							System.out.print("*");
						}
						System.out.print("\n"); // next line
					}
					
					// bottom half (reverse cut-off triangle)
					for (int i=l-1;i>-1; i--) { // outer loop; starts at index (l-1); greater than -1
						for (int j=l-i; j>0; j--) { // inner loop; starts at index (l-i)
							System.out.print(" ");
						}
						for (int k=0; k<(2*i)+l; k++) { // inner loop based on (2*i)+l as it increases by 2 plus initial length
							System.out.print("*");
						}
						System.out.print("\n"); // next line
					}
				}
				// Pentagon
				else if (input.equals("p")) {
					
					System.out.print("Below is a pentagon with 4 side lengths of " + l + " *");
	
					// top part: triangle
					for (int i=0; i<l; i++) { // outer loop based on length
						for (int j=l-i; j>0; j--) { // inner loop (reverse); starts at index (l-i)
							System.out.print(" ");
						}
						for (int k=0; k<(2*i)-1;k++) { // inner loop based on (2*i)-1 as it increases by 2 minus 1
							System.out.print("*");
						}
						System.out.print("\n"); // next line
					}
					
					// bottom part: square
					for (int i=0; i<l; i++) { // outer loop based on length
						for (int j=0; j<(2*l)-1; j++) { // inner loop based on (2*l)-1 as it increases by 2 minus 1
							System.out.print("*");
						}
						System.out.print("\n"); // next line
					}
				}
			}
			else {
				System.out.println("Length must be greater than 1"); // length must be greater than 1
				System.out.println("Goodbye!");
			}
		}
		else {
			System.out.println("Invalid shape"); // length must be greater than 1
			System.out.println("Goodbye!");
		}
	}
}
