

import Materia.controllers.AVLTree;
import Materia.controllers.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {




        BinaryTree ab = new BinaryTree();
        AVLTree av = new AVLTree();

        av.insert(5);
        av.insert(20);
        av.insert(15);

        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);

        // System.out.println("Preorder: ");
        // ab.printPreorder1();
        // System.out.println();

        // System.out.println("PosOrder:");
        // ab.printPosOrder1();
        // System.out.println(); 

        System.out.println("Nombre: Jose Avecillas ");
        // System.out.println("Peso del árbol: " + ab.getPeso());
        // System.out.println("Altura del árbol= " + ab.getHeightTree());
        // System.out.println("----------------------------------------");
        // System.out.println("InOrder");
        // ab.printInOrder1();
        // System.out.println();
        // System.out.println("--------------------------------------");
        // if (ab.findeValue(23)) {
        //     System.out.println("Encontro el valor 23");
        // }else{
        //     System.out.println("No encontro el valor 23");
        // }
        // if (ab.findeValue(77)) {
        //     System.out.println("Encontro el valor 77");
        // }else{
        //     System.out.println("No encontro el valor 77");
        // }

        // System.out.println("InOrder en Altura");
        // ab.printInOrderAlt();
        // System.out.println();
        // System.out.println("---------------------------------------");
        // System.out.println("InOrder Factor de equlibrio");
        // ab.printInOrderFe();
        // System.out.println();
        // System.out.println("-----------------------------------------");
        // System.out.println("El árbol está equilibrado= " + ab.estaEquilibrado());
        // System.out.println("Existe el nodo 15= " + ab.existeNodo(15));
        // ab.insert(15);
        // System.out.println("Nodo desequilibrado:");
        // ab.printInOrderFe();
        // System.out.println();
        // System.out.println("-------------------------------------------");
        // System.out.println("Existe el nodo 15= " + ab.existeNodo(15));
        // System.out.println("El árbol está equilibrado= " + ab.estaEquilibrado());
        // System.out.println("---------------------------------------------");
        // System.out.println(" Nodos desequilibrados ");
        // ab.mostrarNodosDesequilibrados();
        System.out.println("---------------------------------------------");


     }
}
