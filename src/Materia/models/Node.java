package Materia.models;

public class Node {

    private int valor;
    private Node left;
    private Node right;

    public Node(int valor) {
        this(valor, null, null);
    }

    public Node(int valor, Node left, Node right) {
        this.valor = valor;
        this.left = left;
        this.right = right;
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

    @Override
    public String toString() {
        return "Node [valor=" + valor + ", left=" + left + ", right=" + right + "]";
    }
}