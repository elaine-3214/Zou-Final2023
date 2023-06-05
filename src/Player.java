public class Player {
    private String icon;
    private boolean win;

    public Player() {
        icon = null;
        win = false;
    }

    public void setIcon(String i) {
        icon = i;
    }

    public String getIcon() {
        return icon;
    }

    public void setWin(boolean i) {
        win = i;
    }

    public boolean getWin() {
        return win;
    }
}
