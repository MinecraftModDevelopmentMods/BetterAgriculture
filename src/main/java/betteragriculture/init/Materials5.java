package betteragriculture.init;

import betteragriculture.util.Config.Options;

import com.mcmoddev.lib.material.MetalMaterial;
import com.mcmoddev.lib.material.MetalMaterial.MaterialType;

/**
 * This class initializes all of the materials in Modern Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Materials5 extends com.mcmoddev.lib.init.Materials {

	/** Aluminum */
	/** Aluminum-Brass*/
	
	public static MetalMaterial tinyTileBlue;
	public static MetalMaterial tinyTileBrown;
	public static MetalMaterial tinyTileCyan;
	public static MetalMaterial tinyTileGreen;
	public static MetalMaterial tinyTileGrey;
	public static MetalMaterial tinyTileLightBlue;
	public static MetalMaterial tinyTileLightGrey;
	public static MetalMaterial tinyTileLime;
	public static MetalMaterial tinyTileMagenta;
	public static MetalMaterial tinyTileOrange;
	public static MetalMaterial tinyTilePink;
	public static MetalMaterial tinyTilePurple;
	public static MetalMaterial tinyTileRed;
	public static MetalMaterial tinyTileWhite;
	public static MetalMaterial tinyTileYellow;
	public static MetalMaterial tinyTileClay;
	public static MetalMaterial tinyTileConcrete;
	public static MetalMaterial tinyTileQuartz;
	public static MetalMaterial tinyTileSlate;

	public static MetalMaterial smallTile;
	public static MetalMaterial smallTileBlue;
	public static MetalMaterial smallTileBrown;
	public static MetalMaterial smallTileCyan;
	public static MetalMaterial smallTileGreen;
	public static MetalMaterial smallTileGrey;
	public static MetalMaterial smallTileLightBlue;
	public static MetalMaterial smallTileLightGrey;
	public static MetalMaterial smallTileLime;
	public static MetalMaterial smallTileMagenta;
	public static MetalMaterial smallTileOrange;
	public static MetalMaterial smallTilePink;
	public static MetalMaterial smallTilePurple;
	public static MetalMaterial smallTileRed;
	public static MetalMaterial smallTileWhite;
	public static MetalMaterial smallTileYellow;
	public static MetalMaterial smallTileClay;
	public static MetalMaterial smallTileConcrete;
	public static MetalMaterial smallTileQuartz;
	public static MetalMaterial smallTileSlate;

	
	/** Chromium */
	public static MetalMaterial largeTile;

	public static MetalMaterial largeTileBlue;
	public static MetalMaterial largeTileBrown;
	public static MetalMaterial largeTileCyan;
	public static MetalMaterial largeTileGreen;
	public static MetalMaterial largeTileGrey;
	public static MetalMaterial largeTileLightBlue;
	public static MetalMaterial largeTileLightGrey;
	public static MetalMaterial largeTileLime;
	public static MetalMaterial largeTileMagenta;
	public static MetalMaterial largeTileOrange;
	public static MetalMaterial largeTilePink;
	public static MetalMaterial largeTilePurple;
	public static MetalMaterial largeTileRed;
	public static MetalMaterial largeTileWhite;
	public static MetalMaterial largeTileYellow;
	public static MetalMaterial largeTileClay;
	public static MetalMaterial largeTileConcrete;
	public static MetalMaterial largeTileQuartz;
	public static MetalMaterial largeTileSlate;
	/** Magnesium */
	public static MetalMaterial slate;
	/** Nichrome */
	/** Magnesium */
	public static MetalMaterial brick;
	
	public static MetalMaterial concrete;
	/** Nichrome */
	public static MetalMaterial sidingRed;
	/** Nichrome */
	public static MetalMaterial sidingWhite;
	/** Nichrome */
	public static MetalMaterial stockTankAccacia;
	public static MetalMaterial stockTankBirch;
	public static MetalMaterial stockTankDarkOak;
	public static MetalMaterial stockTankJungle;
	public static MetalMaterial stockTankOak;
	public static MetalMaterial stockTankSpruce;
	public static MetalMaterial stockTankStone;







	private static boolean initDone = false;

	protected Materials5() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		if (Options.enableTinyTile) {
			tinyTileBlue = createMaterial("tinytileblue_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileBrown = createMaterial("tinytilebrown_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileCyan = createMaterial("tinytilecyan_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileGreen = createMaterial("tinytilegreen_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileGrey = createMaterial("tinytilegrey_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileLightBlue = createMaterial("tinytilelightblue_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileLightGrey = createMaterial("tinytileLightgrey_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileLime = createMaterial("tinytilelime_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileMagenta = createMaterial("tinytilemagenta_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileOrange = createMaterial("tinytileorange_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTilePink = createMaterial("tinytilepink_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTilePurple = createMaterial("tinytilepurple_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileRed = createMaterial("tinytilered_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileWhite = createMaterial("tinytilewhite_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileClay = createMaterial("tinytileclay_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileConcrete = createMaterial("tinytileconcrete_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileQuartz = createMaterial("tinytilequartz_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileSlate = createMaterial("tinytileslate_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);

		}

		/////
		if (Options.enableSmallTile) {
			smallTileBlue = createMaterial("smalltile_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileBrown = createMaterial("smalltilebrown_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileCyan = createMaterial("smalltilecyan_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileGreen = createMaterial("smalltilegreen_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileGrey = createMaterial("smalltilegrey_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileLightBlue = createMaterial("smalltilelightblue_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileLightGrey = createMaterial("smalltileLightgrey_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileLime = createMaterial("smalltilelime_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileMagenta = createMaterial("smalltilemagenta_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileOrange = createMaterial("smalltileorange_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTilePink = createMaterial("smalltilepink_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTilePurple = createMaterial("smalltilepurple_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileRed = createMaterial("smalltilered_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileWhite = createMaterial("smalltilewhite_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileClay = createMaterial("smalltileclay_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileQuartz = createMaterial("smalltilequartz_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileConcrete = createMaterial("smalltileconcrete_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileSlate = createMaterial("smalltileslate_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
		}

		////
		if (Options.enableLargeTile) {
			largeTileBlue = createMaterial("largetile_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileBrown = createMaterial("largetilebrown_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileCyan = createMaterial("largetilecyan_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileGreen = createMaterial("largetilegreen_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileGrey = createMaterial("largetilegrey_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileLightBlue = createMaterial("largetilelightblue_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileLightGrey = createMaterial("largetileLightgrey_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileLime = createMaterial("largetilelime_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileMagenta = createMaterial("largetilemagenta_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileOrange = createMaterial("largetileorange_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTilePink = createMaterial("largetilepink_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTilePurple = createMaterial("largetilepurple_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileRed = createMaterial("largetilered_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileWhite = createMaterial("largetilewhite_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileClay = createMaterial("largetileclay_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileConcrete = createMaterial("largetileconcrete_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileQuartz = createMaterial("largetilequartz_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileSlate = createMaterial("largetileslate_stairs", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
		}

		
		/////

		if (Options.enableSlate) {
			slate = createMaterial("slate_stairs", MaterialType.METAL, 9, 3, 4.5, 0xFFCDCDCF);
		}

		if (Options.enableSlate) {
			concrete = createMaterial("concrete_stairs", MaterialType.METAL, 9, 3, 4.5, 0xFFCDCDCF);
		}	



		initDone = true;
	}
}
