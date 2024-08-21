import java.util.Scanner;

/*
 * Objetivo do programa é disponibilzar uma aplicação onde o usuário possa acompanhar sua poupança
 * O usuário define um valor que deseja obter no futuro e assim acompanhar o progresso dos seus aportes
 */
 
public class MinhaPoupanca {
    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);

        // Declarando váriaveis

        int userInput, waitingTime;
        double savingGoal, resultDivision, addedValue, valueInput,valueTaken;
            
        // Iniciando a variável
        savingGoal = 0;
        addedValue = 0;

        while (true) {
            
            // Iniciando 
            System.out.println("==================================");
            System.out.println("            Poupança              ");
            System.out.println("==================================");
            // 
                
            // Menu
            System.out.println("---------------MENU---------------");
            System.out.println(" \n [1] Primeiro deposito \n [2] Depositar \n [3] Sacar \n [4] Saldo \n [5] Sair \n"); 
            System.out.print("--> ");
            userInput= scanner.nextInt();
            System.out.println("__________________________________");
            // 
            
            // Verificando entrada do usuário
            if(userInput != 1 && userInput !=2 && userInput !=3 && userInput !=4 && userInput !=5){
                System.out.println("Entrada inválida");
                break;
            }

            // Entrando nas condicionais
            
            if(userInput == 1){
                // 
                System.out.println("\n--------Primeiro deposito---------");
                System.out.print("\nValor a ser poupado --> ");
                savingGoal = scanner.nextDouble();
                System.out.println("\nValor Definido!");
                // 
                System.out.println("\n__________________________________");
                System.out.println("\nEm quanto tempo deseja obter esse valor ?");
                System.out.print("--> ");
                // 
                waitingTime = scanner.nextInt();
                resultDivision = savingGoal/waitingTime;
                // 
                System.out.println("Para atingir seu objetivo você precisa depositar todo mês --> " + resultDivision + " " +  "R$");
                System.out.println("__________________________________"); 
           
            }else if(userInput == 2){
                System.out.println("____________Depositar_____________");
                System.out.print("\nValor -->");
                valueInput = scanner.nextDouble();
                addedValue = addedValue + valueInput;
                System.out.println("Deposito no valor de --> " + valueInput + " " + "Realizado!");
            
            }else if(userInput == 3){
               
                // 
                System.out.println("______________Saque_______________");
                System.out.print("Sacar --> ");
                valueTaken = scanner.nextDouble();
                //    
                
                // Verifica se o usuário tem saldo
                if (valueTaken >= addedValue) { 
                    System.out.println("Saldo insuficiente!");
                    break;    
                }else
                // 
                // 
                System.out.println("Valor disponivel");
                addedValue = addedValue - valueTaken;
                System.out.println("Seu novo saldo é --> " + addedValue + " " + "R$");
                // 

            }else if(userInput == 4){
                System.out.println("______________Saldo_______________");
                System.out.println("\nSeu saldo é --> "+ addedValue + " " + "R$");
            
            }else if (userInput == 5) {
                System.err.println("Saindo...");
                break;
            }else{
                System.out.println("Entrada Inválida, tente novamente!");
            }
                
            //  Condicão para encerrar / verificar se atingiu a meta
            if (addedValue == savingGoal) {
                System.out.println("\n_________________________________");
                System.out.println("         Valor atingido!           ");
                System.out.println("Você atingiu sua meta --> " + addedValue + " " + "R$");
                System.out.println("__________________________________");
                break;
            }
                
        }        
    }
}

