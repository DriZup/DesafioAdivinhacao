

# README - Jogo de Adivinhação de Números

Este pull request adiciona um jogo de adivinhação de números, onde o usuário tenta adivinhar um número aleatório gerado pelo sistema dentro de um intervalo determinado. O jogo possui diferentes níveis de dificuldade e permite ao usuário jogar várias rodadas, acumulando pontos ao longo do tempo.

## Funcionalidades

### 1. Importação de Bibliotecas

O jogo utiliza as seguintes bibliotecas:

```java
import java.util.Scanner;
import java.util.Random;
import java.util.Locale;
```

### 2. Declaração de Variáveis

As variáveis principais do jogo são:

```java
boolean playagain = true;
int totalpoints = 0;
int points;
String difficulty;
int maxNumber;
```

### 3. Escolha de Dificuldade

O jogador escolhe entre três níveis de dificuldade:

- **Easy**: Intervalo de 1 a 10.
- **Medium**: Intervalo de 1 a 50.
- **Hard**: Intervalo de 1 a 100.

Exemplo de código:

```java
System.out.println("Choose a difficulty level: Easy, Medium, Hard");
String difficulty = sc.next().toLowerCase();
int maxNumber = switch (difficulty) {
    case "easy" -> 10;
    case "medium" -> 50;
    case "hard" -> 100;
    default -> 10; // Default to Easy
};
```

### 4. Rodada de Adivinhação

O jogador tenta adivinhar o número gerado. Regras:

- Acerto exato: +10 pontos.
- Palpite a 1 unidade de distância: +5 pontos.

Exemplo de código:

```java
while (randomNumber != guess) {
    if (guess == randomNumber + 1 || guess == randomNumber - 1) {
        points += 5;
        System.out.println("So close! You were 1 unit away. You earned 5 points.");
    } else {
        System.out.println("Incorrect guess! You entered: " + guess + " and you have: " + points + " points.");
    }
    System.out.println("Try again! Enter a number between 1 and " + maxNumber + ": ");
    guess = sc.nextInt();
}
```

### 5. Pontuação Acumulada

A pontuação de cada rodada é acumulada:

```java
totalpoints += points;
```

### 6. Pergunta para Jogar Novamente

O jogador pode optar por continuar ou encerrar o jogo:

```java
System.out.println("Do you want to play again: yes/no");
String response = sc.next().toLowerCase(Locale.ROOT);
if (!response.equals("yes")) {
    playagain = false;
    System.out.println("Goodbye!");
}
```

### 7. Fechamento do Jogo

Ao final, o número gerado e a pontuação total são exibidos:

```java
System.out.println("The random number was: " + randomNumber);
System.out.println("Your total points: " + totalpoints);
sc.close();
```

## Como Testar

1. Clone o repositório e compile o código.
2. Execute o programa e siga as instruções no terminal.
3. Teste diferentes níveis de dificuldade e cenários de adivinhação.
