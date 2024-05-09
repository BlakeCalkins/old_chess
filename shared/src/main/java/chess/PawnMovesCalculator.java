package chess;

import java.util.Collection;

public class PawnMovesCalculator extends PieceMovesCalculator {
    public PawnMovesCalculator(ChessBoard board, ChessPosition myPosition) {
        super(board, myPosition);
    }

    @Override
    public Collection<ChessMove> pieceMoves() {

        if (myColor == ChessGame.TeamColor.WHITE && currRow == 2) {
            ChessPiece currPiece = board.getPiece(new ChessPosition(currRow + 2, currCol));
            ChessPosition currPosition = new ChessPosition(currRow + 2, currCol);
            ChessPiece currPiece2 = board.getPiece(new ChessPosition(currRow + 1, currCol));
            if (currPiece == null && currPiece2 == null) {
                movesCollection.add(new ChessMove(myPosition, currPosition, null));
            }
        }
        if (currRow + 1 != 9 && myColor == ChessGame.TeamColor.WHITE) {
            ChessPosition currPosition = new ChessPosition(currRow + 1, currCol);
            ChessPiece currPiece = board.getPiece(currPosition);
                if (currRow + 1 == 8) {
                    if (currPiece == null) {
                        movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.QUEEN));
                        movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.ROOK));
                        movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.KNIGHT));
                        movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.BISHOP));
                    }
                    if (currCol + 1 != 9) {
                        ChessPosition currPosition2 = new ChessPosition(currRow + 1, currCol + 1);
                        ChessPiece currPiece2 = board.getPiece(currPosition2);
                        if (currPiece2 != null && currPiece2.getTeamColor() == opponentColor) {
                            movesCollection.add(new ChessMove(myPosition, currPosition2, ChessPiece.PieceType.QUEEN));
                            movesCollection.add(new ChessMove(myPosition, currPosition2, ChessPiece.PieceType.ROOK));
                            movesCollection.add(new ChessMove(myPosition, currPosition2, ChessPiece.PieceType.KNIGHT));
                            movesCollection.add(new ChessMove(myPosition, currPosition2, ChessPiece.PieceType.BISHOP));
                        }
                    }
                    if (currCol - 1 != 0) {
                        ChessPosition currPosition3 = new ChessPosition(currRow + 1, currCol - 1);
                        ChessPiece currPiece3 = board.getPiece(currPosition3);
                        if (currPiece3 != null && currPiece3.getTeamColor() == opponentColor) {
                            movesCollection.add(new ChessMove(myPosition, currPosition3, ChessPiece.PieceType.QUEEN));
                            movesCollection.add(new ChessMove(myPosition, currPosition3, ChessPiece.PieceType.ROOK));
                            movesCollection.add(new ChessMove(myPosition, currPosition3, ChessPiece.PieceType.KNIGHT));
                            movesCollection.add(new ChessMove(myPosition, currPosition3, ChessPiece.PieceType.BISHOP));
                        }
                    }
                    return movesCollection;
                }
                if (currPiece == null) {
                    movesCollection.add(new ChessMove(myPosition, currPosition, null));
                }
                if (currCol + 1 != 9) {
                    currPosition = new ChessPosition(currRow + 1, currCol + 1);
                    currPiece = board.getPiece(currPosition);
                    if (currPiece != null && currPiece.getTeamColor() == opponentColor) {
                        if (currRow + 1 == 8) {
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.QUEEN));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.ROOK));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.KNIGHT));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.BISHOP));
                        } else {
                            movesCollection.add(new ChessMove(myPosition, currPosition, null));
                        }
                    }
                }
                if (currCol - 1 != 0) {
                    currPosition = new ChessPosition(currRow + 1, currCol - 1);
                    currPiece = board.getPiece(currPosition);
                    if (currPiece != null && currPiece.getTeamColor() == opponentColor) {
                        if (currRow + 1 == 8) {
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.QUEEN));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.ROOK));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.KNIGHT));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.BISHOP));
                        } else {
                            movesCollection.add(new ChessMove(myPosition, currPosition, null));
                        }
                    }
                }
            }


        if (myColor == ChessGame.TeamColor.BLACK && currRow == 7) {
            ChessPiece currPiece = board.getPiece(new ChessPosition(currRow - 2, currCol));
            ChessPosition currPosition = new ChessPosition(currRow - 2, currCol);
            ChessPiece currPiece2 = board.getPiece(new ChessPosition(currRow - 1, currCol));
            if (currPiece == null && currPiece2 == null) {
                movesCollection.add(new ChessMove(myPosition, currPosition, null));
            }
        }
        if (currRow - 1 != 0 && myColor == ChessGame.TeamColor.BLACK) {
            ChessPosition currPosition = new ChessPosition(currRow - 1, currCol);
            ChessPiece currPiece = board.getPiece(currPosition);
                if (currRow - 1 == 1) {
                    if (currPiece == null) {
                        movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.QUEEN));
                        movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.ROOK));
                        movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.KNIGHT));
                        movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.BISHOP));
                    }
                    if (currCol + 1 != 9) {
                        ChessPosition currPosition2 = new ChessPosition(currRow - 1, currCol + 1);
                        ChessPiece currPiece2 = board.getPiece(currPosition2);
                        if (currPiece2 != null && currPiece2.getTeamColor() == opponentColor) {
                            movesCollection.add(new ChessMove(myPosition, currPosition2, ChessPiece.PieceType.QUEEN));
                            movesCollection.add(new ChessMove(myPosition, currPosition2, ChessPiece.PieceType.ROOK));
                            movesCollection.add(new ChessMove(myPosition, currPosition2, ChessPiece.PieceType.KNIGHT));
                            movesCollection.add(new ChessMove(myPosition, currPosition2, ChessPiece.PieceType.BISHOP));
                        }
                    }
                    if (currCol - 1 != 0) {
                        ChessPosition currPosition3 = new ChessPosition(currRow - 1, currCol - 1);
                        ChessPiece currPiece3 = board.getPiece(currPosition3);
                        if (currPiece3 != null && currPiece3.getTeamColor() == opponentColor) {
                            movesCollection.add(new ChessMove(myPosition, currPosition3, ChessPiece.PieceType.QUEEN));
                            movesCollection.add(new ChessMove(myPosition, currPosition3, ChessPiece.PieceType.ROOK));
                            movesCollection.add(new ChessMove(myPosition, currPosition3, ChessPiece.PieceType.KNIGHT));
                            movesCollection.add(new ChessMove(myPosition, currPosition3, ChessPiece.PieceType.BISHOP));
                        }
                    }
                    return movesCollection;

                }
                if (currPiece == null) {
                    movesCollection.add(new ChessMove(myPosition, currPosition, null));
                }
                if (currCol + 1 != 9) {
                    currPosition = new ChessPosition(currRow - 1, currCol + 1);
                    currPiece = board.getPiece(currPosition);
                    if (currPiece != null && currPiece.getTeamColor() == opponentColor) {
                        if (currRow - 1 == 1) {
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.QUEEN));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.ROOK));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.KNIGHT));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.BISHOP));
                        } else {
                            movesCollection.add(new ChessMove(myPosition, currPosition, null));
                        }
                    }
                }
                if (currCol - 1 != 0) {
                    currPosition = new ChessPosition(currRow - 1, currCol - 1);
                    currPiece = board.getPiece(currPosition);
                    if (currPiece != null && currPiece.getTeamColor() == opponentColor) {
                        if (currRow - 1 == 1) {
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.QUEEN));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.ROOK));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.KNIGHT));
                            movesCollection.add(new ChessMove(myPosition, currPosition, ChessPiece.PieceType.BISHOP));
                        } else {
                            movesCollection.add(new ChessMove(myPosition, currPosition, null));
                        }

                    }
                }
            }
        return movesCollection;


    }
}
