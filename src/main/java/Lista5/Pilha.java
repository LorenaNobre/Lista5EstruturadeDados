package Lista5;

public class Pilha {
    private static class Node {
        int valor;
        Node proximo;

        Node(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Node topo;
    private int tamanho;


    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }


    public void push(int valor) {
        Node novoNode = new Node(valor);
        novoNode.proximo = topo;
        topo = novoNode;
        tamanho++;
    }


    public int pop() {
        if (topo == null) {
            System.out.println("Pilha vazia! Não há elementos para remover.");
            return -1; // Indicando que a pilha está vazia
        }
        int valorRemovido = topo.valor;
        topo = topo.proximo;
        tamanho--;
        return valorRemovido;
    }


    public void exibir() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.print("Conteúdo da pilha: ");
        Node atual = topo;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }


    public int tamanho() {
        return tamanho;
    }


    public void limpar() {
        topo = null;
        tamanho = 0;
    }

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.push(5);
        pilha.push(10);
        pilha.push(15);

        pilha.exibir();

        System.out.println("Número de elementos na pilha: " + pilha.tamanho()); // 3

        pilha.pop();
        pilha.exibir();

        pilha.limpar();
        pilha.exibir(); 
    }
}

