public class BooksTestDriver {

    public static void main(String[] args){
        Books[] myBooks = new Books[12];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[3] = new Books();
        myBooks[4] = new Books();
        myBooks[5] = new Books();
        myBooks[6] = new Books();
        myBooks[7] = new Books();
        myBooks[8] = new Books();
        myBooks[9] = new Books();
        myBooks[10] = new Books();
        myBooks[11] = new Books();
        myBooks[0].title = "Cirque Du Freak";
        myBooks[1].title = "The Vampire’s Assistant";
        myBooks[2].title = "Tunnels of Blood";
        myBooks[3].title = "Vampire Mountain";
        myBooks[4].title = "Trials of Death";
        myBooks[5].title = "The Vampire Prince";
        myBooks[6].title = "Hunters of the Dusk";
        myBooks[7].title = "Allies of the Night";
        myBooks[8].title = "Killers of the Dawn";
        myBooks[9].title = "The Lake of Souls";
        myBooks[10].title = "Lord of the Shadows";
        myBooks[11].title = "Sons of Destiny";
        myBooks[0].author = "Darren Shan";
        myBooks[1].author = "Darren Shan";
        myBooks[2].author = "Darren Shan";
        myBooks[3].author = "Darren Shan";
        myBooks[4].author = "Darren Shan";
        myBooks[5].author = "Darren Shan";
        myBooks[6].author = "Darren Shan";
        myBooks[7].author = "Darren Shan";
        myBooks[8].author = "Darren Shan";
        myBooks[9].author = "Darren Shan";
        myBooks[10].author = "Darren Shan";
        myBooks[11].author = "Darren Shan";

        while ( x < 12 ){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }

}

/*

A tankönyvben nem volt megadva a
myBooks[0] = new Books();
.
.
.
.

 */