package org.datenmuehle.sysinfo;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSysInfo {

    private static Logger logger = LogManager.getLogger(TestSysInfo.class);

    @Test
    public void checkSystemVersionTest() {
        logger.debug(SystemInfo.getVersion());
        logger.debug(SystemInfo.getBuild());
        assertTrue( StringUtils.compare(SystemInfo.getVersion(), "1.0-SNAPSHOT")==0);
    }
}
