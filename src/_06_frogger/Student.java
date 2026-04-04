package _06_frogger;

public class Student {

		      static int nextId = 7;


		      static String School="Carmel Valley ";


		      int id;


		      String name;


		      int currentLevel;


		      Student (String name, int currentLevel){



		          this.name = name; 

		          this.currentLevel = currentLevel; 
		          
		         this.id = nextId;
		         
		         nextId +=1;
		         }
		      
		      



		      public static void main(String[] args){ 
		    	  Student seventh = new Student("bob", 3);
		    	  Student eighth = new Student("jim", 6);
		    	  System.out.println(seventh.name + " " + seventh.School + seventh.id);
		    	  System.out.println(eighth.name + " " + eighth.School + " " + eighth.id);
		      }


}
