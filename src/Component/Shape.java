package Component;


import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {
    public abstract void move(double x,double y);
    public abstract void draw(GraphicsContext gc);
    public abstract boolean isSelect(double x,double y);
    private boolean isSelected = false;
    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean select) {
        isSelected = select;
    }
}
