import java.util.Scanner;

public class FormasPagamento {

    public static void main(String[] args) {

        int escolhaProduto;
        String nomeCliente;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, caro cliente. Seja bem-vindo(a) a nossa loja!");
        System.out.println("Por qual nome você gostaria de ser tratado?");
        System.out.print("Seu nome: ");
        nomeCliente = leitor.nextLine();

        System.out.println("Excelente! " + nomeCliente + " é um prazer ter sua presença conosco!");
        System.out.println("Temos os seguintes produtos em nossa loja, escolha uma opção.");
        System.out.println("1 - Smartwach .. R$300 ");
        System.out.println("2 - SSD M.2 NVMe480GB .. R$500 ");
        System.out.println("3 - Notebook Dell .. R$3500,88 ");
        System.out.println("4 - Bicicleta Mountain Bike .. R$750 ");
        System.out.println("5 - Asus Max PRO M2 .. R$1580,99 ");

        escolhaProduto = leitor.nextInt();

        //usando o laço while para tratar da escolha errada e força o usuário a utilizar uma opção válida
        while(escolhaProduto>5 || escolhaProduto<=0){
            System.out.println("OPÇÃO INVÁLIDA!");
            System.out.println("Escolha uma opção válida: (1 a 5)");
            escolhaProduto = leitor.nextInt();
        }
            produto(escolhaProduto);
    }

    //função para tratar a escolha do produto
    static void produto(int escolha){
        int formaPagamento;

        Scanner leitor = new Scanner(System.in);

        switch (escolha){
            case 1:
                System.out.println("1 - Smartwach .. R$300 ");

                System.out.println("Escolha a melhor forma de pagamento");
                System.out.println("1 - À vista");
                System.out.println("2 - À prazo em 3x, 5x ou 8x no cartão");
                formaPagamento = leitor.nextInt();

                while(formaPagamento>2 || formaPagamento<=0){
                    System.out.println("Forma de pagamento inválida!");
                    System.out.println("Escolha a melhor forma de pagamento");
                    System.out.println("1 - À vista");
                    System.out.println("2 - À prazo em 3x, 5x ou 8x no cartão");
                    formaPagamento = leitor.nextInt();
                }

                pagamento(formaPagamento, escolha);
                break;

            case 2:
                System.out.println("2 - SSD M.2 NVMe480GB .. R$500 ");

                System.out.println("Escolha a melhor forma de pagamento");
                System.out.println("1 - À vista");
                System.out.println("2 - À prazo em 3x, 5x ou 8x no cartão");
                formaPagamento = leitor.nextInt();

                while(formaPagamento>2 || formaPagamento<=0){
                    System.out.println("Forma de pagamento inválida!");
                    System.out.println("Escolha a melhor forma de pagamento");
                    System.out.println("1 - À vista");
                    System.out.println("2 - À prazo em 3x, 5x ou 8x no cartão");
                    formaPagamento = leitor.nextInt();
                }

                pagamento(formaPagamento, escolha);
                break;

            case 3:
                System.out.println("3 - Notebook Dell .. R$3500,88 ");

                System.out.println("Escolha a melhor forma de pagamento");
                System.out.println("1 - À vista");
                System.out.println("2 - À prazo em 3x, 5x ou 8x no cartão");
                formaPagamento = leitor.nextInt();

                while(formaPagamento>2 || formaPagamento<=0){
                    System.out.println("Forma de pagamento inválida!");
                    System.out.println("Escolha a melhor forma de pagamento");
                    System.out.println("1 - À vista");
                    System.out.println("2 - À prazo em 3x, 5x ou 8x no cartão");
                    formaPagamento = leitor.nextInt();
                }

                pagamento(formaPagamento, escolha);
                break;

            case 4:
                System.out.println("4 - Bicicleta Mountain Bike .. R$750 ");

                System.out.println("Escolha a melhor forma de pagamento");
                System.out.println("1 - À vista");
                System.out.println("2 - À prazo em 3x, 5x ou 8x no cartão");
                formaPagamento = leitor.nextInt();

                while(formaPagamento>2 || formaPagamento<=0){
                    System.out.println("Forma de pagamento inválida!");
                    System.out.println("Escolha a melhor forma de pagamento");
                    System.out.println("1 - À vista");
                    System.out.println("2 - À prazo em 3x, 5x ou 8x no cartão");
                    formaPagamento = leitor.nextInt();
                }

                pagamento(formaPagamento, escolha);
                break;

            case 5:
                System.out.println("5 - Asus Max PRO M2 .. R$1580,99 ");

                System.out.println("Escolha a melhor forma de pagamento");
                System.out.println("1 - À vista");
                System.out.println("2 - À prazo em 3x, 5x ou 8x no cartão");
                formaPagamento = leitor.nextInt();

                while(formaPagamento>2 || formaPagamento<=0){
                    System.out.println("Forma de pagamento inválida!");
                    System.out.println("Escolha a melhor forma de pagamento");
                    System.out.println("1 - À vista");
                    System.out.println("2 - À prazo em 3x, 5x ou 8x no cartão");
                    formaPagamento = leitor.nextInt();
                }

                pagamento(formaPagamento, escolha);
                break;

            default:
                System.out.println("OPÇÃO INVÁLIDA!");
        }

    }


    //função para tratar a forma de pagamento
    static void pagamento(int opPag, int escolhaProduto){
        double[] valorProduto = {300, 500, 3500.88, 750, 1580.99};
        double pagamentoProduto, valoProdutoAcrescimo, parcelamento;
        int parcelas;
        Scanner numParc = new Scanner(System.in);
        Scanner valorPago = new Scanner(System.in);
        switch (opPag){
            case 1:
                System.out.println("Pagamento À VISTA escolhido.");
                System.out.println("O valor a ser pago é de R$"+valorProduto[escolhaProduto - 1]+" reais.");
                System.out.print("Informe o valor de pagamento: ");
                pagamentoProduto = valorPago.nextDouble();

                if(valorProduto[escolhaProduto - 1] < pagamentoProduto){
                    System.out.println("Pagamento efetuado com sucesso");
                    System.out.println("Seu troco é de R$ "+(pagamentoProduto - valorProduto[escolhaProduto - 1]));
                } else if(valorProduto[escolhaProduto - 1] > pagamentoProduto){
                    System.out.println("O valor entregue é inferior ao valor do produto.");
                    System.out.println("Está faltando R$"+(Math.ceil(valorProduto[escolhaProduto - 1]) - pagamentoProduto));
                } else {
                    System.out.println("Pagamento efetuado com sucesso");
                }

                break;
            case 2:
                System.out.println("Pagamento À PRAZO escolhido.");
                System.out.print("Informe o número de parcelas (3x, 5x ou 8x): ");
                parcelas = numParc.nextInt();

                final double v = valorProduto[escolhaProduto - 1] + (valorProduto[escolhaProduto - 1] * 0.15);
                
                if(parcelas == 3){
                    valoProdutoAcrescimo = v;
                    System.out.println("Parcelamento em 3x!");
                    System.out.println("O valor do produto é de R$"+valorProduto[escolhaProduto - 1]+" reais.");
                    System.out.println("Com o parcelamento de 3x vai para R$"+valoProdutoAcrescimo);
                    parcelamento = valoProdutoAcrescimo / 3;
                    System.out.println("Cada parcela será de R$"+parcelamento);
                } else if(parcelas == 5){
                    valoProdutoAcrescimo = v;
                    System.out.println("Parcelamento em 5x!");
                    System.out.println("O valor do produto é de R$"+valorProduto[escolhaProduto - 1]+" reais.");
                    System.out.println("Com o parcelamento de 5x vai para R$"+valoProdutoAcrescimo);
                    parcelamento = valoProdutoAcrescimo / 5;
                    System.out.println("Cada parcela será de R$"+parcelamento);
                } else if(parcelas == 8){
                    valoProdutoAcrescimo = v;
                    System.out.println("Parcelamento em 8x!");
                    System.out.println("O valor do produto é de R$"+valorProduto[escolhaProduto - 1]+" reais.");
                    System.out.println("Com o parcelamento de 8x vai para R$"+valoProdutoAcrescimo);
                    parcelamento = valoProdutoAcrescimo / 8;
                    System.out.println("Cada parcela será de R$"+parcelamento);
                } else {
                    System.out.println("Parcelamento inválido!");
                }

                break;

            default:
                System.out.println("Forma de pagamento inválida!");
        }

    }




}
