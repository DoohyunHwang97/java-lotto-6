package lotto.dto;

import java.util.List;
import java.util.Objects;

public class LottosDTO {
    private List<List<Integer>> lottos;

    public LottosDTO(List<List<Integer>> lottos) {
        this.lottos = lottos;
    }

    public List<List<Integer>> getLottos() {
        return lottos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LottosDTO lottosDTO = (LottosDTO) o;
        return Objects.equals(lottos, lottosDTO.lottos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottos);
    }
}
