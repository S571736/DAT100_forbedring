# Skoleprøve 8.9

``` Java
// Oppgave 1a
public void storreEllerMindre(int a){
    if (a == 0) {
        System.out.println("a er lik 0");
    } else if (a > 0) {
        System.out.println("a er større enn 0");
    } else {
        System.out.println("a er mindre enn 0");
    }
}


// Oppgave 1b
public void intervall(int a){
    if (a >= 5 && a <= 8){
        System.out.println(a + " er innenfor intervallet");
    } else {
        System.out.println( a + " er utenfor intervallet");
    }
}


// Oppgave 1c
public String switchTabellen(int a){
    String s;
    switch (a){
        case 0:
            s = "null";
            break;
        case 1:
            s = "en";
            break;
        case 2:
            s = "to";
            break;
        case 3:
            s = "tre";
            break;
        case 4:
            s = "fire";
            break;
        default:
            s = "ulovlig verdi";
            break;
    }
    return s;
}

// Oppgave 2
public static void forLokke(){
    for(int i = 2; i < 7; i++){
        System.out.println("10 / " + i + " = " + (10/i));
    }
}

// Oppgave 3
public static void sum(){
    int i = 0;
    int sum = 0;
    int input = 0;
    String in;

    do{
        in = showInputDialog("Skriv inn et heltall, dersom du er ferdig skriv tallet 0");
        input = Integer.parseInt(in);

        sum += input;

        i++;
    } while(input != 0);

    System.out.println("Antall tall: " + i + "\nSum: " + 63);
}

// Oppgave 4a
public int minste(int a, b, c){
    int minste = a;

    if(minste > b){
        minste = b;
    }
    if(minste > c){
        minste = c;
    }

    return minste;
}
// Oppgave 4a
System.out.println(minste(a,b,c));

// Oppgave 5a
public static double areal(double r){
    return (Math.PI * (Math.pow(r, 2)));
}

// Oppgave 5b
System.out.println(areal(1.5));
```

