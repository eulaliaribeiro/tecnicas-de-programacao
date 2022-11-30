package br.com.ada.tecnicasdeprogramacao.lambdas.test;


public class LambdaTest {
    // anonima    // função, já que não está associado a nenhuma classe
    // passada por ai    // concisa
    // (Carro carro) -> carro.getCor().equals("verde");
    // parâmetros   seta      corpo
    // (String s) -> s.length();
    // (int a, int b) -> {sout(a+b)}
    // só pode utilizar as lambdas em interfaces funcionais

    public static void main(String[] args) {
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };
        CarroPredicate carroPredicate1 = (Carro carro) ->  carro.getCor().equals("azul");
        System.out.println(carroPredicate.test(new Carro("azul", 2016)));
        System.out.println(carroPredicate1.test(new Carro("verde", 2016)));

        Runnable runnable = () -> System.out.println("Dentro do run");
        runnable.run();

    }
}
