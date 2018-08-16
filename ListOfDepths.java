import java.util.*;
public class ListOfDepths {
 static ArrayList<LinkedList<Node>> lists;
 static void createLists(Node root) {
	 if(root==null) return;
	 LinkedList<Node> levelList  = new LinkedList<Node>();
	 Queue<Node> q = new LinkedList<Node>();
	 q.offer(root);
	 q.offer(null);
	 while(!q.isEmpty()) {
		 root = q.poll();
		 if(q.poll()!=null) {
			 levelList.add(root);
			 if(root.left!=null) q.offer(root.left);
			 if(root.right!=null) q.offer(root.right);
		 }else {
			 if(!q.isEmpty()) {
				 lists.add(levelList);
				 levelList.clear();
				 q.offer(null);
			 }
		 }
	 }
 }
}
class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}