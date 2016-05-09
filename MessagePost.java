import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    // instance variables - replace the example below with your own
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        username = author;
        message = text;
        likes = 0;
        comments = new ArrayList<>();
    }

    /**
     * Añade un like al post
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * Quita un like al post
     */
    public void unlike(){
        likes--;
    }
    
    /**
     * Añade un comentario al post
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    /**
     * devuelve el texto
     */
    public String getText(){
        return message;
    }
    
    /**
     * 
     */
    //public long getTimeStamp(){
    //    return
    //}
    
    /**
     * Muestra todas las caracteristicas de las entradas
     * El tiempo que nos muestra es el que ha transcurrido
     * desde que se creo hasta que se esta visualizando
     */
    public void display()
    {
        System.out.println("Autor del post: " + username);
        System.out.println("Texto del post: " + message);
        System.out.println("Likes: " + likes);
    }
}
