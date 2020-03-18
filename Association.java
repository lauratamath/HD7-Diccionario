/**
*@author: Laura Tamath
*@since 17/02/2020
*@version 17/02/2020
*referencias: Java Structures, en el capítulo 12 
**/
public class Association<K, V>{
	private K key;
	private V  value; 

	public Association(K key, V value){
		/**
		pre: se instancia el objeto
		post: se crea un objeto de tipo association
		**/
		this.key = key;
		this.value = value;
	}

	public K getKey(){
		/**
		pre: Conseguir el valor de la llave
		post: devuelve es valor de la llave
		**/
		return this.key;
	}

	public V getValue(){
		/**
		pre: Conseguir el valor del dato
		post: devulve el valor del dato
		**/
		return this.value;
	}
}