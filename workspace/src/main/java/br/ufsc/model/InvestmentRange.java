package br.ufsc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Maciel Hogenn e Osmar de Oliveira Braz Júnior
 * @since 1.0.0-SNAPSHOT
 */

@AllArgsConstructor
public enum InvestmentRange {

    FROM_0_TO_1000(0, 1000),
    FROM_1001_TO_5000(1001, 5000),
    FROM_5001_TO_50000(5001, 50000),
    OVER_50000(50001, Integer.MAX_VALUE);

    @Getter
    private int min, max;

}
