
package Pertemuan2tugasPBO;

public class BingoSong {
    private final int numClaps;

    public BingoSong(int numClaps) {
        this.numClaps = numClaps;
    }

    public void sing() {
        System.out.println("There was a farmer who had a dog,\nAnd Bingo was his name-o.");

        StringBuilder line = new StringBuilder("B-I-N-G-O\n");
        for (int i = 0; i < numClaps; i++) {
            line.insert(0, "(clap)-");
        }
        line.append("And Bingo was his name-o.");

        for (int i = 0; i < 3; i++) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            BingoSong song = new BingoSong(i);
            song.sing();
            System.out.println();
        }
    }
}
