Given a class Employee. Your task is to create your own **comparator** and implement method `Set<Employee> getEmployeesByOrder(List<Employee> employees)` that takes List of Employees.

This method should return sorted set of Employees by age and names:

-   Firstly, sort employees from younger to older.
-   If the age is the same, sort by their name alphabetically.

#### [Try to avoid these common mistake while solving task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/comparator)

### Common mistakes[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/comparator#common-mistakes)

#### Variable naming[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/comparator#variable-naming)

Incorrect naming may have significant impact on your code readability!

#### Don’t complicate if-else construction. [Detailed explanation.](https://www.youtube.com/watch?v=P-UmyrbGjwE&list=PL7FuXFaDeEX1smwnp-9ri8DBpgdo7Msu2)[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/comparator#dont-complicate-if-else-construction-detailed-explanation)

#### Don’t complicate your code[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/comparator#dont-complicate-your-code)

You should not use for loop to implement this task, TreeSet is enough.