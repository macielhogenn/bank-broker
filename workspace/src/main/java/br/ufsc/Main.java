package br.ufsc;

import br.ufsc.business.BankBrokerBusiness;
import br.ufsc.model.InvestmentLiquidity;
import br.ufsc.model.InvestmentRange;
import br.ufsc.model.InvestmentTime;

/**
 * @author Maciel Hogenn e Osmar de Oliveira Braz Júnior
 * @since 1.0.0-SNAPSHOT
 */
class Main {



    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        BankBrokerBusiness.getInstance().filter(InvestmentRange.FROM_0_TO_1000,
                InvestmentTime.FROM_6_TO_12_MONTHS,
                InvestmentLiquidity.FROM_1_TO_7_DAYS);
    }


}
