import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = leitura.nextLine();
        conta.setAgencia(agencia);

        System.out.println("Por favor, digite o nome do Cliente:");
        String nome = leitura.nextLine();
        conta.setNomeCliente(nome);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = leitura.nextInt();
        conta.setNumero(numero);

        System.out.println("Por favor, digite o valor do Saldo:");
        double saldo = leitura.nextDouble();
        conta.setSaldo(saldo);

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");

        leitura.close();
    }
}

