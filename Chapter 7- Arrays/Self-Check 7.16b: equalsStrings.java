/*Write a method called equals that takes in two string arrays and returns true if they are equal; that is, if both arrays have
the same length and contain equivalent string values at each index.

(If you like, you may look at the equals method developed in section 7.2 of the Building Java Programs textbook as a reference.
The version in that book section compares arrays of integers instead of strings.)*/
public static boolean equals(String[] a, String[] b) {
		if(a.length == b.length) {
			if(Arrays.equals(a, b)) {
				return true;
			}
		}
		return false;
	}
