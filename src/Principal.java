public class Principal {

    public static void main(String[] args) {
        
        System.out.println("\n# AULA 01\n");
        
        usandoConstantes();
        usandoEnum();
        
        System.out.println("\n# AULA 02\n");
        
        aula54.DiaSemana dia = aula54.DiaSemana.SEGUNDA;
        System.out.println(dia.toString() + " - " + dia.getValor());
        aula54.Data data = new aula54.Data(1, 4, 2016, aula54.DiaSemana.SEXTA);
        aula54.Formulario formulario = new aula54.Formulario("Mateus", "m");
        System.out.println(formulario.toString());
        
        System.out.println("\n# AULA 03\n");
        
        aula55.TesteEnum.testeEnum();
        aula55.TesteEnum2.testeEnum();
        
        System.out.println("\n# AULA 04\n");
        
        for (aula56.TipoDocumento doc : aula56.TipoDocumento.values()) {
            System.out.println(doc + " - " + doc.geraNumeroTeste());
        }
        
        aula56.Pessoa pf = new aula56.Pessoa();
        pf.setTipoDocumento(Enum.valueOf(aula56.TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
        System.out.println(pf);
        
        aula56.Pessoa pj = new aula56.Pessoa();
        pj.setTipoDocumento(Enum.valueOf(aula56.TipoDocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
        System.out.println(pj);
        
    }

    private static void usandoConstantes() {
        int segunda = aula53.DiaSemanaConstantes.SEGUNDA;
        int terca = aula53.DiaSemanaConstantes.TERCA;
        int quarta = aula53.DiaSemanaConstantes.QUARTA;
        int quinta = aula53.DiaSemanaConstantes.QUINTA;
        int sexta = aula53.DiaSemanaConstantes.SEXTA;
        int sabado = aula53.DiaSemanaConstantes.SABADO;
        int domingo = aula53.DiaSemanaConstantes.DOMINGO;
        System.out.println("Teste utilizando constantes no Java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
    
    private static void imprimeDiaSemana(aula53.DiaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }
    
    private static void usandoEnum() {
        aula53.DiaSemana segunda = aula53.DiaSemana.SEGUNDA;
        aula53.DiaSemana terca = aula53.DiaSemana.TERCA;
        aula53.DiaSemana quarta = aula53.DiaSemana.QUARTA;
        aula53.DiaSemana quinta = aula53.DiaSemana.QUINTA;
        aula53.DiaSemana sexta = aula53.DiaSemana.SEXTA;
        aula53.DiaSemana sabado = aula53.DiaSemana.SABADO;
        aula53.DiaSemana domingo = aula53.DiaSemana.DOMINGO;
        System.out.println("Teste utilizando enum no Java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }
}
