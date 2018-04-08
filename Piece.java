public class Piece {
    String color;
    boolean isalive;
    int position_x;
    int position_y;
    Piece(int x,int y,String color){
        this.color = color;
        this.isalive = true;
        this.position_x = x;
        this.position_y = y;
    }
}
