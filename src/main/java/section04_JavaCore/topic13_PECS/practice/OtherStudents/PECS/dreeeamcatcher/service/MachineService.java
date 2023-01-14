package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.service;

import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.model.Machine;
import java.util.List;

/**
 * Parameterize this service and add its implementation in a separate class.
 */
public interface MachineService<M extends Machine> {
    /**
     * Return the list of machines.
     @@ -16,7 +17,7 @@ public interface MachineService {
      * @param type - any class of Machine sub class. For example: Truck.class or Bulldozer.class
     * @return the list of machines
     */
    List<M> getAll(Class<? extends M> type);

    /**
     * Fill the machines list with passed value
     @@ -26,13 +27,13 @@ public interface MachineService {
      * @param machines - list of machines to be filled with value
     * @param value    - any object of machine sub class
     */
    void fill(List<? super Machine> machines, Machine value);

    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as list of trucks.
     *
     * @param machines - the list of machines
     */
    void startWorking(List<? extends Machine> machines);
}