class DVDPlayerTestDriver {

    public static void main (String[] args){

        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;


        if (d.canRecord == true){
            d.recordDVD();
        }

        d.playDVD();
    }

}
