public class Main {
    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7, 9};

        Pesquisa pesquisa = new Pesquisa();

        System.out.println(pesquisa.pesquisaBinaria(lista, 3));
        System.out.println(pesquisa.pesquisaBinaria(lista, -1));


    }
}