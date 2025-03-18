package com.gtlugo.ampere;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class Ampere {
  public static final String MOD_ID = "ampere";
  private static final Logger LOGGER = LogUtils.getLogger();

  public static void init() {
    // Write common init code here.
    LOGGER.info("Initializing Ampere. BAU BAU!");
  }
}
