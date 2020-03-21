/**
*@author: Laura Tamath
*@since 17/02/2020
*@version 18/02/2020
*referencias: Java Structures, en el capítulo 12 
* https://www.youtube.com/watch?v=ZKnwBJ8q2TE&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=34
* https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
**/

public class BinaryTree<E>{
	private TreeNode root;

	public BinaryTree(){
		/**
		se genera un node vacio
		**/
		root = null; 
	}

	public void insertar(TreeNode newN){
		/**
		* @param newN representa el nuevo nodo
		* pre: Establece el punto de partida
		* post: Determina en donde se inserta el nuevo nodo
		**/
		root = insertR(root, newN);
	}

	public TreeNode getRoot(){
		//se le da un valor a la raiz
		return root;
	}

	public void orden(){
		/**
		pre: revisa los nodos
		post: compara cada uno
		**/
		ordenR(root);
	}

	public TreeNode insertR(TreeNode root, TreeNode nodo){
		/**
		pre: el root aun no tiene un vlaor establecido
		post: Se inserta el nodo en cierta posicion del arbol
		**/
		if(root == null){
			/**
			pre: arbol vacio
			post: se establece la raiz, representado como un nodo
			**/
			root = nodo;
			return root;
		}else if((root.getKey()).compareTo(nodo.getKey())>0){
			/**
			pre: El arbol no esta vacio
			post: Se busca un arbol correpodiente al nodo y
			se crea vinculo padre-hijo 
			**/
			root.setIzq(insertR(root.getIzq(), nodo));
			root.getIzq().setParent(root);
		}else if((root.getKey()).compareTo(nodo.getKey())<0){
			/**
			pre: El arbol no esta vacio
			post: Se busca un arbol correpodiente al nodo y
			se crea vinculo padre-hijo 
			**/
			root.setDere(insertR(root.getDere(), nodo));
			root.getDere().setParent(root);
		}
		return root;
	}

	public void ordenR(TreeNode root){
		if(root != null){
			ordenR(root.getIzq());
			System.out.println(root.toString());
			ordenR(root.getDere());
		}
	}

	public String buscar(String dato){
		/**
		pre: busca si la palabra existe en el diccionario
		post: retorna el resultado
		sino se encuentra muestra la palabra entre *
		y si se encuentra, muestra la traduccion
		**/
		if(root == null){
			return ("* " + dato + " *");
		}else{
			return root.buscar(dato);
		}
	}

}