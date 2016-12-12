package hw;

public class Bintree {
	public Node root;

	public Bintree(float vc) {
		root = new Node(vc);
	}

public void addNode(float vc){
	Node tmpnode=root;
while(true){		
		if(vc<tmpNode.getVal()){
			if(tmpNode.getLeftNode()==null){
				tmpNode.addLeftNode(vc);
				break;
			}else{
				tmpNode=tmpNode.getLeftNode();
				continue;
			}
			else{
				if(tmpNode.getRightNode()==null){
					tmpNode.addRightNode(vc);
					break;
				}
				else{
					tmpNode=tmpNode.geRIghtNode();
					continue;
				}
			}
			}
	
		public void inOrder(Node node){
			if(node.getLeftNode()!=null){
				inOrder(node.getLeftNode());
			}
			System.out.print(node.getVal()+" ");
			if(node.getRightNode()!=null){
				inOrder(node.getRightNode());
			}
		}
		
		
}
}
	class Node {
		private String Node, left, right;
		private float data;

		public Node(float val) {
			this.data = val;
			this.left = null;
			this.right = null;
		}

		public float getVal() {
			return this.data;
		}

		public float getLeftNode() {
			return this.left;
		}

		public float getRightNode() {
			return this.right;
		}

		public void addLeftNode(float vc) {
			this.left = newNode(vc);
		}

		public void addRightNode(float vc) {
			this.right = newNode(vc);
		}
	}

	}


