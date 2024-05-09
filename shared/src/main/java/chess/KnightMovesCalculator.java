package chess;

import java.util.ArrayList;
import java.util.Collection;

public class KnightMovesCalculator extends PieceMovesCalculator {
    public KnightMovesCalculator(ChessBoard board, ChessPosition myPosition) {
        super(board, myPosition);
    }

    @Override
    public Collection<ChessMove> pieceMoves() {
        for (int row = currRow - 2; row <= currRow + 2; row++) {
            if (row < 1 || row > 8) {
                continue;
            }
            for (int col = currCol - 2; col <= currCol + 2; col++) {
                if (col < 1 || col > 8) {
                    continue;
                }
                if (row == currRow && col == currCol) {
                    continue;
                }
                ChessPiece currPiece = board.getPiece(new ChessPosition(row, col));
                ChessPosition currPosition = new ChessPosition(row, col);
                if ((row == currRow - 2 && (col == currCol - 1 || col == currCol + 1)) ||
                        (row == currRow - 1 && (col == currCol - 2 || col == currCol + 2)) ||
                        (row == currRow + 1 && (col == currCol - 2 || col == currCol + 2)) ||
                        (row == currRow + 2 && (col == currCol - 1 || col == currCol + 1))) {
                    if (currPiece == null || (currPiece.getTeamColor() == opponentColor)) {
                        movesCollection.add(new ChessMove(myPosition, currPosition, null));
                    }
                }
            }
        }

        return movesCollection;

    }
}
