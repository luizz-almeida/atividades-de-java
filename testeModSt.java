package estudos.testes;

import estudos.ModificadoresEstaticos.Carro;

public class testeModSt {
    public static void main(String[] args) {
        Carro c1 = new Carro("ferrari", 250);
        Carro c2 = new Carro("BMW", 250);
        Carro c3 = new Carro("Porche", 250);

        // c1.setSpeedlm(190); essa é a forma errada de se usar
        Carro.setSpeedlm(190);// essa é a forma correta mesmo a outra funcionar
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
