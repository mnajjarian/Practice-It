/*Given the following code, what indexes must be passed to the substring method to produce the new String with the value
"SCORE"? What indexes to substring produce "fouryears"?


// index        012345678901234567890123456789
String quote = "Four score and seven years ago";
String expr1 = quote.substring(a, b).toUpperCase();  // "SCORE"
String expr2 = quote.toLowerCase().substring(c, d) + quote.substring(e, f);  // "fouryears"
*/

 a	  5
 b	  10
 c	  0
 d	  4
 e	  21
 f	  26
