package Entity.animal.intelligence;

public class Node {
    private int h;
    private int g;
    private int f;
    private int row;
    private int col;
    private boolean is_block;   // Check if the node is a block.
    private Node parent;

    /**
     * Constructor
     * @param row row of the node
     * @param col column of the node
     */
    public Node(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    /**
     * Get value of is_block.
     * @return is_block
     */
    public boolean isIs_block() {
        return is_block;
    }

    /**
     * Set value of is_block.
     * @param is_block
     */
    public void setIs_block(boolean is_block) {
        this.is_block = is_block;
    }

    /**
     * Get parent object.
     * @return parent object/
     */
    public Node getParent() {
        return parent;
    }

    /**
     * Set parent object.
     * @param parent parent object.
     */
    public void setParent(Node parent) {
        this.parent = parent;
    }

    // Method calculateHeuristic() with parameter final_node in Node class to apply AI in Doll enemy.

    /**
     * Calculate heuristic value for AI of Doll enemy.
     * @param final_node final node.
     */
    public void calculateHeuristic(Node final_node) {
        this.h = Math.abs(final_node.getRow() - getRow()) + Math.abs(final_node.getCol() - getCol());
    }

    public void setNodeData(Node current_node) {
        int g_cost = current_node.getG();
        setParent(current_node);
        setG(g_cost);
        calculateFinalCost();
    }

    public boolean checkBetterPath(Node current_node) {
        int g_cost = current_node.getG();
        if (g_cost < getG()) {
            setNodeData(current_node);
            return true;
        }
        return false;
    }

    public void calculateFinalCost() {
        int final_cost = getG() + getH();
        setF(final_cost);
    }

    /**
     * Override method equals() in Node class.
     * @param obj object to compare.
     * @return true if two objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        Node other = (Node) obj;
        return this.getRow() == other.getRow() && this.getCol() == other.getCol();
    }

    /**
     * Override method toString() in Node class.
     * @return string representation of Node object.
     */
    @Override
    public String toString() {
        return "Node[row=" + row + ",col=" + col + "]";
    }
}
