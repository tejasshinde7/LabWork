package Labquetions;
//Write a java program to capitalize each word in string.*/
public class CapitalString {
	  
		public static String capitalizeWord(String str){  
			//for spliting the string
		    String words[]=str.split("\\s");  
		    String capitalizeWord=""; 
		    //for capitalizing the String
		    for(String w:words){ 
		    	//for capitalizing the first character
		        String first=w.substring(0,1);
		        //for capitalizing the character after first
		        String afterfirst=w.substring(1);  
		        //for capitalizing whole string
		        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
		    }  
		    return capitalizeWord.trim();  
		}  
		//main method
		public static void main(String[] args) {  
		    System.out.println(CapitalString.capitalizeWord("my name is tejas"));  
		    System.out.println(CapitalString.capitalizeWord("i am from pune"));  
		    }  
		}  
		
		
