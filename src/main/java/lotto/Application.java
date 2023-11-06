package lotto;

import lotto.domain.LottoService;
import lotto.view.InputView;
import lotto.view.LottoResultView;

public class Application {
    public static void main(String[] args) {
        LottoService lottoService = new LottoService(new PickNumStrategyImpl());
        InputView inputView = new InputView();

        String money = inputView.viewMoneyInputForm();
        LottoResultView.print(lottoService.createLottos(money));
    }
}
