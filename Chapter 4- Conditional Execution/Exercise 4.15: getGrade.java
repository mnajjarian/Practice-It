/*Write a method called getGrade that accepts an integer representing a student's grade in a course and returns that student's 
numerical course grade. The grade can be between 0.0 (failing) and 4.0 (perfect). Assume that scores are in the range of 0 to 100
and that grades are based on the following scale:

Score	 Grade
<60	    0.0
60-62 	0.7
63	    0.8
64  	  0.9
65	    1.0
...	
92	    3.7
93	    3.8
94	    3.9
>=95	  4.0

For an added challenge, make your method throw an IllegalArgumentException if the user passes a grade lower than 0 or higher than 100.*/

	public static double getGrade(int point) {
		if(point < 0 || point > 100) {
			throw new IllegalArgumentException();
			
		} else if(point < 60) {
			return 0.0;
		} else if(point >= 60 && point < 62) {
			return 0.7;
		} else if(point >= 63 && point < 95) {
			double p = .0;
				p+= .8 + (point - 63) * .1;
			return p;
		} else if(point >= 95 && point <= 100) {
			return 4.0;
		} else {
			return 0;
		}
	}
