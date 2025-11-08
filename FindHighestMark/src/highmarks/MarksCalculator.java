package highmarks;

public class MarksCalculator {

	public static void main(String[] args) {

		int[] courseMarks = {85, 92, 78, 95, 88, 70};
        int highest = findHighestMark(courseMarks);
        System.out.println("The highest mark in the course is: " + highest); // Output: 95
		
		
		
		

	}
	
	  public static int findHighestMark(int[] marks) {
	        if (marks == null || marks.length == 0) {
	            return -1; // Or throw an IllegalArgumentException
	        }

	        int highestMark = marks[0]; // Assume the first mark is the highest initially

	        for (int i = 1; i < marks.length; i++) {
	            if (marks[i] > highestMark) {
	                highestMark = marks[i]; // Update if a higher mark is found
	            }
	        }
	        return highestMark;
	    }

}
