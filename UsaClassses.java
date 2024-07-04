public class UsaClassses {
    
    public static void main(String[] args) {
        //Pessoa p = new Pessoa ();
        Pessoa p;
        p = new Pessoa ();
        Pessoa p1 = new Pessoa();

        p.nome = "Yuri";
        p.idade = 25;
        p.renda = 1000;
        p.peso =  80;
        p.cpf = "123.123.123.23";

        System.out.println("cpf: " + p.cpf);
        System.out.println("peso: " + p.peso);
        System.out.println("Nome: " + p.nome);
        System.out.println("idade: " + p.idade);
        System.out.println("renda: " + p.renda);
    }
}
