package aula55;

public class TesteEnum2 {
    public static void testeEnum() {
        
        System.out.println(Enum.valueOf(aula54.DiaSemana.class, "DOMINGO"));
        
        aula54.DiaSemana dia = Enum.valueOf(aula54.DiaSemana.class, "DOMINGO");
        
        System.out.println(dia);
        
        
    }
}
