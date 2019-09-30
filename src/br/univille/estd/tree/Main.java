package br.univille.estd.tree;


public class Main {
	
	public static void main(String[] args) {
Tree<File> tree = new Tree<>();
		
		File file0 = new File(false);
		file0.setName("C:/");
		file0.setSize(1.0);
		
		File file5 = new File(false);
		file5.setName("Trabalho");
		file5.setSize(1.0);
		
		File file = new File();
		file.setName("Trabalho do edson.pdf");
		file.setSize(2.0);
		
		File file2 = new File();
		file2.setName("Trabalho do leanderson.pdf");
		file2.setSize(2.0);
		
		File file3 = new File();
		file3.setName("Trabalho do paulo.pdf");
		file3.setSize(2.0);
		
		File file4 = new File();
		file4.setName("Trabalho do cidral.pdf");
		file4.setSize(2.0);
		
		Position<File> root = tree.addRoot(file0);
		
		Position<File> child1 = tree.addChild(root, file5);
		tree.addChild(child1, file2);
		tree.addChild(child1, file);
		tree.addChild(child1, file3);
		tree.addChild(child1, file4);
		
		
		System.out.println(TreeUtils.toStringPostOrderNameAndSize(tree, root));
		
	}

}
