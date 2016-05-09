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
        timestamp = System.currentTimeMillis();
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
        System.out.println("Autor del Photopost: " + username);
        System.out.println("Texto del Photopost: " + filename);
        System.out.println("Titulo del Photopost: " + caption);
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
