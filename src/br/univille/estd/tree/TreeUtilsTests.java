package br.univille.estd.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeUtilsTests {
	

	/**
	 * Calcula a profundidade da árvore
	 
	@Test
	public void profundidadeDaArvore() {
		Tree<File> tree = new Tree<>();
		
		Position<File> root = tree.addRoot(0);

		Position<File> child1 = tree.addChild(root, -1);
		tree.addChild(child1,-2);
		tree.addChild(child1, -3);
		
		Position<File> child2 = tree.addChild(root,  1);
		tree.addChild(child2, 2);
		
		Position<File> child3 = tree.addChild(child2, 3);
		
		Position<File> child4 = tree.addChild(child3, 4);

		assertEquals("Profundidade da raiz", 0, TreeUtils.depth(tree, root));
		assertEquals("Profundidade do filho", 1, TreeUtils.depth(tree, child1));
		assertEquals("Profundidade do neto", 2, TreeUtils.depth(tree, child3));
		assertEquals("Profundidade do bisneto", 3, TreeUtils.depth(tree, child4));
	}

	
	 * Calcula a altura da árvore
	 
	@Test
	public void alturaDaArvore() {
		Tree<File> tree = new Tree<>();
		
		Position<File> root = tree.addRoot(0);

		Position<File> child1 = tree.addChild(root, -1);
		tree.addChild(child1,-2);
		tree.addChild(child1, -3);
		
		Position<File> child2 = tree.addChild(root,  1);
		tree.addChild(child2, 2);
		
		Position<File> child3 = tree.addChild(child2, 3);
		
		Position<File> child4 = tree.addChild(child3, 4);
		
		assertEquals("Altura da árvore partindo da raiz", 3, TreeUtils.height(tree, root));
		assertEquals("Altura da árvore partindo do filho 1", 1, TreeUtils.height(tree, child1));
		assertEquals("Altura da árvore partindo do filho 2", 2, TreeUtils.height(tree, child2));
		assertEquals("Altura da árvore partindo do neto", 1, TreeUtils.height(tree, child3));
		assertEquals("Altura da árvore partindo do bisneto", 0, TreeUtils.height(tree, child4));
	}
	
	
	 * Convertendo a árvore para String utilizando preorder
	 
	@Test
	public void arvoreParaStringPreOrder() {
		Tree<File> tree = new Tree<>();
		
		Position<File> root = tree.addRoot(0);

		Position<File> child1 = tree.addChild(root, -1);
		tree.addChild(child1,-2);
		tree.addChild(child1, -3);
		
		Position<File> child2 = tree.addChild(root,  1);
		tree.addChild(child2, 2);
		
		Position<File> child3 = tree.addChild(child2, 3);
		
		Position<File> child4 = tree.addChild(child3, 4);
		
		assertEquals("String da árvore partindo da raiz",    "0, -1, -2, -3, 1, 2, 3, 4", TreeUtils.toStringPreOrder(tree, root));
		assertEquals("String da árvore partindo do filho 1", "-1, -2, -3", TreeUtils.toStringPreOrder(tree, child1));
		assertEquals("String da árvore partindo do filho 2", "1, 2, 3, 4", TreeUtils.toStringPreOrder(tree, child2));
		assertEquals("String da árvore partindo do neto",    "3, 4", TreeUtils.toStringPreOrder(tree, child3));
		assertEquals("String da árvore partindo do bisneto", "4", TreeUtils.toStringPreOrder(tree, child4));
	}
	*/
	/**
	 * Convertendo a árvore para String utilizando postorder
	 */
	@Test
	public void arvoreParaStringPostOrder() {
		Tree<File> tree = new Tree<>();
		
		File file0 = new File(false);
		file0.setName("C:/");
		
		File file5 = new File(false);
		file5.setName("Trabalho");
		
		File file = new File();
		file.setName("Trabalho do edson.pdf");
		
		File file2 = new File();
		file2.setName("Trabalho do leanderson.pdf");
		
		File file3 = new File();
		file3.setName("Trabalho do paulo.pdf");
		
		File file4 = new File();
		file4.setName("Trabalho do cidral.pdf");
		
		Position<File> root = tree.addRoot(file0);
		
		Position<File> child1 = tree.addChild(root, file5);
		tree.addChild(child1, file2);
		tree.addChild(child1, file);
		tree.addChild(child1, file3);
		tree.addChild(child1, file4);
		assertEquals("String da árvore partindo da raiz",    "Trabalho do leanderson.pdf-Trabalho do edson.pdf-Trabalho do paulo.pdf-Trabalho do cidral.pdf-Trabalho-C:/-", TreeUtils.toStringPostOrder(tree, root));
		//assertEquals("String da árvore partindo do filho 1", "C:/, Trabalho, Trabalho do leanderson.pdf", TreeUtils.toStringPostOrder(tree, child1));
	}
	
	@Test
	public void teste() {
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
		assertEquals("Tamanho total dos arquivos", 10.0, TreeUtils.calculateTotalSize(tree, root), 0.01);
		//assertEquals("String da árvore partindo do filho 1", "C:/, Trabalho, Trabalho do leanderson.pdf", TreeUtils.toStringPostOrder(tree, child1));
	}
}


