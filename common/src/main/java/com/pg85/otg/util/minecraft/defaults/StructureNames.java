package com.pg85.otg.util.minecraft.defaults;

/**
 * Open Terrain Generator replaces some of the standard Minecraft structure generator.
 * All structures that have a custom StructureStart subclass are replaced
 * structures.
 * <p>
 * As of Minecraft 1.6.4, structures are saved to disk. Each structure needs
 * an unique id. To make sure that vanilla worlds on the same server aren't
 * affected, TC uses unique structure names, which can be found in this class.
 * <p>
 * All names of replaced structures are simply "OTG" + vanilla name.
 * 
 */
public class StructureNames
{
    public static final String MINESHAFT = "Mineshaft";
    public static final String NETHER_FORTRESS = "Fortress";
    public static final String VILLAGE = "OTGVillage";
    public static final String STRONGHOLD = "Stronghold";
    public static final String RARE_BUILDING = "OTGTemple";
    public static final String OCEAN_MONUMENT = "Monument";
    public static final String WOODLAND_MANSION = "Mansion";

    private StructureNames()
    {
    }
}
