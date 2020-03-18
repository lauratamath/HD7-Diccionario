/**
*@author: Laura Tamath
*@since 17/02/2020
*@version 17/02/2020
*referencias: Java Structures, en el capítulo 12 
**/
public interface ComparableInterface<T>{
	public int CompareTo(T that);
	/**
	pre: compara dos elementos
	post: devulve + si es mayor, 0 si es igual y - si es menor
	**/
}