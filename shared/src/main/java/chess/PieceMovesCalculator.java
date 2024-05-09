package chess;

import java.util.ArrayList;
import java.util.Collection;

public abstract class PieceMovesCalculator {
    protected ChessBoard board;
    protected ChessPosition myPosition;
    protected ChessPiece myPiece;
    protected ChessGame.TeamColor myColor;
    protected ChessGame.TeamColor opponentColor;
    Collection<ChessMove> movesCollection;

    public PieceMovesCalculator(ChessBoard board, ChessPosition myPosition) {
        this.board = board;
        this.myPosition = myPosition;
        this.myPiece = board.getPiece(myPosition);
        this.myColor = myPiece.getTeamColor();
        this.opponentColor = switch (myColor) {
            case BLACK -> ChessGame.TeamColor.WHITE;
            case WHITE -> ChessGame.TeamColor.BLACK;
        };
        this.movesCollection = new ArrayList<>();
    }



    public Collection<ChessMove> diagonalMoves(Collection<ChessMove> moves) {
        return new ArrayList<>();
    }

    public Collection<ChessMove> pieceMoves() {
        return new ArrayList<>();
    }
}
