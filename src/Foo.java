/**
 * Created by kate on 6/9/16.
 */
import java.util.ArrayList;

public class Foo
{
    private ArrayList<Bar> Bars = new ArrayList<Bar>();

    public ArrayList<Bar> getBars()
    {
        return Bars;
    }

    public void setBars( ArrayList<Bar> bars )
    {
        Bars = bars;
    }
}