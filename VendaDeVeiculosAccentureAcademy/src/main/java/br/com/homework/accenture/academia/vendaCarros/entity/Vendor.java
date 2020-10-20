package br.com.homework.accenture.academia.vendaCarros.entity;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Vendor extends Employee implements Negotiate {

    public Vendor() {
        setName("Edunalmerson Jr");
        setJob("Vendor");
    }

    @Override
    public void negotiate(Client client, Car car) {
        System.out.printf("\nOla %s! Vejo que ja escolheu o carro dos seus sonhos!\n", client.getName());
        System.out.printf("Um %s %s ... certamente voce tem bom gosto!\n", car.getBrand(), car.getModel());
        System.out.println("Com esse carro voce poderia trabalhar como Uber, Uber eats...");
        System.out.println("Mas tenha certeza que este veiculo sera seu companheiro fiel!");
        if (client.isPcD()){
            System.out.println("E nao cobramos taxas de IPI para voce! Apenas sucesso!");
            System.out.printf("O valor do veiculo sera de %.2f\n", car.getPrice());
        } else {
            car.setPrice(15000 * 1.15);
            System.out.printf("E importante saber que alem do valor base de nossos veiculos, " +
                    "voce precisa pagar a IPI, totalizando %.2f \n", car.getPrice());
        }
        System.out.println("Muito bem! Gostaria de dar continuidade ao nosso processo de compra?");
        try {
            Scanner scanner = new Scanner(System.in);
            var escolha = scanner.nextLine();
            if (escolha.equalsIgnoreCase("sim")){
                System.out.println("Otima escolha! A seguir irei te mostrar as opcoes de pagamento: ");
                System.out.printf("A vista temos um desconto de 10 porcento do valor total: %.2f\n",
                        car.getPrice() * 0.90);
                System.out.println("Caso seja do seu interesse, podemos tambem parcelar o valor com um juros de 1.89 porcento ao mes!");
                System.out.println("Voce gostaria de parcelar o valor?");
                escolha = scanner.nextLine();
                if (escolha.equalsIgnoreCase("sim")){
                    System.out.println("Aqui esta uma lista de valores");

                    var backupValor = car.getPrice();
                    calculate(24, car);
                    car.setPrice(backupValor);

                    System.out.println("\nEm quantas vezes?");
                    int parcelas = scanner.nextInt();

                    for (int i = 2; i <= parcelas; i++) {
                        var alteracao = car.getPrice();
                        alteracao *= 1.0189;
                        car.setPrice(alteracao);
                    }

                    System.out.printf("Voce vai pagar %.2f em %d parcelas de %.2f\n",
                            car.getPrice(), parcelas, car.getPrice()/parcelas );
                } else {
                    System.out.printf("Bem, entao a vista o valor sera de %.2f", car.getPrice() * 0.90);
                    System.out.println("Agradecemos pela preferencia e aproveite seu novo carro!");
                }
            } else {
                System.out.println("Uma pena que nao podemos dar continuidade ...");
                System.out.println("Caso mude de ideia, basta voltar em nossa loja!");
            }
        } catch (NoSuchElementException e){
            System.out.println("ATENCAO, CLIENTE SAIU CORRENDO!");
        }
    }

    @Override
    public void calculate(int parcelas, Car car) {
        for (int i = 2; i < parcelas; i++) {
            var alteracao = car.getPrice();
            alteracao *= 1.0189;
            car.setPrice(alteracao);
            System.out.printf("Em %dx: de %.2f\t Total: %.2f\n",
                    i, car.getPrice()/i, car.getPrice());
        }
    }
}
