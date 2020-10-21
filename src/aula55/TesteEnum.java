package aula55;

import aula54.DiaSemana;

public class TesteEnum {
    public static void testeEnum() {
        aula54.DiaSemana[] dias = aula54.DiaSemana.values();
        
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
        
        for (DiaSemana dia : dias) {
            System.out.println(dia);
        }
        
    }
}
