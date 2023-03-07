package HomeWork200223;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    public static void addCarToQueue(Queue queue, Transport transport) {
        if (transport.getType() != Transport.Type.BUS) {
            queue.add(transport);
        }
    }
    public static void checkUp(Queue queue) {
        System.out.println("Произведен техосмотр участника заезда: " + queue.poll());
        System.out.println("Количество участников в очереди на ТО: " + queue.size());
    }
}
