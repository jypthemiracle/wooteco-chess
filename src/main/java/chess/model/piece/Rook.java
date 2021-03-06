package chess.model.piece;

import chess.model.Direction;
import chess.model.PlayerType;
import chess.model.Point;

public class Rook extends Piece {
    private static double ROOK_SCORE = 5;

    public Rook(PlayerType team, Point point) {
        super(team, point, ROOK_SCORE);
    }

    @Override
    public boolean canMove(Direction direction, Point destination) {
        return Direction.rookDirection().contains(direction);
    }

    @Override
    public String toString() {
        return "rook";
    }
}
