/*
 * 	Programming Challenge Description:
 *	You are given two strings. Determine if the first string is a substring of the second. The second string may contain 
 *	an asterisk (*) which should be treated as a wild card that matches zero or more characters. The asterisk can be escaped 
 *	by a \ char in which case it should be interpreted as a literal * character. The strings can contain English letters and numbers, *, and \.
 *	Input:
 *	Your program should read lines of text from standard input. Each line will contain two strings separated by a comma.
 *	Output:
 *	For each line of input, if the second string is a substring of the first, print "true" (lowercase). Otherwise print "false" (lowercase), one per line.
 */

package app;

import java.util.Scanner;

public class StringCompare {
	static boolean skip = false;
	
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the String that needs to be searched !! ");
    	String string2 = input.next();
    	System.out.println("Enter the String to be searched from !! ");
    	String string1 = input.next();
    	input.close();
    	if(compare(string1,string2)) {
    		System.out.println(string2+" is a subset of "+string1);
    	} else {
    		System.out.println(string2+" is NOT a subset of "+string1);
    	}
    }
    
    public static boolean compare(String s1, String s2) {
    	
    	boolean flag = false;
    	
    	while(!flag && s1.length() > 0 && s2.length() > 0) {
    		if(s1.charAt(0) == '\\' && s1.charAt(1) == '*') {
    			skip = true;
    		}
    		if(s1.charAt(0) == '*' && !skip) {
    			flag = true;
    			break;
    		}
    		if(s1.charAt(0) == s2.charAt(0)) {
    			if(s2.length() == 1) {
    				flag = true;
    				break;
    			} else {
	    			s1 = s1.substring(1);
	    			s2 = s2.substring(1);
	    			flag = compare(s1,s2);
    			}
    		} else {
    			s1 = s1.substring(1);
    			flag = compare(s1,s2);
    		}
    	}
    	return flag;
    }
}