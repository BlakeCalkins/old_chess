package chess;

import java.util.Collection;

public class PawnMovesCalculator extends PieceMovesCalculator {
    public PawnMovesCalculator(ChessBoard board, ChessPosition myPosition) {
        super(board, myPosition);
    }

    @Override
    public Collection<ChessMove> pieceMoves() {
        if (myColor == ChessGame.TeamColor.WHITE) {
            int row = currRow + 1;
            for (int col = currCol - 1; col <= currCol + 1; col++) {
                if (col < 1 || col > 8 || row > 8) {
                    continue;
                }
                ChessPosition position = new ChessPosition(row, col);
                ChessPiece currPiece = board.getPiece(position);
                if ((col < currCol || col > currCol) && (currPiece != null && currPiece.getTeamColor() == opponentColor)) {
                    if (row == 8) {
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.QUEEN));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.KNIGHT));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.ROOK));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.BISHOP));
                    } else {
                        movesCollection.add(new ChessMove(myPosition, position, null));
                    }
                }
                if (currPiece == null && col == currCol) {
                    if (row == 8) {
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.QUEEN));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.KNIGHT));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.ROOK));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.BISHOP));
                    } else {
                        movesCollection.add(new ChessMove(myPosition, position, null));
                    }
                }
                if (currRow == 2 && col == currCol) {
                    ChessPosition position1 = new ChessPosition(row + 1, col);
                    ChessPiece piece1 = board.getPiece(position1);
                    if (currPiece == null && piece1 == null) {
                        movesCollection.add(new ChessMove(myPosition, position, null));
                        movesCollection.add(new ChessMove(myPosition, position1, null));
                    }
                }
            }
        }
        if (myColor == ChessGame.TeamColor.BLACK) {
            int row = currRow - 1;
            for (int col = currCol - 1; col <= currCol + 1; col++) {
                if (col < 1 || col > 8 || row < 1) {
                    continue;
                }
                ChessPosition position = new ChessPosition(row, col);
                ChessPiece currPiece = board.getPiece(position);
                if ((col < currCol || col > currCol) && (currPiece != null && currPiece.getTeamColor() == opponentColor)) {
                    if (row == 1) {
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.QUEEN));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.KNIGHT));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.ROOK));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.BISHOP));
                    } else {
                        movesCollection.add(new ChessMove(myPosition, position, null));
                    }
                }
                if (currPiece == null && col == currCol) {
                    if (row == 1) {
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.QUEEN));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.KNIGHT));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.ROOK));
                        movesCollection.add(new ChessMove(myPosition, position, ChessPiece.PieceType.BISHOP));
                    } else {
                        movesCollection.add(new ChessMove(myPosition, position, null));
                    }
                }
                if (currRow == 7 && col == currCol) {
                    ChessPosition position1 = new ChessPosition(row - 1, col);
                    ChessPiece piece1 = board.getPiece(position1);
                    if (currPiece == null && piece1 == null) {
                        movesCollection.add(new ChessMove(myPosition, position, null));
                        movesCollection.add(new ChessMove(myPosition, position1, null));
                    }
                }
            }
        }
        return movesCollection;
    }
}
