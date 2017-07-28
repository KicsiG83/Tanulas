public class HobbitsTestDriver {

    public static void main(String[] args){

        Hobbits [] h = new Hobbits[3];
        int z = - 1;
        //A tankönyvben az int x = 0

/*
A tömbök[] a 0-tól indulnak!!!
 */


        while ( z < 2 ){
            //A tankönyvben a (z < 4), de nincs ennyi eleme a tömbnek, ezt csökkenteni kellett 2-re --> 0, 1, 2 ebből megvan a tömb 3 eleme
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Bilbo";
            if( z == 1 ){
                h[z].name = "Frodo";
            }
            if(z == 2){
                h[z].name = "Sam";
            }
            //System.out.println(z);  //Kiírja a z értékét Bilbo-nál 0, Frodo-nál 1, Sam-nél 2
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }

    }

}
