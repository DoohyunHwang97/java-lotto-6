package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String viewMoneyInputForm() {
        System.out.println("구입금액을 입력해 주세요.");
        return readInput();
    }

    protected String readInput() {
        return Console.readLine();
    }
}
