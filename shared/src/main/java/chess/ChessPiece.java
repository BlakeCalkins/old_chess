package chess;

import java.util.Collection;
import java.util.Objects;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {

    private final ChessGame.TeamColor teamColor;
    private final ChessPiece.PieceType pieceType;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.teamColor = pieceColor;
        this.pieceType = type;
    }


    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return teamColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return pieceType;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        //check piece type and instantiate movesCalculator according to type
        ChessPiece myPiece = board.getPiece(myPosition);
        return switch (myPiece.getPieceType()) {
            case KING -> {
                KingMovesCalculator calculator = new KingMovesCalculator(board, myPosition);
                yield calculator.pieceMoves();
            }
            case KNIGHT -> {
                KnightMovesCalculator calculator1 = new KnightMovesCalculator(board, myPosition);
                yield calculator1.pieceMoves();
            }
            case BISHOP -> {
                BishopMovesCalculator calculator2 = new BishopMovesCalculator(board, myPosition);
                yield calculator2.pieceMoves();
            }
            case ROOK -> {
                RookMovesCalculator calculator3 = new RookMovesCalculator(board, myPosition);
                yield calculator3.pieceMoves();
            }
            case QUEEN -> {
                QueenMovesCalculator calculator4 = new QueenMovesCalculator(board, myPosition);
                yield calculator4.pieceMoves();
            }
            case PAWN -> {
                PawnMovesCalculator calculator5 = new PawnMovesCalculator(board, myPosition);
                yield calculator5.pieceMoves();
            }
        };
    }


    @Override
    public String toString() {
        return "ChessPiece{" +
                "teamColor=" + teamColor +
                ", pieceType=" + pieceType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessPiece that = (ChessPiece) o;
        return teamColor == that.teamColor && pieceType == that.pieceType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamColor, pieceType);
    }
}

