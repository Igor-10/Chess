public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(toLine) && checkPos(toColumn)) {
            if (toLine != line && toColumn != column) {
                if (((toLine - line) == (toColumn - column)) ||
                        ((toLine - line) == -1 * (toColumn - column))) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }

    public String getSymbol() {
        return "B";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
