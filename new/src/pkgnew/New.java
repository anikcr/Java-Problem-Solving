/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

/**
 *
 * @author Anik
 */
public class New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public class New {
	/** Main method */
	public static void main(String[] args) {
		// Create three RegularPolygon objects
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

		// Display perimeter and area of each object
		System.out.println("\n--------------------------------------------------");
		System.out.println("| Regular Polygon Objects |  Perimeter  |  Area  |");
		System.out.println("--------------------------------------------------");
		System.out.printf( "|       Object# 1         |%8.2f     |%6.2f  |\n", 
			regularPolygon1.getPerimeter(), regularPolygon1.getArea());
		System.out.printf( "|       Object# 2         |%8.2f     |%6.2f  |\n", 
			regularPolygon2.getPerimeter(), regularPolygon2.getArea());
		System.out.printf( "|       Object# 3         |%8.2f     |%6.2f  |\n", 
			regularPolygon3.getPerimeter(), regularPolygon3.getArea());
		System.out.println("--------------------------------------------------");
	}
}
    }
    
}
