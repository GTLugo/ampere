package com.gtlugo.ampere.neoforge;

import net.neoforged.fml.common.Mod;

import com.gtlugo.ampere.Ampere;

@Mod(Ampere.MOD_ID)
public final class AmpereNeoForge {
  public AmpereNeoForge() {
    // Run our common setup.
    Ampere.init();
  }
}
