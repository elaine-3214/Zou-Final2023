public class TicTacToe {
    private Tile t1;
    private Tile t2;
    private Tile t3;
    private Tile t4;
    private Tile t5;
    private Tile t6;
    private Tile t7;
    private Tile t8;
    private Tile t9;

    public TicTacToe () {
        t1 = new Tile ("corner", 1);
        t2 = new Tile ("edge", 2);
        t3 = new Tile ("corner", 3);
        t4 = new Tile ("edge", 4);
        t5 = new Tile ("center", 5);
        t6 = new Tile ("edge", 6);
        t7 = new Tile ("corner", 7);
        t8 = new Tile ("edge", 8);
        t9 = new Tile ("corner", 9);

    }

    private int checkHorizontal(Tile t) {
        int num = t.getPlace();
        int row = 0;
        if (num < 4) {      //row 1
            if (!t1.getTaken().equals("ai") && !t2.getTaken().equals("ai") && !t3.getTaken().equals("ai")) {        //not blocked
                if (t1.getPlace() != num && t1.getTaken().equals("player")) {
                    row = 1; //row 1
                }
                if (t2.getPlace() != num && t2.getTaken().equals("player")) {
                    row = 1; //row 1
                }
                if (t1.getPlace() != num && t1.getTaken().equals("player")) {
                    row = 1; //row 1
                }
            }
        } else if (num < 7) {   //row 2
            if (!t4.getTaken().equals("ai") && !t5.getTaken().equals("ai") && !t6.getTaken().equals("ai")) {        //not blocked
                if (t4.getPlace() != num && t4.getTaken().equals("player")) {
                    row = 2; //row 2
                }
                if (t5.getPlace() != num && t5.getTaken().equals("player")) {
                    row = 2; //row 2
                }
                if (t6.getPlace() != num && t6.getTaken().equals("player")) {
                    row = 2; //row 2
                }
            }
        }
        else if (num < 10) {
            if (!t7.getTaken().equals("ai") && !t8.getTaken().equals("ai") && !t9.getTaken().equals("ai")) {        //not blocked
                if (t7.getPlace() != num && t7.getTaken().equals("player")) {
                    row = 3; //row 3
                }
                if (t8.getPlace() != num && t8.getTaken().equals("player")) {
                    row = 3; //row 3
                }
                if (t9.getPlace() != num && t9.getTaken().equals("player")) {
                    row = 3; //row 3
                }
            }
        }
        return row;
    }

    private int checkVertical(Tile t) {
        int num = t.getPlace();
        int col = 0;
        if (num == 1 || num == 4 || num == 7) {      //row 1
            if (!t1.getTaken().equals("ai") && !t4.getTaken().equals("ai") && !t4.getTaken().equals("ai")) {        //not blocked
                if (t1.getPlace() != num && t1.getTaken().equals("player")) {
                    col = 1; //col 1
                }
                if (t4.getPlace() != num && t4.getTaken().equals("player")) {
                    col = 1; //col 1
                }
                if (t7.getPlace() != num && t7.getTaken().equals("player")) {
                    col = 1; //col 1
                }
            }
        } else if (num == 2 || num == 5 || num == 8) {   //row 2
            if (!t2.getTaken().equals("ai") && !t5.getTaken().equals("ai") && !t8.getTaken().equals("ai")) {        //not blocked
                if (t2.getPlace() != num && t2.getTaken().equals("player")) {
                    col = 2; //col 2
                }
                if (t5.getPlace() != num && t5.getTaken().equals("player")) {
                    col = 2; //col 2
                }
                if (t8.getPlace() != num && t8.getTaken().equals("player")) {
                    col = 2; //col 2
                }
            }
        }
        else if (num == 3 || num == 6 || num == 9) {
            if (!t3.getTaken().equals("ai") && !t6.getTaken().equals("ai") && !t9.getTaken().equals("ai")) {        //not blocked
                if (t3.getPlace() != num && t3.getTaken().equals("player")) {
                    col = 3; //col 3
                }
                if (t6.getPlace() != num && t6.getTaken().equals("player")) {
                    col = 3; //col 3
                }
                if (t9.getPlace() != num && t9.getTaken().equals("player")) {
                    col = 3; //col 3
                }
            }
        }
        return col;
    }

    private int checkDiagonal(Tile t) {
        int num = t.getPlace();
        int dia = 0;
        if (num == 1 || num == 5 ||num == 9) {      //dia 1
            if (!t1.getTaken().equals("ai") && !t5.getTaken().equals("ai") && !t9.getTaken().equals("ai")) {        //not blocked
                if (t1.getPlace() != num && t1.getTaken().equals("player")) {
                    dia = 1; //dia 1
                }
                if (t5.getPlace() != num && t5.getTaken().equals("player")) {
                    dia = 1; //dia 1
                }
                if (t9.getPlace() != num && t9.getTaken().equals("player")) {
                    dia = 1; //dia 1
                }
            }
        } else if (num == 3 ||  num == 5 ||num == 7) {   //dia 2
            if (!t3.getTaken().equals("ai") && !t5.getTaken().equals("ai") && !t7.getTaken().equals("ai")) {        //not blocked
                if (t3.getPlace() != num && t3.getTaken().equals("player")) {
                    dia = 2; //dia 2
                }
                if (t5.getPlace() != num && t5.getTaken().equals("player")) {
                    dia = 2; //dia 2
                }
                if (t7.getPlace() != num && t7.getTaken().equals("player")) {
                    dia = 2; //dia 2
                }
            }
        }
        return dia;
    }

}
