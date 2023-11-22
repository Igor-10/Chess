public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(toLine) && toColumn == column && chessBoard.board[line][column] != null) {
            if (toLine != line) {
                if (((toLine == line + 2) && (line == 1) && color.equals("White"))
                        || ((toLine == line - 2) && (line == 6) && color.equals("Black"))) {
                    return true;
                } else if (((toLine == line + 1) && color.equals("White"))
                        || ((toLine == line - 1) && color.equals("Black"))) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }

    public String getSymbol() {
        return "P";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
