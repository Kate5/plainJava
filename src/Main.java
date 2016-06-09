import com.backendless.Backendless;

import java.util.ArrayList;

/**
 * Created by kate on 6/9/16.
 */
public class Main {

    public static void main(String[] args) {
        Backendless.setUrl("http://apitest.backendless.com");
        Backendless.initApp("55809C09-EFE2-1ADA-FF1A-428E411A9300", "1F84D01C-1243-8C3E-FF4E-BABDCA94A200", "v1");
        try {

            Foo foo = new Foo();

            Bar bar1 = new Bar();
            Bar bar2 = new Bar();

            ArrayList<Bar> bars = new ArrayList<Bar>();

            bars.add(bar1);
            bars.add(bar2);
            foo.setBars(bars);

            Backendless.Data.of(Foo.class).save(foo);

        } catch (Throwable e) {
            System.out.println(e);
        }
    }
}
