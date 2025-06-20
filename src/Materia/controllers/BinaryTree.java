package Materia.controllers;

import Materia.models.Node;

public class BinaryTree {
    

    private Node root;
    private int peso;

    public BinaryTree(){
        this.root=null;
        this.peso= 0;
    }

    public void insert(int value){
        root= insertRec(root, value);
        peso++;
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

    public int getHeightTree(){
        return getHeightRec(root);
    }

    private int getHeightRec(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeightRec(node.getLeft());
        int rightHeight = getHeightRec(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1 ;
    }

    public void printInOrderAlt(){
        printInOrderAltRec(root);
    }

    private void printInOrderAltRec(Node node) {
        if (node != null) {
        printInOrderAltRec(node.getLeft());
        int height = getHeightRec(node); 
        System.out.print(node.getValor() + "(h=" + height + "),  ");
        printInOrderAltRec(node.getRight());
        }
    }
 
    //Factor Equilibrio 
     public int factorEquilibrio(){
        return factorEqulibrioRec(root);
     }

    private int factorEqulibrioRec(Node node) {
        if (node == null) return 0;
        int alturaIzq = getHeightRec(node.getLeft());
        int alturaDer = getHeightRec(node.getRight());
        return alturaIzq - alturaDer;
    }

    public void printInOrderFe(){
        printInOrderfeRec(root);
    }

    private void printInOrderfeRec(Node node) {
        if (node != null) {
        printInOrderfeRec(node.getLeft());
        int fe = factorEqulibrioRec(node);
        System.out.print(node.getValor() + "("+ " FE=" + fe + "),");
        printInOrderfeRec(node.getRight());
        
        }
    }

    public int getPeso(){
        return peso;
    }

    public boolean estaEquilibrado() {
        return estaEquilibradoRec(root);
    }

    private boolean estaEquilibradoRec(Node node) {
        if (node == null) return true;

        int bf = getHeightRec(node.getLeft()) - getHeightRec(node.getRight());
        if (Math.abs(bf) > 1) return false;

        return estaEquilibradoRec(node.getLeft()) && estaEquilibradoRec(node.getRight());
    }

    public boolean existeNodo(int valor) {
        return existeNodoRec(root, valor);
    }

    private boolean existeNodoRec(Node node, int valor) {
        if (node == null) return false;

        if (node.getValor() == valor) return true;

        if (valor < node.getValor()) {
            return existeNodoRec(node.getLeft(), valor);
        } else {
            return existeNodoRec(node.getRight(), valor);
        }
    }

    public void mostrarNodosDesequilibrados() {
        System.out.print("Nodos desequilibrados: ");
        mostrarNodosDesequilibradosRec(root);
        System.out.println();
    }

    private void mostrarNodosDesequilibradosRec(Node node) {
        if (node != null) {
            mostrarNodosDesequilibradosRec(node.getLeft());

            int fe = getHeightRec(node.getLeft()) - getHeightRec(node.getRight());
            if (Math.abs(fe) > 1) {
                System.out.print(node.getValor() + ", ");
            }

            mostrarNodosDesequilibradosRec(node.getRight());
        }
    }
}




/*
 * if (leftHeight > rightHeight) { 
            return leftHeight + 1;
        } else {
            return rightHeight + 1 ;
        }
 */