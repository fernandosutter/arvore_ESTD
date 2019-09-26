package br.univille.estd.tree;

public class File {
	
	private String name;
	private boolean isFile;
	private double size;
	
	public File() {
		this.isFile = true;
	}
	
	public File(boolean is_File) {
		this.isFile = is_File;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFile() {
		return isFile;
	}
	public void setFile(boolean isFile) {
		this.isFile = isFile;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
}
