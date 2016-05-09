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
        timestamp = System.currentTimeMillis();
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
        if(likes > 0) {
            likes--;
        }
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
     * Cuanto tiempo lleva desde que se ha creado hasta ahora
     */
    public long getTimeStamp(){
        return (System.currentTimeMillis() - timestamp)/1000;
    }
    
    /**
     * Muestra todas las caracteristicas de las entradas
     * El tiempo que nos muestra es el que ha transcurrido
     * desde que se creo hasta que se esta visualizando
     */
    public void display()
    {
        System.out.println("Autor del post: " + username);
        System.out.println("Texto del post: " + message);
        System.out.println("Duracion del post: " + getTimeStamp()/60 + "' " + getTimeStamp()%60 + "''");
        System.out.println("Likes: " + likes);
        if (comments.size() == 0) {
            System.out.println("Este post no tiene comentarios");
        }
        else {
            System.out.println("Comentarios: ");
            for (int i = 0; i < comments.size(); i++) {
                System.out.println(comments.get(i));
            }
        }
    }
    
    /**
     * Devuelve una cadena desde que se ha creado hasta ahora
     */
    private String timeString(long time)
    {
        long minutos = (getTimeStamp() /60);
        long segundos = (getTimeStamp() %60);
        String timeString = "segundos: " + segundos + " minutos: " + minutos;
        return timeString;
    }
}
