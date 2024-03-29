package boardgame;

import lombok.Getter;

@Getter
public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Position not on board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position){
        if (!positionExists(position)) {
            throw new BoardException("Position not on board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if(therIsAPice(position)) {
           throw new BoardException("There is already a piece on position " + position);
        }
        pieces[position.getRow()][position.getColumn()]= piece;
        piece.position = position;
    }

    public boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }
    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean therIsAPice(Position position) {
        if(!positionExists(position)) {
            throw new BoardException("There is already a piece on position " + position);
        }
        return piece(position) != null;
    }
}
