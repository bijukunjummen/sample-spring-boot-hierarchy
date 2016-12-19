package child2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import root.RootBean;

public class ChildBean2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChildBean2.class);
    private final RootBean rootBean;

    public ChildBean2(RootBean rootBean, String fromRoot) {
        LOGGER.info("Creating Child Bean! {}", fromRoot);
        this.rootBean = rootBean;
    }


}
