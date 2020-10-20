package br.com.homework.accenture.academia.vendaCarros.entity;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Intern extends Employee implements Negotiate {

    public Intern() {
        setJob("Intern");
        setName("Ioury Naimeson (Estagiario)");
    }

    @Override
    public void negotiate(Client client, Car car) {
        Manager manager = new Manager();
        System.out.printf("\n%s: Eai mano %s! SEJA BEM VINDO /o/\n",
                this.getName(), client.getName());
        System.out.printf("%s: Fala direito moleque!\n", manager.getName());
        System.out.printf("%s: Desculpa ... minha primeira venda ta ligado? hmm .. %s %s? " +
                        "To ligado, imagino varias utilidades pra um desses!\n",
                this.getName(), car.getBrand(), car.getModel());
        if (client.isPcD()) {
            System.out.printf("%s: E sem taxas de IPI para voce!\n",
                    this.getName());
            System.out.printf("%s: O valor do veiculo sera de %.2f...certo?\n",
                    this.getName(), car.getPrice());
            System.out.printf("%s: vai moleque, manda bala!", manager.getName());
        } else {
            car.setPrice(15000 * 1.15);
            System.out.printf("%s: E importante saber que alem do valor base de nossos veiculos, " +
                    "voce precisa pagar a IPI, totalizando %.2f \n", this.getName(), car.getPrice());
        }
        System.out.printf("%s: Muito bem! Gostaria de dar continuidade ao nosso processo de compra?\n",
                this.getName());
        try {
            Scanner scanner = new Scanner(System.in);
            var escolha = scanner.nextLine();
            if (escolha.equalsIgnoreCase("sim")) {
                System.out.printf("%s: Otima escolha! A seguir irei te mostrar as opcoes de pagamento: \n",
                        this.getName());
                System.out.printf("%s: E a vista temos um desconto de 10 porcento do valor total: %.2f\n",
                        manager.getName(), car.getPrice() * 0.90);
                System.out.printf("%s: Caso seja do seu interesse, podemos tambem parcelar o valor com um " +
                        "juros de 1.89 porcento ao mes!\n", this.getName());
                System.out.printf("%s: Voce gostaria de parcelar o valor?\n", this.getName());
                escolha = scanner.nextLine();
                if (escolha.equalsIgnoreCase("sim")) {
                    System.out.printf("%s: Aqui esta uma lista de valores!\n", this.getName());

                    var backupValor = car.getPrice();
                    calculate(24, car);
                    car.setPrice(backupValor);

                    System.out.printf("\n%s: Em quantas vezes?", this.getName());
                    int parcelas = scanner.nextInt();

                    for (int i = 2; i <= parcelas; i++) {
                        var alteracao = car.getPrice();
                        alteracao *= 1.0189;
                        car.setPrice(alteracao);
                    }

                    System.out.printf("%s: Voce vai pagar %.2f em %d parcelas de %.2f\n",
                            this.getName(), car.getPrice(), parcelas, car.getPrice() / parcelas);
                } else {
                    System.out.printf("%s: Bem, entao a vista o valor sera de %.2f",
                            this.getName(), car.getPrice() * 0.90);
                    System.out.printf("%s: Preciso apenas validar a compra no sistema, aguarde...",
                            manager.getName());
                    validadePassword(manager.password);
                    System.out.printf("%s: Agradecemos pela preferencia e aproveite seu novo carro!",
                            this.getName());                }
            } else {
                System.out.println("Uma pena que nao podemos dar continuidade ...");
                System.out.println("Caso mude de ideia, basta voltar em nossa loja!");
            }
        } catch (NoSuchElementException e) {
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
                    i, car.getPrice() / i, car.getPrice());
        }
    }

    public void validadePassword(String password) {
        if (password.equals("1q2w3e9o0p")) {
            System.out.println("acesso verificado!");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
