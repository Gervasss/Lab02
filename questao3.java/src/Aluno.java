public class Aluno {
    double  nota1, nota2, notat, med, medFinal;
    String matricula, nome;

    Aluno (){}   
    Aluno(String matricula, String nome, double nota1, double nota2,double notat) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notat = notat;
    }

    double calcularMedia() {
        nota1 *= 4;
        nota2 *= 4;
        notat *= 2;
        med = (nota1 + nota2 + notat)/10;
        return med;
    }

    double medFinal() {
        if(med >= 7) {
            return 0;
        } else {
            medFinal = 7 - med;
            return medFinal;
        }
    }
}