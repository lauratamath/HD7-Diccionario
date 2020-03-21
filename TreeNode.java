/**
*@author: Laura Tamath
*@since 17/02/2020
*@version 17/02/2020
*referencias: Java Structures, en el capítulo 12 
**/

public class TreeNode<E>{
    private Association<String, String> value;
	private E datos;
	private TreeNode<E> p, dere, izq;

	public TreeNode(String ingles, String espanol){
		/**
        pre: intancia un nodo con un valor y dos hijos
        post: delvuelve un arbol con dos referencias
        **/
		value = new Association<>(ingles, espanol);
        p=null;
        izq = dere =null;
	}

    //Sets y gets

    public Association<String, String> getValue(){
        /**
        pre: Obtiene el valor del contenido en el nodo
        post: devulve la palabra en espanol
        **/
        return value;
    }

    public String getKey(){
        //Retorna la palabra en ingles
        return value.getKey();
    }

    public String getEspa(){
        //retorna la palabra en espanol
        return value.tvalue;
    }

    public TreeNode<E> getParent(){
        //retorna padres
        return p;
    }
    public void setParent(TreeNode<E> newp){
        //brinda referencia a padre.
        p = newp;
    }

    public TreeNode<E> getDere(){
        //retorna la referencia a hiijo derecho
        return dere;
    }
    public void setDere(TreeNode<E> dere){
        //brinda referencia a hijo derecho.
        this.dere=dere;
    }

    public TreeNode<E> getIzq(){
         //retorna la referencia a hiijo izquierdo
        return izq; 
    }
    public void setIzq(TreeNode<E> izq){
        //brinda referencia a hijo izquierdo.
        this.izq = izq;
    }

    //para buscar la plabra en el arbol
    public String buscar(String value){
        if(value.equals(this.value.getKey())){
            return this.value.tvalue;
        }else if(value.compareTo(this.value.getKey())<0){
            if(izq == null){
                return "* "+ value + " *";
            }else{
                return izq.buscar(value);
            }
        }else if(value.compareTo(this.value.getKey())>0){
            if(dere == null){
                return "* "+ value + " *";
            }else{
                return dere.buscar(value);
            }
        }

        return "* "+ value + " *";
    }

    @Override
    public String toString(){
        String texto = "(" + value.tkey + "," + value.tvalue + ")\n";
        return texto;
    }
}


   