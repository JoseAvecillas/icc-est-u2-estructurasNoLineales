package Materia.controllers;

import Materia.models.Node;

public class BinaryTree {
    

    private Node root;


    public BinaryTree(){
        this.root=null;
    }

    public void insert(int value){
        root= insertRec(root, value);
    }

    private Node insertRec(Node padre, int value) {

        if (padre==null) {
            return new Node(value);
        }
        if (value < padre.getValor()) {
            Node newNode = insertRec(padre.getLeft(), value);
            padre.setLeft(newNode);

        }else if (value > padre.getValor()) {
            padre.setRight(insertRec(padre.getRight(), value));
        }
        return padre;
    }

    public void printPreorder1(){
        printPreorder(root);
    }

    public void printPosOrder1(){
        printPosOrder(root);
    }

    public void printInOrder1(){
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if (node != null) {
        printInOrder(node.getLeft());
        System.out.print(node.getValor() + ", ");
        printInOrder(node.getRight());
        }
    }

    private void printPosOrder(Node node) {
        if (node != null) {
        printPosOrder(node.getLeft());
        printPosOrder(node.getRight());
        System.out.print(node.getValor() + ", ");
        }
    }

    private void printPreorder(Node node) {
        if (node !=null) {
            System.out.print(node.getValor() + ", ");
            printPreorder(node.getLeft());
            printPreorder(node.getRight());
        }
    }

    public boolean findeValue(int valor){
        return findeValueRec(root, valor);
    }

    private boolean findeValueRec(Node node, int valor){
        if (node == null) {
            return false;
        }

        if (node.getValor() == valor) {
            return true;
        }

        if (valor < node.getValor()) {
            return findeValueRec(node.getLeft(), valor);
        } else {
            return findeValueRec(node.getRight(), valor);
        }
    }
}
