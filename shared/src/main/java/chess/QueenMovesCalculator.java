package chess;

import java.util.Collection;

public class QueenMovesCalculator extends PieceMovesCalculator {
    public QueenMovesCalculator(ChessBoard board, ChessPosition myPosition) {
        super(board, myPosition);
    }

    @Override
    public Collection<ChessMove> pieceMoves() {
        super.diagonalMoves();
        super.straightMoves();
        return movesCollection;
    }
}
