package aula56;

public enum TipoDocumento {
    CPF {
        @Override
        public String geraNumeroTeste() {
            GeraCpfCnpj geraCpf = new GeraCpfCnpj();
            return geraCpf.cpf();
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {
            GeraCpfCnpj geraCpf = new GeraCpfCnpj();
            return geraCpf.cnpj();
        }
    };
    
    public abstract String geraNumeroTeste();
}
