package section04_JavaCore.topic02_MemoryWrappersString.practice;

public class FootballMatch {
    public static void main(String[] args) {

        System.out.println(matchResult(1, 2, 1, 3)); // 1
        System.out.println(matchResult(1, 1, 1, 2)); // 0
    }

    public static int matchResult(int result1, int result2, int bet1, int bet2) {

        /*
        if (result1 == bet1 && result2 == bet2) {
            return 2;
        } else if (result1 == result2 && bet1 == bet2 || result1 > result2 && bet1 > bet2 || result1 < result2 && bet1 < bet2) {
            return 1;
        } else {
            return 0;
        }
        */

        return (result1 == bet1 && result2 == bet2) ? 2 : ((result1 == result2 && bet1 == bet2 || result1 > result2 && bet1 > bet2 || result1 < result2 && bet1 < bet2) ? 1 : 0);
    }
}

/*
Пример: результат1 = 0; результат2 = 2; ставка1 = 1; ставка2 = 1; Значение: команды сыграли со счетом 0:2,
а пользовательская ставка была 1:1. Задача: Если пользовательская ставка была точной на 100% - вернуть 2;
Если пользователь угадал, кто победитель, проигравший или что это была ничья (играл 1:2, а ставка была 0:3 или играл 2:2,
а ставка была 3:3 - то пользователь выиграл эту ставку) затем вернуть 1; Если ставка вообще была ошибочной - вернуть 0.
*/