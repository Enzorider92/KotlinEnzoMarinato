fun main() {
    print("Choisis un chiffre: ")

    val question = readLine()!!
    println("Le chiffre gagnant est $question")

    var reponse = ""

    while(reponse != question) {
        print("Essaye un autre chiffre: ")

        reponse = readLine()!!

        when {
            (question.equals(reponse)) -> System.out.println("bravo tu as gagné");
            else -> println("Dommage c'est pas le bon chiffre $reponse");
        }

        if(reponse > question){
            println("C'est -")
        }
        else if(reponse < question){
            println("C'est +")
        }
        else{
            println("C'est bon")
        }

    }
}