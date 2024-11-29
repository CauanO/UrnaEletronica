## Status do Projeto

[![Projeto Completo](https://img.shields.io/badge/Projeto-Completo-brightgreen)](#)

---

# Urna Eletrônica

## Sobre o projeto

Este programa simula uma **Urna Eletrônica** para eleições fictícias. 
Permite cadastrar candidatos, contabilizar votos e exibir os resultados, incluindo votos brancos e nulos. 
Ao final, o programa declara o vencedor.

---

## Funcionalidades

1. **Cadastro de Candidatos**:
   - O usuário pode cadastrar até 5 candidatos, além da opção de voto em branco.
2. **Votação**:
   - O programa permite que os eleitores votem nos candidatos ou registrem votos em branco ou nulo.
3. **Resultados**:
   - Exibe a contagem de votos de cada candidato, votos brancos e nulos.
   - Declara o candidato vencedor.

---

## Como executar o programa

1. **Compile o programa**:
   ```bash
   javac UrnaEletronica.java
   ```

2. **Execute o programa**:
   ```bash
   java UrnaEletronica
   ```

---

## Interação com o programa

1. Inicie o programa e escolha se deseja cadastrar os candidatos.
2. Após cadastrar, opte por iniciar a votação.
3. Durante a votação:
   - Digite o número correspondente ao candidato para votar.
   - Para votar em branco, insira `0`.
   - Para sair e finalizar a votação, insira `6`.
4. O programa apresentará os resultados após a votação.

---

## Exemplo de Execução

```plaintext
***************************************************************************************
                                  URNA ELETRONICA                                      
****************************************************************************************
Deseja cadastrar os candidatos? 
1 - Sim
2 - Não
> 1
Nome do candidato 1:
> João
Nome do candidato 2:
> Maria
...

Deseja votar? 
1 - Sim
2 - Não
> 1
*******************************************************************************    
                             ESCOLHA UM CANDIDATO                             
*******************************************************************************
Número: 1 Candidato: BRANCO
Número: 2 Candidato: João
Número: 3 Candidato: Maria
...

> 3
Deseja votar novamente? 
1 - Sim
2 - Não
> 2

*******************************************************************************    
                            Votação Finalizada!                             
*******************************************************************************
Dados da Eleição:
Candidato João - Número de votos: 3
Candidato Maria - Número de votos: 5
...
O CANDIDATO MARIA GANHOU AS ELEIÇÕES DE 2042!!!!
```
