/*Assuming that the following variables have been declared,


String str1 = "Q.E.D.";
String str2 = "Arcturan Megadonkey";
String str3 = "Sirius Cybernetics Corporation";
Evaluate the following expressions. Make sure to give a value of the appropriate type (such as including quotes around a String).*/

 str1.length()	        6
 str2.length()	        19
 str1.toLowerCase()	    "q.e.d."
 str2.toUpperCase()	    "ARCTURAN MEGADONKEY"
 str1.substring(2, 4)	  "E."
 str2.substring(10, 14)	"egad"
 str1.indexOf("D")	    4
 str1.indexOf(".")	    1
 str2.indexOf("donkey")	13
 str3.indexOf("X")	    -1
 str2 + str3.charAt(17)	 "Arcturan Megadonkeys"
 str3.substring(9, str3.indexOf("e"))	  "b"
 str3.substring(7, 12)	  "Cyber"
 str2.toLowerCase().substring(9, 13) + str3.substring(18, str3.length() - 7)	  "mega Corp"
