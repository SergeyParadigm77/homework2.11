package pro.sky.homework21.Service;

import java.util.List;
import java.util.Set;

public interface OrderService {
    Set<Integer> add(List<Integer> ids);
    Set<Integer> get();
}
