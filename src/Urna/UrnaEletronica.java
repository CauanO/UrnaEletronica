package Urna;

import java.util.Scanner;

import java.util.Scanner;

public class UrnaEletronica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// DECLARAÇÃO DE VARIAVEIS
		int contCadastro = -1, 
			opcao, 
			voto, 
			contVotos = -1, 
			opcaoCadastro, 
			contNomeCadidado = 0, 
			votoNulo = 0,
			votarNovamente;

        // DECLARAÇÃO DE ARRAYS
		String[] cadidatos = new String[6];
		int[] contCadidatos = new int[6];

        // DECLARAÇÃO DO VOTO BRANCO
		cadidatos[0] = "BRANCO";

        // INICIO
		System.out.println("***************************************************************************************");
        System.out.println("                                  URNA ELETRONICA                                      ");
        System.out.println("****************************************************************************************");
		System.out.println("Deseja cadastrar os candidatos? \n 1 - Sim \n 2 - Não");
		opcaoCadastro = sc.nextInt();

        // CADASTRO DE CANDIDATOS
		if (opcaoCadastro == 1) {
			for (int i = 1; i < cadidatos.length; i++) {
				contNomeCadidado++;
				System.out.println("Nome do candidato " + contNomeCadidado);
				cadidatos[i] = sc.next();
			}
            
            // CONTABILIZAR OS VOTOS
			System.out.println("Deseja votar? \n 1 - Sim \n 2 - Não");
			opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.println("*******************************************************************************");
	            System.out.println("                             ESCOLHA UM CANDIDATO                             ");
	            System.out.println("*******************************************************************************");
				// CHAMADA DA CLASSE
                mostrarCandidatos(cadidatos, contVotos);
				do { // ( Inicio ) do Do - While para fazer a reptição dos votos.
				voto = sc.nextInt();
				switch (voto) {
				case 0:
					contCadidatos[0] += 1;
					System.out.println("Deseja votar novamente? \n 1 - Sim \n 2 - Não");
					votarNovamente = sc.nextInt();
					if (votarNovamente == 1) {
						System.out.println("*******************************************************************************");
			            System.out.println("                       ESCOLHA NOVAMENTE UM CANDIDATO                             ");
			            System.out.println("*******************************************************************************");
						mostrarCandidatos(cadidatos, contVotos);
					} else {
						mostrarDados(cadidatos, contCadidatos, votoNulo);
					}
					break;
				case 1:
					contCadidatos[1] += 1;
					System.out.println("Deseja votar novamente? \n 1 - Sim \n 2 - Não");
					votarNovamente = sc.nextInt();
					if (votarNovamente == 1) {
						System.out.println("*******************************************************************************");
			            System.out.println("                       ESCOLHA NOVAMENTE UM CANDIDATO                             ");
			            System.out.println("*******************************************************************************");
						mostrarCandidatos(cadidatos, contVotos);
					} else {
						mostrarDados(cadidatos, contCadidatos, votoNulo);
					}
					break;
				case 2:
					contCadidatos[2] += 1;
					System.out.println("Deseja votar novamente? \n 1 - Sim \n 2 - Não");
					votarNovamente = sc.nextInt();
					if (votarNovamente == 1) {
						System.out.println("*******************************************************************************");
			            System.out.println("                       ESCOLHA NOVAMENTE UM CANDIDATO                             ");
			            System.out.println("*******************************************************************************");
						mostrarCandidatos(cadidatos, contVotos);
					} else {
						mostrarDados(cadidatos, contCadidatos, votoNulo);
					}
					break;
				case 3:
					contCadidatos[3] += 1;
					System.out.println("Deseja votar novamente? \n 1 - Sim \n 2 - Não");
					votarNovamente = sc.nextInt();
					if (votarNovamente == 1) {
						System.out.println("*******************************************************************************");
			            System.out.println("                       ESCOLHA NOVAMENTE UM CANDIDATO                             ");
			            System.out.println("*******************************************************************************");
						mostrarCandidatos(cadidatos, contVotos);
					} else {
						mostrarDados(cadidatos, contCadidatos, votoNulo);
					}
					break;
				case 4:
					contCadidatos[4] += 1;
					System.out.println("Deseja votar novamente? \n 1 - Sim \n 2 - Não");
					votarNovamente = sc.nextInt();
					if (votarNovamente == 1) {
						System.out.println("*******************************************************************************");
			            System.out.println("                       ESCOLHA NOVAMENTE UM CANDIDATO                             ");
			            System.out.println("*******************************************************************************");
						mostrarCandidatos(cadidatos, contVotos);
					} else {
						mostrarDados(cadidatos, contCadidatos, votoNulo);
					}
					break;
				case 5:
					contCadidatos[5] += 1;
					System.out.println("Deseja votar novamente? \n 1 - Sim \n 2 - Não");
					votarNovamente = sc.nextInt();
					if (votarNovamente == 1) {
						System.out.println("*******************************************************************************");
			            System.out.println("                       ESCOLHA NOVAMENTE UM CANDIDATO                             ");
			            System.out.println("*******************************************************************************");
						mostrarCandidatos(cadidatos, contVotos);
					} else {
						mostrarDados(cadidatos, contCadidatos, votoNulo);
					}
					break;
				case 6:
					mostrarDados(cadidatos, contCadidatos, votoNulo);
					break;
				default:
					votoNulo++;
                    System.out.println("Voto nulo contabilizado!");
					System.out.println("Deseja votar novamente? \n 1 - Sim \n 2 - Não");
					votarNovamente = sc.nextInt();
					if (votarNovamente == 1) {
						System.out.println("*******************************************************************************");
			            System.out.println("                       ESCOLHA NOVAMENTE UM CANDIDATO                             ");
			            System.out.println("*******************************************************************************");
						mostrarCandidatos(cadidatos, contVotos);
					} else {
						mostrarDados(cadidatos, contCadidatos, votoNulo);
					}
					break;
				}
				} while (voto != 6); // ( Fim ) do Do - While para fazer a reptição dos votos.
			} else {
				mostrarDados(cadidatos, contCadidatos, votoNulo);
			}
		} else {
			System.out.println("Progama finalizado por falta de cadidatos!");
		}
		
	}
    // CLASSE PARA MOSTRAR OS DADOS DA VOTAÇÃO
	public static void mostrarDados(String[] s, int[] v, int a) {
		System.out.println("*******************************************************************************");
        System.out.println("                            Votação Finalizada!                              ");
        System.out.println("*******************************************************************************");
		System.out.println("Dados da Eleição: ");
		System.out.println("Cadidato " + s[1] + " Numero de votos: " + v[1]);
		System.out.println("Cadidato " + s[2] + " Numero de votos: " + v[2]);
		System.out.println("Cadidato " + s[3] + " Numero de votos: " + v[3]);
		System.out.println("Cadidato " + s[4] + " Numero de votos: " + v[4]);
		System.out.println("Cadidato " + s[5] + " Numero de votos: " + v[5]);
		System.out.println("Numero de votos brancos: " + v[0]);
		System.out.println("Numero de votos nulos: " + a);
        
        // AREA PARA DEFINIR O GANHADOR
        int maiorQuantidadeVotos = v[0];
        int vencedor = 0; 
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maiorQuantidadeVotos) {
                maiorQuantidadeVotos = v[i];
                vencedor = i; 
            }
        }
        System.out.println("O CANDIDATO " + s[vencedor] + " GANHOU AS ELEIÇÕES DE 2042!!!!");
	}
    // CLASSE PARA MOSTRAR OS CANDIDATOS CADASTRADOS
	public static void mostrarCandidatos(String[] s, int a) {
		for (int l = 0; l < s.length; l++) {
			a++;
			System.out.println("Numero: " + a + " Cadidato: " + s[l]);
		}
		System.out.println("6 - Sair");

	}

}
