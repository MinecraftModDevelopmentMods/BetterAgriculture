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
public class Materials extends com.mcmoddev.lib.init.Materials {

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

	protected Materials() {
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
			tinyTileBlue = createMaterial("tinytileblue",null, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileBrown = createMaterial("tinytilebrown", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileCyan = createMaterial("tinytilecyan", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileGreen = createMaterial("tinytilegreen", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileGrey = createMaterial("tinytilegrey", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileLightBlue = createMaterial("tinytilelightblue", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileLightGrey = createMaterial("tinytilelightgrey", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileLime = createMaterial("tinytilelime", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileMagenta = createMaterial("tinytilemagenta", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileOrange = createMaterial("tinytileorange", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTilePink = createMaterial("tinytilepink", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTilePurple = createMaterial("tinytilepurple", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileRed = createMaterial("tinytilered", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileWhite = createMaterial("tinytilewhite", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileClay = createMaterial("tinytileclay", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileConcrete = createMaterial("tinytileconcrete", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileQuartz = createMaterial("tinytilequartz", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileSlate = createMaterial("tinytileslate", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);

		}

		/////
		if (Options.enableSmallTile) {
			smallTileBlue = createMaterial("smalltile", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileBrown = createMaterial("smalltilebrown", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileCyan = createMaterial("smalltilecyan", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileGreen = createMaterial("smalltilegreen", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileGrey = createMaterial("smalltilegrey", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileLightBlue = createMaterial("smalltilelightblue", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileLightGrey = createMaterial("smalltileLightgrey", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileLime = createMaterial("smalltilelime", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileMagenta = createMaterial("smalltilemagenta", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileOrange = createMaterial("smalltileorange", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTilePink = createMaterial("smalltilepink", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTilePurple = createMaterial("smalltilepurple", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileRed = createMaterial("smalltilered", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileWhite = createMaterial("smalltilewhite", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileClay = createMaterial("smalltileclay", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileQuartz = createMaterial("smalltilequartz", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileConcrete = createMaterial("smalltileconcrete", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileSlate = createMaterial("smalltileslate", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
		}

		////
		if (Options.enableLargeTile) {
			largeTileBlue = createMaterial("largetile", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileBrown = createMaterial("largetilebrown", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileCyan = createMaterial("largetilecyan", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileGreen = createMaterial("largetilegreen", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileGrey = createMaterial("largetilegrey", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileLightBlue = createMaterial("largetilelightblue", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileLightGrey = createMaterial("largetileLightgrey", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileLime = createMaterial("largetilelime", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileMagenta = createMaterial("largetilemagenta", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileOrange = createMaterial("largetileorange", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTilePink = createMaterial("largetilepink", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTilePurple = createMaterial("largetilepurple", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileRed = createMaterial("largetilered", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileWhite = createMaterial("largetilewhite", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileClay = createMaterial("largetileclay", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileConcrete = createMaterial("largetileconcrete", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileQuartz = createMaterial("largetilequartz", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileSlate = createMaterial("largetileslate", MaterialType.ROCK, 1, 7.5, 4.5, 0xFFEBAA56);
		}

		
		/////

		if (Options.enableSlate) {
			slate = createMaterial("slate", MaterialType.ROCK, 9, 3, 4.5, 0xFFCDCDCF);
		}

		if (Options.enableSlate) {
			concrete = createMaterial("concrete", MaterialType.ROCK, 9, 3, 4.5, 0xFFCDCDCF);
		}	



		initDone = true;
	}
}
