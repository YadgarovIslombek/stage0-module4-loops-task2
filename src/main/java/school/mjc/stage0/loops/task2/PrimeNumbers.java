package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int nomzod = 2;

        while (nomzod<=printToInclusive) {
            int boluvchi = 2;
            while (boluvchi <= nomzod){
                if (nomzod == boluvchi){
                    System.out.println(nomzod);
                }
                if (nomzod % boluvchi == 0){
                    break;
                }
                boluvchi++;
            }
            nomzod++;
        }

    }
}
