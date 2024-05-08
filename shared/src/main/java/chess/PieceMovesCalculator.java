package chess;

public abstract class PieceMovesCalculator {
    private ChessBoard board;
    private ChessPosition myPosition;

    public PieceMovesCalculator(ChessBoard board, ChessPosition myPosition) {
        this.board = board;
        this.myPosition = myPosition;
    }


}
