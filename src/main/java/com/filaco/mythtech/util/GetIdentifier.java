package com.filaco.mythtech.util;

import com.filaco.mythtech.MythTech;
import net.minecraft.util.Identifier;

public class GetIdentifier {


    public static Identifier getIdentifier(String pathname) {
        /*
        A helper method used to get a mod identifier based off a string.
         */

        return Identifier.of(MythTech.MOD_ID, pathname);
    }

}
