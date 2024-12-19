package java_10;

public class JumpExample {
    public static void main(String[] args) {
        // break => e ndal ekzekutimin
        // continue => e bon skip nje hap

        for (int i = 1; i <= 10; i++) { // 1.....5
            if (i == 6) {
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) { // 1......10 pa e perfshi numrin 6
            if (i == 6) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        // break as goto
        first: {
            second: {
                third: {
                    System.out.println("Para fjales kyqe break");
                    if (true) {
                        break second;
                    }
                    System.out.println("Nuk ekzekutohet");
                }
                System.out.println("Scope 2");
            }
            System.out.println("Kjo pjese eshte jasht scope 2 dhe brenda 1");
        }
    }
}
