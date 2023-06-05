package boardgame;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString(){
        return row + ", " + column;
    }
}