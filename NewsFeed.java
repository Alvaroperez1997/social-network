import java.util.ArrayList;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
        photos = new ArrayList<>();
    }

    /**
     * Añade un mensaje al texto del post
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }
    
    /**
     * Añade una photo al photopost
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }
    
    /**
     * Muestra todos los post
     */
    public void show()
    {
        for(int i = 0; i < messages.size(); i++){
            System.out.println(messages.get(i));
        }
        
        for(int i = 0; i < photos.size(); i++){
            System.out.println(photos.get(i));
        }
    }
}
