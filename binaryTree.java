//    class Node {
//
//        public int data;
//        public Node left;
//        public Node right;
//
//        Node() {
//            this.data = 0;
//            this.left = null;
//            this.right = null;
//
//        }
//
//        Node(int data) {
//
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//
//        Node(int data, Node left, Node right) {
//
//            this.data = data;
//            this.left = left;
//            this.right = right;
//        }
//
//
//    }
//
//    public class binaryTree{
//        public static Node createTree(int[] arr) {
//
//
//
//            return create(arr, 0);
//        }
//
//        private static Node create(int[] arr, int i) {
//
//            if (i >= arr.length) {
//                return null;
//            }
//
//            Node n = new Node(arr[i]);
//            n.left = create(arr, 2 * i + 1);
//            n.right = create(arr, 2 * i + 2);
//
//            return n;
//
//
//        }
//
//
//
//      public static void main(String[] args) {
//
//          int[] arr = {1,2,3,4,5};
//
//          createTree(arr);
//
//      }
//  }
//
//
//
//
//
//
