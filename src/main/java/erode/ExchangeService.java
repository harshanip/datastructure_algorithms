package erode;

import java.math.BigDecimal;
import java.util.Optional;

public 
class ExchangeService {
	Optional<BigDecimal> rate(String Currency) {
		return Optional.of(new BigDecimal(0.645));
	}
}
