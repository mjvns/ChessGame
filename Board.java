import javax.swing.*;
import java.awt.*;

class Board extends JFrame{
    static final int grids = 64; // total number of square grids in the chessboard
    JButton gridsquare[][] = new JButton[8][8];
    Board(){
        this.setVisible(true);
        this.setSize(800,800);
        this.setTitle("Checker Chess");
        this.setLayout(new GridLayout(8,8));
        this.createBoard();
    }

    // this method creates a chess Board with 8*8 grid
    private void createBoard(){
        JButton button = null;
        int rownumber = 1;
        for(int i=1;i<=Board.grids;i++){
            if(i%2 == 1){
                button = new JButton();
                button.setBorder(null);
                if(rownumber%2 == 1) {
                    button.setBackground(Color.GRAY);
                }else{
                    button.setBackground(Color.WHITE);
                }
                add(button);
            }else{
                button = new JButton();
                button.setBorder(null);
                if(rownumber%2 == 1) {
                    button.setBackground(Color.WHITE);
                }else{
                    button.setBackground(Color.GRAY);
                }
                add(button);
            }
            gridsquare[rownumber-1][(i-1)%8] = button;
            if(i%8 == 0){
                rownumber++;
            }
        }
        initPieces();
        displayPieces();
    }

    private void displayPieces(){
        String pathName = "D:\\Java Programs\\Chess\\Images\\";
        gridsquare[0][0].setIcon(new ImageIcon(pathName+"Rook_black.png"));
        gridsquare[0][1].setIcon(new ImageIcon(pathName+"Knight_black.png"));
        gridsquare[0][2].setIcon(new ImageIcon(pathName+"bishop_black.png"));
        gridsquare[0][3].setIcon(new ImageIcon(pathName+"queen_black.png"));
        gridsquare[0][4].setIcon(new ImageIcon(pathName+"King_black.png"));
        gridsquare[0][5].setIcon(new ImageIcon(pathName+"bishop_black.png"));
        gridsquare[0][6].setIcon(new ImageIcon(pathName+"Knight_black.png"));
        gridsquare[0][7].setIcon(new ImageIcon(pathName+"Rook_black.png"));

        for(int j=0;j<8;j++){
            gridsquare[1][j].setIcon(new ImageIcon(pathName+"pawn_black.png"));
            gridsquare[6][j].setIcon(new ImageIcon(pathName+"pawn_white.png"));
        }

        gridsquare[7][0].setIcon(new ImageIcon(pathName+"rook_white.png"));
        gridsquare[7][1].setIcon(new ImageIcon(pathName+"Knight_white.png"));
        gridsquare[7][2].setIcon(new ImageIcon(pathName+"bishop_white.png"));
        gridsquare[7][3].setIcon(new ImageIcon(pathName+"queen_white.png"));
        gridsquare[7][4].setIcon(new ImageIcon(pathName+"King_white.png"));
        gridsquare[7][5].setIcon(new ImageIcon(pathName+"bishop_white.png"));
        gridsquare[7][6].setIcon(new ImageIcon(pathName+"Knight_white.png"));
        gridsquare[7][7].setIcon(new ImageIcon(pathName+"rook_white.png"));
    }

    private void initPieces(){
        // Instantiate the Two kings
        King whiteKing = new King(4,7,"white");
        King blackKing = new King(4,0,"black");

        // Instantiate the Two Queens
        Queen whiteQueen = new Queen(3,7,"white");
        Queen blackQueen = new Queen(3,0,"black");

        // Instantiate the Four bishops
        Bishop whitebishop_left = new Bishop(2,7,"white");
        Bishop whitebishop_right = new Bishop(5,7,"white");
        Bishop blackbishop_left = new Bishop(2,0,"black");
        Bishop blackbishop_right = new Bishop(5,0,"black");

        // Instantiate the Four knights
        Knight whiteknight_left = new Knight(1,7,"white");
        Knight whiteknight_right = new Knight(6,7,"white");
        Knight blackknight_left = new Knight(1,0,"black");
        Knight blackknight_right = new Knight(6,0,"black");

        //Instantiate the Four rooks
        Rook whiterook_left = new Rook(0,7,"white");
        Rook whiterook_right = new Rook(7,7,"white");
        Rook blackrook_left = new Rook(0,0,"black");
        Rook blackrook_right = new Rook(7,0,"black");

    }

}
