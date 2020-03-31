public class Generator {
    public static void main(String[] args) {

        Minuet m = new Minuet();
        m.calculateRolls();
        Trio t = new Trio();
        t.calculateRolls();
        for(int i = 1; i <= 32; i++) //play song
        {

            if(i < 17)
            {
                double[] minuet = StdAudio.read("mozart/M"+m.minuetParts[m.getMinuetRolls()[i-1]][i-1]+".wav");
                System.out.print(m.getMinuetRolls()[i-1]);
                System.out.print(" " + m.minuetParts[m.getMinuetRolls()[i-1]][i-1]);
                System.out.println(" "+i);
                StdAudio.play(minuet);
            }
            else
            {
                double[] trio = StdAudio.read("mozart/M"+t.trioParts[t.getTrioRolls()[i-17]][i-17]+".wav");
                System.out.print(t.getTrioRolls()[i-17]);
                System.out.print(" " +t.trioParts[t.getTrioRolls()[i-17]][i-17]);
                System.out.println(" "+i);
                StdAudio.play(trio);
            }
        }

    }

}
