import boardgame.Board;
import boardgame.Position;

public class Program {

    public static void main(String[] args){

        Board board = Board.builder()
                .rows(8)
                .columns(8)
                .build();




        System.out.println(board);
    }
}
