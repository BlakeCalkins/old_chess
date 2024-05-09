package chess;

import java.util.ArrayList;
import java.util.Collection;

public class KnightMovesCalculator extends PieceMovesCalculator {
    public KnightMovesCalculator(ChessBoard board, ChessPosition myPosition) {
        super(board, myPosition);
    }

    @Override
    public Collection<ChessMove> pieceMoves() {
        ChessPiece myPiece = board.getPiece(myPosition);
        ChessGame.TeamColor myColor = myPiece.getTeamColor();
        ChessGame.TeamColor opponentColor = switch (myColor) {
            case BLACK -> ChessGame.TeamColor.WHITE;
            case WHITE -> ChessGame.TeamColor.BLACK;
        };
        Collection<ChessMove> movesCollection = new ArrayList<>();

        int knightRow = myPosition.getRow();
        int knightCol = myPosition.getColumn();
        for (int row = knightRow - 2; row <= knightRow + 2; row++) {
            if (row < 1 || row > 8) {
                continue;
            }
            for (int col = knightCol - 2; col <= knightCol + 2; col++) {
                if (col < 1 || col > 8) {
                    continue;
                }
                if (row == knightRow && col == knightCol) {
                    continue;
                }
                ChessPiece currPiece = board.getPiece(new ChessPosition(row, col));
                ChessPosition currPosition = new ChessPosition(row, col);
                if ((row == knightRow - 2 && (col == knightCol - 1 || col == knightCol + 1)) ||
                        (row == knightRow - 1 && (col == knightCol - 2 || col == knightCol + 2)) ||
                        (row == knightRow + 1 && (col == knightCol - 2 || col == knightCol + 2)) ||
                        (row == knightRow + 2 && (col == knightCol - 1 || col == knightCol + 1))) {
                    if (currPiece == null || (currPiece.getTeamColor() == opponentColor)) {
                        movesCollection.add(new ChessMove(myPosition, currPosition, null));
                    }
                }
            }
        }

        return movesCollection;

    }
}
