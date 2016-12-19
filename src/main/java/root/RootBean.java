package root;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RootBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(RootBean.class);

    public RootBean() {
        LOGGER.info("Created RootBean");
    }
}
