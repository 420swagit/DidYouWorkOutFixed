/**
 * Created by fanny on 7/1/2016.
 */
public class Workout {

    int id;
    String name;
    String quantity;

    public Workout()
    {

    }

    public Workout(int id, String name, String quantity)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Workout(String name, String quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
         this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getQuantity()
    {
        return this.quantity;
    }

    public void setQuantity(String quantity)
    {
        this.quantity = quantity;
    }
}
