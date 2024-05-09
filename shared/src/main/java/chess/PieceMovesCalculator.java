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
    protected int currRow;
    protected int currCol;

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
        this.currRow = myPosition.getRow();
        this.currCol = myPosition.getColumn();
    }



    public Collection<ChessMove> diagonalMoves() {
        int row = currRow;
        int col = currCol;
        while (row > 1 && col > 1) {
            row--;
            col--;
            ChessPiece currPiece = board.getPiece(new ChessPosition(row, col));
            ChessPosition currPosition = new ChessPosition(row, col);
            if (currPiece == null) {
                movesCollection.add(new ChessMove(myPosition, currPosition, null));
                continue;
            }
            if (currPiece.getTeamColor() == opponentColor) {
                movesCollection.add(new ChessMove(myPosition, currPosition, null));
                break;
            }
            if (currPiece.getTeamColor() == myColor) {
                break;
            }
        }
        row = currRow;
        col = currCol;
        while (row > 1 && col < 8) {
            row--;
            col++;
            ChessPiece currPiece = board.getPiece(new ChessPosition(row, col));
            ChessPosition currPosition = new ChessPosition(row, col);
            if (currPiece == null) {
                movesCollection.add(new ChessMove(myPosition, currPosition, null));
                continue;
            }
            if (currPiece.getTeamColor() == opponentColor) {
                movesCollection.add(new ChessMove(myPosition, currPosition, null));
                break;
            }
            if (currPiece.getTeamColor() == myColor) {
                break;
            }
        }
        row = currRow;
        col = currCol;
        while (row < 8 && col > 1) {
            row++;
            col--;
            ChessPiece currPiece = board.getPiece(new ChessPosition(row, col));
            ChessPosition currPosition = new ChessPosition(row, col);
            if (currPiece == null) {
                movesCollection.add(new ChessMove(myPosition, currPosition, null));
                continue;
            }
            if (currPiece.getTeamColor() == opponentColor) {
                movesCollection.add(new ChessMove(myPosition, currPosition, null));
                break;
            }
            if (currPiece.getTeamColor() == myColor) {
                break;
            }
        }
        row = currRow;
        col = currCol;
        while (row < 8 && col < 8) {
            row++;
            col++;
            ChessPiece currPiece = board.getPiece(new ChessPosition(row, col));
            ChessPosition currPosition = new ChessPosition(row, col);
            if (currPiece == null) {
                movesCollection.add(new ChessMove(myPosition, currPosition, null));
                continue;
            }
            if (currPiece.getTeamColor() == opponentColor) {
                movesCollection.add(new ChessMove(myPosition, currPosition, null));
                break;
            }
            if (currPiece.getTeamColor() == myColor) {
                break;
            }
        }
        return movesCollection;
    }

    public Collection<ChessMove> pieceMoves() {
        return new ArrayList<>();
    }
}
