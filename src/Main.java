//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7, 9};

        Pesquisa pesquisa = new Pesquisa();

        System.out.println(pesquisa.pesquisa_binaria(lista, 3));
        System.out.println(pesquisa.pesquisa_binaria(lista, -1));


    }
}