import javax.swing.*;
import java.awt.*;

class Board extends JFrame{
    static final int grids = 64; // total number of square grids in the chessboard
    Board(){
        this.setVisible(true);
        this.setSize(800,800);
        this.setTitle("Checker Chess");
        this.createBoard();
        this.setLayout(new GridLayout(8,8));
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
                    button.setBackground(Color.BLACK);
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
                    button.setBackground(Color.BLACK);
                }
                add(button);
            }
            if(i%8 == 0){
                rownumber++;
            }
        }
    }
}
