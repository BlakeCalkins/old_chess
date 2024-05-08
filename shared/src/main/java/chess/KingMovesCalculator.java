package chess;

import java.util.Collection;
import java.util.ArrayList;


public class KingMovesCalculator extends PieceMovesCalculator {
    public KingMovesCalculator(ChessBoard board, ChessPosition myPosition) {
        super(board, myPosition);
    }

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
//        ChessPiece myPiece = board.getPiece(myPosition);
        ArrayList<ChessPosition> movesList = new ArrayList<>();


        int kingRow = myPosition.getRow();
        int kingCol = myPosition.getColumn();
        for (int row = kingRow - 1; row <= kingRow + 1; row++) {
            if (row < 1 || row > 8) {
                continue;
            }
            for (int col = kingCol-1; col <= kingCol +1; col++) {
                if (col < 1 || col > 8) {
                    continue;
                }
                if (row == kingRow && col == kingCol) {
                    continue;
                }

            }
        }
    }
}
