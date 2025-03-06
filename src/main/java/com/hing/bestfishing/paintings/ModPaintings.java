package com.hing.bestfishing.paintings;

import com.hing.bestfishing.BestFishingMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {
    public static final PaintingVariant ABIGAIL = registerPainting("abigail", new PaintingVariant(64, 64));
    public static final PaintingVariant ALEX = registerPainting("alex", new PaintingVariant(64, 64));
    public static final PaintingVariant CAROLINE = registerPainting("caroline", new PaintingVariant(64, 64));
    public static final PaintingVariant CLINT = registerPainting("clint", new PaintingVariant(64, 64));
    public static final PaintingVariant DEMETRIUS = registerPainting("demetrius", new PaintingVariant(64, 64));
    public static final PaintingVariant DWARF = registerPainting("dwarf", new PaintingVariant(64, 64));
    public static final PaintingVariant ELLIOTT = registerPainting("elliott", new PaintingVariant(64, 64));
    public static final PaintingVariant EMILY = registerPainting("emily", new PaintingVariant(64, 64));
    public static final PaintingVariant EVELYN = registerPainting("evelyn", new PaintingVariant(64, 64));
    public static final PaintingVariant GEORGE = registerPainting("george", new PaintingVariant(64, 64));
    public static final PaintingVariant GUS = registerPainting("gus", new PaintingVariant(64, 64));
    public static final PaintingVariant HALEY = registerPainting("haley", new PaintingVariant(64, 64));
    public static final PaintingVariant HARVEY = registerPainting("harvey", new PaintingVariant(64, 64));
    public static final PaintingVariant JAS = registerPainting("jas", new PaintingVariant(64, 64));
    public static final PaintingVariant JODI = registerPainting("jodi", new PaintingVariant(64, 64));
    public static final PaintingVariant KENT = registerPainting("kent", new PaintingVariant(64, 64));
    public static final PaintingVariant KROBUS = registerPainting("krobus", new PaintingVariant(64, 64));
    public static final PaintingVariant LEAH = registerPainting("leah", new PaintingVariant(64, 64));
    public static final PaintingVariant LEO = registerPainting("leo", new PaintingVariant(64, 64));
    public static final PaintingVariant LEWIS = registerPainting("lewis", new PaintingVariant(64, 64));
    public static final PaintingVariant LINUS = registerPainting("linus", new PaintingVariant(64, 64));
    public static final PaintingVariant MARNIE = registerPainting("marnie", new PaintingVariant(64, 64));
    public static final PaintingVariant MARU = registerPainting("maru", new PaintingVariant(64, 64));
    public static final PaintingVariant PAM = registerPainting("pam", new PaintingVariant(64, 64));
    public static final PaintingVariant PENNY = registerPainting("penny", new PaintingVariant(64, 64));
    public static final PaintingVariant PIERRE = registerPainting("pierre", new PaintingVariant(64, 64));
    public static final PaintingVariant ROBIN = registerPainting("robin", new PaintingVariant(64, 64));
    public static final PaintingVariant SAM = registerPainting("sam", new PaintingVariant(64, 64));
    public static final PaintingVariant SANDY = registerPainting("sandy", new PaintingVariant(64, 64));
    public static final PaintingVariant SEBASTIAN = registerPainting("sebastian", new PaintingVariant(64, 64));
    public static final PaintingVariant SHANE = registerPainting("shane", new PaintingVariant(64, 64));
    public static final PaintingVariant VINCENT = registerPainting("vincent", new PaintingVariant(64, 64));
    public static final PaintingVariant WILLY = registerPainting("willy", new PaintingVariant(64, 64));
    public static final PaintingVariant WIZARD = registerPainting("wizard", new PaintingVariant(64, 64));


    private static PaintingVariant registerPainting(String name,PaintingVariant paintingVariant){
        return Registry.register(Registries.PAINTING_VARIANT,new Identifier(BestFishingMod.MOD_ID,name),paintingVariant);
    }

    public static void registerPaintings(){

    }
}
