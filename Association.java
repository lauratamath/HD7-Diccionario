/**
*@author: Laura Tamath
*@since 17/02/2020
*@version 18/02/2020
*referencias: Java Structures, en el capítulo 12 
**/
import java.util.Map;

public class Association<K, V> implements Map.Entry<K,V>{
	protected K tkey;
	protected V  tvalue; 

	public Association(K key, V value){
		/**
		pre: se instancia el objeto
		post: se crea un objeto de tipo association
		**/
		tkey = key;
		tvalue = value;
	}

	public Association(K key){
		/**
		pre: Key no es nulo
		post: Se construye un par key-value, el valor es nulo
		**/
		this(key, null);
	}

	public K getKey(){
		/**
		pre: Conseguir el valor de la llave
		post: devuelve es valor de la llave
		**/
		return tkey;
	}

	public V getValue(){
		/**
		pre: Conseguir el valor del dato
		post: devulve el valor del dato
		**/
		return tvalue;
	}

	public V setValue(V value){
		/**
		pre: establece el valor del par clave-valor.
        post establece el valor de la asociación en valor
		**/
		V old = tvalue;
		tvalue = value;
		return old;
	}
	
	public int hashCode(){
		/**
		post: Devuelve el valor de la asociacion 
		**/
		return getKey().hashCode();
	}	

	@Override
	public boolean equals(Object next){
		Association other = (Association)next;
		return getKey().equals(other.getKey());
	}

	
}