package com.chillaxmc.chillaxocaddons;

import net.minecraftforge.common.config.Config;

@Config(modid = Reference.ID, category = "options")
@Config.LangKey(Reference.ID + ".config.title")
public class ChillaxOCConfig {

    @Config.Comment("Tobacco- Leaf drop amount [Default: 10]")
    public static int tobaccoLeafCropAmount = 10;
    @Config.Comment("Tobacco- Seeds drop amount [Default: 10]")
    public static int tobaccoSeedsCropAmount = 10;
}
