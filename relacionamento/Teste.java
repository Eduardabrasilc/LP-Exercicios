public class Teste {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Mari", "(11)995338646");
        Contato contato02 = new Contato("Gui", "(11)999555789");
        Contato contato03 = new Contato("Ju", "(11)999999999");

        Grupo grupo01 = new Grupo("Trabalho");
        Grupo grupo02 = new Grupo("Amigos");

        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);

        grupo02.adicionar(contato03);
        grupo02.adicionar(contato01);

//        System.out.println(grupo01);
//        System.out.println(grupo02);

        grupo01.exibirContatos();
        System.out.println(grupo01.existePorNome("Mari"));
    }
}
