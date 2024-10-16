package Assignment;

public class CircularDoubleLinkList {
	
	 Anode root;
	 
	    void create_list() {
	        root = null;
	    }

	    void insert_left(int data) {
	        Anode n = new Anode(data);
	        if (root == null) {
	            root = n;
	            n.left = n;  
	            n.right = n; 
	        } else {
	            n.right = root; 
	            n.left = root.left; 
	            root.left.right = n; 
	            root.left = n; 
	            root = n; 
	        }
	        System.out.println(data + " inserted");
	    }
	   
	    void delete_left() {
	        if (root == null) {
	            System.out.println("Empty List");
	        } else {
	            Anode t = root;
	            if (root.right == root) { 
	                root = null; 
	            } else {
	                root.left.right = root.right; 
	                root.right.left = root.left; 
	                root = root.right;
	            }
	            System.out.println(t.data + " deleted");
	        }

	    }

	    void insert_right(int data) {
	        Anode n = new Anode(data);
	        if (root == null) {
	            root = n;
	            n.left = n; 
	            n.right = n; 
	        } else {
	            Anode last = root.left; 
	            last.right = n; 
	            n.left = last; 
	            n.right = root;
	            root.left = n;
	        }
	        System.out.println(data + " inserted");
	    }

	    void delete_right() {
	        if (root == null) {
	            System.out.println("Empty List");
	        } else {
	            Anode last = root.left; 
	            if (last == root) { 
	                root = null; 
	            } else {
	                last.left.right = root; 
	                root.left = last.left; 
	            }

	            System.out.println(last.data + " deleted");
	        }
	    }

	    void print_list() {
	        if (root == null) {
	            System.out.println("List Empty");
	        } else {
	            Anode t = root;
	            do {
	                System.out.print("<-|" + t.data + "|->");
	                t = t.right;
	            } while (t != root);
	            System.out.println();
	        }

	    }

	    void print_list_rev() {
	        if (root == null) {
	            System.out.println("List Empty");
	        } else {
	            Anode t = root.left; 
	            do {
	                System.out.print("<-|" + t.data + "|->");
	                t = t.left;
	            } while (t != root.left);
	            System.out.println();
	        }
	    }
	}
