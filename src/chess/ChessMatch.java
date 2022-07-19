package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private int turn;
    private Color currentPlayer;
    private boolean check;
    private boolean checkmate;
    private ChessPiece enPassantVulnerable;
    private ChessPiece promote;
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup(); //Calling initialSetup pieces placement in ChessMatch constructor
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; i < board.getColumns(); i++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE),new Position(2, 1)); //adding a piece to the board, choosing the color and the board position.

    }

}
