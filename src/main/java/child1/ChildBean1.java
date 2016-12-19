package child1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import root.RootBean;

public class ChildBean1 {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChildBean1.class);
    private final RootBean rootBean;

    public ChildBean1(RootBean rootBean, String fromRoot) {
        LOGGER.info("Creating Child Bean! {}", fromRoot);
        this.rootBean = rootBean;
    }


}
