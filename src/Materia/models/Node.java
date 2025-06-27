package Materia.models;

public class Node {

    private int valor;
    private Node left;
    private Node right;
    private int height;

    public Node(int valor) {
        this.valor = valor;
        this.left = null;
        this.right = null;
        this.height = 1; // altura inicial al crear un nuevo nodo
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Node [valor=" + valor + "]";
    }
}