package br.univille.estd.tree;

import java.util.Iterator;

public class TreeUtils {
	
	public static <E> int depth(Tree<E> T, Position<E> v) {
		return -1;
	}
	
	public static <E> int height(Tree<E> T, Position<E> v) {
		return -1;
	}
	
	public static <E> String toStringPreOrder(Tree<E> T, Position<E> v) {
		return null;
	}
	
	public static String toStringPostOrder(Tree<File> T, Position<File> v) {
		StringBuilder str = new StringBuilder();
		Iterator<Position<File>> iterado = T.children(v);
		while(iterado.hasNext()) {
			String s = toStringPostOrder(T,iterado.next());
			str.append(s);
		}
		str.append(v.getElement().getName());
		str.append("-");
		return str.toString();
	}
	
	public static double calculateTotalSize(Tree<File> T, Position<File> v) {
		double sum = 0;
		Iterator<Position<File>> iterado = T.children(v);
		while(iterado.hasNext()) {
			double s = calculateTotalSize(T,iterado.next());
			sum = s + sum;
		}
		sum = sum + v.getElement().getSize();
		return sum;
	}
	
	public static String toStringPostOrderNameAndSize(Tree<File> T, Position<File> v) {
		StringBuilder str = new StringBuilder();
		Iterator<Position<File>> iterado = T.children(v);
		while(iterado.hasNext()) {
			String s = toStringPostOrderNameAndSize(T,iterado.next());
			str.append(s);
		}
		
		str.append(v.getElement().getName());
		str.append(String.valueOf(v.getElement().getSize()));
		str.append("|");
		return str.toString();
	}
	
}
