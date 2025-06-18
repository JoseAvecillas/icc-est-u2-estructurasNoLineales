import Materia.controllers.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        BinaryTree ab = new BinaryTree();
        
        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);

        System.out.println("Preorder: ");
        ab.printPreorder1();
        System.out.println();

        System.out.println("PosOrder:");
        ab.printPosOrder1();
        System.out.println(); 

        System.out.println("InOrder");
        ab.printInOrder1();
        System.out.println();
    }
}
