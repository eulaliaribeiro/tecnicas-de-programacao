package br.com.ada.tecnicasdeprogramacao.lambdas.test;

//interface com apenas um método abstrato: interface funcional
@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
    // (parâmetro) -> <expressão>
    // (Carro carro) -> carro.getCor().equals("verde")
}
