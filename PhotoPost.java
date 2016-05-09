import java.util.ArrayList;
/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    // instance variables - replace the example below with your own
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author, String filename, String caption)
    {
        username = author;
        this.filename = filename;
        this.caption = caption;
        likes = 0;
        comments = new ArrayList<>();
    }

    /**
     * Añade un like al photopost
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * quita un like al photopost
     */
    public void unlike()
    {
        if(likes > 0){
            likes--;
        }    
    }
    
    /**
     * Añade un comentario al photopost
     */
    public void addComments(String text)
    {
        comments.add(text);
    }
    
    /**
     * Devuelve el nombre de la imagen
     */
    public String getImageFile()
    {
        return caption;
    }
    
    /**
     * Devuelve el caption de la imagen
     */
    public String getCaption()
    {
        return caption;
    }
    
    /**
     * Muestra todas las caracteristicas de las entradas
     * El tiempo que nos muestra es el que ha transcurrido
     * desde que se creo hasta que se esta visualizando
     */
    public void display()
    {
        System.out.println("Autor del Photopost: " + username);
        System.out.println("Texto del Photopost: " + filename);
        System.out.println("Titulo del Photopost: " + caption);
        System.out.println("Likes: " + likes);
    }
    
    /**
     * 
     */
    //private static String timeString(long time)
    //{
    //    return
    //}
}
