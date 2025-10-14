
public class Pesquisa {

    public int pesquisa_binaria(int[] lista, int item){
        int baixo = 0; // baixo inicia valendo 0
                        // Após o primeiro loop, baixo continua valendo 0
                        // Após o segundo loop, baixo vale passa a valer 1
        int alto = lista.length -1; // alto inicia valendo 4, após o primeiro loop, alto vale 1
                                    // após o segundo loop, alto continua valendo 1
        while(baixo <= alto){
            int meio = (baixo + alto) / 2; // No primeiro loop, meio vale 2, no segundo loop, meio vale 0 Obs: (0+1) / 2 = 0.5, mas por ser do tipo int o valor é arredondado para baixo
                                            // No terceiro loop, meio vale 1
            int chute = lista[meio]; // No primeiro loop, chute vale 5, no segundo loop, chute vale 1
                                    // No terceiro loop, chute vale 3
            if(chute == item){ // No primeiro lopp, 5 é igual 3? Não. Então não retorna a posição 2
                                // No segundo loop, 1 é igual a 3? Não. Então não retorna a posição 0
                                // No terceiro loop, 3 é igual a 3? Sim. Então retorna a posição 1
                return meio;
            } else if (chute > item){ // No primeiro loop, 5 é maior que 3? Sim. Então alto (que vale 4) recebe meio (que vale 2) - 1, ou seja, alto passa a valer 1
                                        // No segundo loop, 1 é maior que 3? Não. Então não executa o bloco
                                        // No terceiro loop, não será executado
                alto = meio - 1;
            }  else {
                baixo = meio + 1; // No primeiro loop, não será executado
                                    // No segundo loop, baixo passa a valer 1
                                    // No terceiro loop, não será executado
            }
        }
        return -1;
    }

}




