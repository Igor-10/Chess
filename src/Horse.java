public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(toLine) && checkPos(toColumn)) {
            if (toLine != line && toColumn != column) {
                if (toLine == (line + 2) && toColumn == (column + 1)) {
                    return true;
                } else if (toLine == (line + 2) && toColumn == (column - 1)) {
                    return true;
                } else if (toLine == (line + 1) && toColumn == (column + 2)) {
                    return true;
                } else if (toLine == (line + 1) && toColumn == (column - 2)) {
                    return true;
                } else if (toLine == (line - 2) && toColumn == (column - 1)) {
                    return true;
                } else if (toLine == (line - 2) && toColumn == (column + 1)) {
                    return true;
                } else if (toLine == (line - 1) && toColumn == (column - 2)) {
                    return true;
                } else if (toLine == (line - 1) && toColumn == (column + 2)) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }


    public String getSymbol() {
        return "H";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
