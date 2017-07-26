/**
 * Created by Gergo on 2017. 07. 23..
 */
public class Player {

    int number = 0;

    public void guess(){

        number = (int) (Math.random() * 10 );
        System.out.println("I'm guessing " + number);

    }

}
