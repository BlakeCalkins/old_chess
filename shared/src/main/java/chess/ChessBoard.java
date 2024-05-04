package chess;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {

    private ChessPiece[][] board;

    public ChessBoard() {
        board = new ChessPiece[8][8];
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece) {
        int row = position.getRow();
        int col = position.getColumn();
        board[row][col] = piece;
    }

    public void removePiece(ChessPosition position) {
        int row = position.getRow();
        int col = position.getColumn();
        board[row][col] = null;
    }

    public void clearBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                removePiece(new ChessPosition(row, col));
            }
        }
    }


    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position) {
        int row = position.getRow();
        int col = position.getColumn();
        return board[row][col];
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard() {
        clearBoard();
        int row = 1;
        for (int col = 0; col < board[row].length; col++) {
            row = 1;
            ChessPosition position = new ChessPosition(row, col);
            ChessPiece piece = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
            addPiece(position, piece);
            row = 6;
            position = new ChessPosition(row, col);
            piece = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
            addPiece(position, piece);
        }
        ChessPosition rookP1 = new ChessPosition(0,0);
        ChessPosition knightP1 = new ChessPosition(0,1);
        ChessPosition bishopP1 = new ChessPosition(0,2);
        ChessPosition queenP1 = new ChessPosition(0,3);
        ChessPosition kingP1 = new ChessPosition(0,4);
        ChessPosition bishopP2 = new ChessPosition(0,5);
        ChessPosition knightP2 = new ChessPosition(0,6);
        ChessPosition rookP2 = new ChessPosition(0,7);
        ChessPosition rookP3 = new ChessPosition(7,0);
        ChessPosition knightP3 = new ChessPosition(7,1);
        ChessPosition bishopP3 = new ChessPosition(7,2);
        ChessPosition queenP2 = new ChessPosition(7,3);
        ChessPosition kingP2 = new ChessPosition(7,4);
        ChessPosition bishopP4 = new ChessPosition(7,5);
        ChessPosition knightP4 = new ChessPosition(7,6);
        ChessPosition rookP4 = new ChessPosition(7,7);
        ChessPiece blackRook1 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.ROOK);
        ChessPiece blackKnight1 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KNIGHT);
        ChessPiece blackBishop1 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.BISHOP);
        ChessPiece blackQueen = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.QUEEN);
        ChessPiece blackKing = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KING);
        ChessPiece blackBishop2 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.BISHOP);
        ChessPiece blackKnight2 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KNIGHT);
        ChessPiece blackRook2 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.ROOK);
        ChessPiece whiteRook1 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.ROOK);
        ChessPiece whiteKnight1 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KNIGHT);
        ChessPiece whiteBishop1 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.BISHOP);
        ChessPiece whiteQueen = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.QUEEN);
        ChessPiece whiteKing = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KING);
        ChessPiece whiteBishop2 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.BISHOP);
        ChessPiece whiteKnight2 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KNIGHT);
        ChessPiece whiteRook2 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.ROOK);
        addPiece(rookP1, blackRook1);
        addPiece(knightP1, blackKnight1);
        addPiece(bishopP1, blackBishop1);
        addPiece(queenP1, blackQueen);
        addPiece(kingP1, blackKing);
        addPiece(bishopP2, blackBishop2);
        addPiece(knightP2, blackKnight2);
        addPiece(rookP2, blackRook2);
        addPiece(rookP3, whiteRook1);
        addPiece(knightP3, whiteKnight1);
        addPiece(bishopP3, whiteBishop1);
        addPiece(queenP2, whiteQueen);
        addPiece(kingP2, whiteKing);
        addPiece(bishopP4, whiteBishop2);
        addPiece(knightP4, whiteKnight2);
        addPiece(rookP4, whiteRook2);
    }
}
