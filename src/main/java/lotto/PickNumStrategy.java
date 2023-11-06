package lotto;

import java.util.List;

@FunctionalInterface
public interface PickNumStrategy {
    abstract List<Integer> pickNum();
}
