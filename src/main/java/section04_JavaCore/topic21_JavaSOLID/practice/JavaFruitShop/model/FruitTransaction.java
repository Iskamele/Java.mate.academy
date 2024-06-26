package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model;

public class FruitTransaction {
    private final Operation operation;
    private final String fruit;
    private final int quantity;

    public FruitTransaction(Operation operation, String fruit, int quantity) {
        this.operation = operation;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public Operation getOperation() {
        return operation;
    }

    public String getFruit() {
        return fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public enum Operation {
        BALANCE("b"),
        SUPPLY("s"),
        PURCHASE("p"),
        RETURN("r");

        private final String operation;

        Operation(String operation) {
            this.operation = operation;
        }

        public static Operation getByCharacter(String character) {
            for (Operation operation : values()) {
                if (operation.getOperation().equals(character)) {
                    return operation;
                }
            }
            throw new RuntimeException("No such operation exists: " + character);
        }

        public String getOperation() {
            return operation;
        }
    }
}
