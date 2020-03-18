/**
*@author: Laura Tamath
*@since 17/02/2020
*@version 17/02/2020
*referencias: Java Structures, en el capítulo 12 
**/

public class TreeNode<E>{
	private E datos;
	private TreeNode<E> p, dere, izq;

	public TreeNode(){
		/**
		pre: Se intancia un nodo vacio
		post: Se crea un nodo vacio
		**/
		izq = dere = this;
		data = null;
		p = null;
	}

	public TreeNode(E newData) {
		/**
		pre: Se intancia un nuevo nodo
		post: Se crea un nuevo nodo
		**/
		datos = newData;
		setLeft(izq);
		setRight(dere);
		izq = dere =  new TreeNode<>();
	}

	 public TreeNode(E value, TreeNode<E> left, TreeNode<E> right){
	 	/**
	 	pre: intancia un nodo con un valor y dos hijos
	 	post: delvuelve un arbol con dos referencias
	 	**/

        data = value;

        if (left == null){
            left = new TreeNode<>();
        }
        setLeftSon(left);
        if (right == null){
            right = new TreeNode<>();
        }
        setRight(right);
    }
    public Boolean isEmpty(){
    	return (p == nul && dere == null && izq == null);
    }



    public TreeNode<E> getP(){
    	return p;
    }
    public void setP(TreeNode<E> newP){
    	p = newp;
    }


    public TreeNode<E> getRight(){
    	return dere;
    }
    public void setRight(TreeNode<E> newDere){
    	if (dere != null && dere.getP() == this){
    		dere.setP;
    	}
    	this.dere = newDere;
    	dere.setP(this); 
    }


    public TreeNode<E> getLeft(){
    	return izq;
    }
    public void setLeft(TreeNode<E> newIzq){
    	if(izq != null && izq.getP() == this){
    		izq.setP(null);
    	}
    	this.izq = newIzq;
    	izq.setP(this);
    }


    public E getData(){
    	return datos;
    }
    public void setData(E newData){
    	datos = newData;
    }

}