import boardgame.Position;

public class Program {

    public static void main(String[] args){

        Position position = Position.builder()
                .row(3)
                .column(5)
                .build();

        System.out.println(position);
    }
}
