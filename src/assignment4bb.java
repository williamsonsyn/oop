public class assignment4bb{
    class post{
        int likes = 1000;
        post(){
            System.out.println("in the post constructor");
        }
        void post(){
            System.out.println("Post created");
        }
        void comment(){
            System.out.println("This is a comment section");
        }
    }
    class text_Post extends post{
        void post(){
            System.out.println("this is a text post");
        }
        void comment(){
            System.out.println("this is a text comment");
        }
    }
    class image_post extends post{
        void post(){
            System.out.println("this is an image post");
        }
        void comment(){
            System.out.println("This is an image post");
        }
    }
    public static void main(String[] args){
        text_post tp = new text_post();         
    }
} 
