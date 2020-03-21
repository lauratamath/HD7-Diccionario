/**
*@author: Laura Tamath
*@since 17/02/2020
*@version 17/02/2020
*referencias: Java Structures, en el capítulo 12 
**/
public class JUnit{
	@Test
	public void insertTest(){
		System.out.printl("Inserte teset");
		TreeNode<Association<String, String>> newN;
		BinaryTree<TreeNode<Association<String, String>>> bin = new BinaryTree<>();

		newN = new TreeNode<>("YO" ,"ELLOS");
		bin.insetar(newN);

		TreeNode hola = bin.getRoot();
		String esperado = "(YO, ELLOS)";
		if (hola != null){

		}else{
			assertEquals(esperado, hola);
		}
	}

	@Test
	public void searchTest(){
		System.out.printl("Buscando test");

		TreeNode<Association<String, String>> newN;
		BinaryTree<TreeNode<Association<String, String>>> bin = new BinaryTree<>();
		newN = new TreeNode<>("YO","ELLOS");
		bin.insetar(newN);
		String hola = bin.buscar("I");
		String esperado ="YO";

		assertEquals(esperado, hola);
	}

}