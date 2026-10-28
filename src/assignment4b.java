import java.util.*;
public class assignment4b{
class Post {     
    int likes = 1000;
// Constructor      
Post() {         
    System.out.println("Post constructor called");     
    }     
    // Method for posting    
    // overridden by child classes     
void posting() {         
    System.out.println("Post is added.");     
    }     
void commenting() {         
        System.out.println("This is a comment section");     
    } 
}  
// Child class of Post 
static class text_post extends Post {       
    // Constructor of Text Post     
    text_post() {          
     // Calls the constructor of the parent class         
    super();          
    System.out.println("Text Post constructor");     
    }      
    // Method overriding     
    // This method provides specific functionality for a text post     
    void posting() {         
     System.out.println("This is a Text post");          
     // Calls the posting() method of the parent class         
     super.posting();     
     }     
     // Additional method specific to Text Post     
     void info() {         
        System.out.println("The post will be in text or String format");     
        } 
        }  // Another child class of Post 
        // Demonstrates inheritance and method overriding 
        class image_post extends Post {      
            // Overriding the posting() method     
     // Provides functionality specific to an image post     
     void posting() {         
         System.out.println("This is a Image post");     
         }      
         // Additional method specific to Image Post     
         void info() {         
             System.out.println("The post will be in Image format or a jpg file");     
                    }   
                    }  
                    // Main class 
     
    public static void main(String[] args) {          
        // Creating Scanner object         
        Scanner sc = new Scanner(System.in);          
        System.out.println("Text Post Class: ");          
        // Creating an object of Text Post         
        text_post tp = new text_post();          
        // Calls the overridden posting() method of Text Post         
        tp.posting();          
        // Calls Text Post's own info() method         
        tp.info();          
        // Calls the inherited commenting() method from Post         
        tp.commenting();          
        System.out.println("\nImage Post Class");          
        // Creating an object of Image Post         
        image_post ip = new image_post();         
        // Calls the overridden posting() method of Image Post         
        ip.posting();         
        // Calls Image Post's own info() method         
        ip.info();          
        // Calls the inherited commenting() method         
        tp.commenting();            
        System.out.println("\nAccess Sub class using Base class:");          
        // Parent class reference         
        Post p;         
        p = new text_post();         
        p.posting();         
        System.out.println(p.likes);        
        p = new image_post();         
        p.posting();     
    } 
}  
                                              
