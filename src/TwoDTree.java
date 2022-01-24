public class TwoDTree {
    class Node {
        Node left = null ;
        Node right = null;
        final int numDims = 2 ;
        public Point point ;

        public Node (Point point){
            this.point = point ;
        }

        private void add(Node n) {
            this.add(n, 0);
        }

        private void add(Node n, int k) {
            if (k==0){
                if (n.point.getX() < point.getX()) {
                    if (left == null) {
                        left = n;
                    } else {
                        left.add(n, (k+1)%2 );
                    }
                } else {
                    if (right == null) {
                        right = n;
                    } else {
                        right.add(n, k+1);
                    }
                }
            }
            else{
                if (n.point.getY() < point.getY()) {
                    if (left == null) {
                        left = n;
                    } else {
                        left.add(n, (k+1)%2 );
                    }
                } else {
                    if (right == null) {
                        right = n;
                    } else {
                        right.add(n, k+1);
                    }
                }
            }
        }
    }
}
