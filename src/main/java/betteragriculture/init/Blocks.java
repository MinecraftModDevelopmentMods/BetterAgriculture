package betteragriculture.init;

import betteragriculture.util.Config.Options;

/**
 * This class initializes all blocks in Modern Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Blocks extends com.mcmoddev.lib.init.Blocks {

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Materials.init();
		ItemGroups.init();

		if (Options.enableTinyTile) {
			createBlock(Materials.tinyTileBlue);
			createBlock(Materials.tinyTileBrown);
			createBlock(Materials.tinyTileCyan);
			createBlock(Materials.tinyTileGreen);
			createBlock(Materials.tinyTileGrey);
			createBlock(Materials.tinyTileLightBlue);
			createBlock(Materials.tinyTileLightGrey);
			createBlock(Materials.tinyTileLime);
			createBlock(Materials.tinyTileMagenta);
			createBlock(Materials.tinyTileOrange);
			createBlock(Materials.tinyTilePink);
			createBlock(Materials.tinyTilePurple);
			createBlock(Materials.tinyTileRed);
			createBlock(Materials.tinyTileWhite);
			createBlock(Materials.tinyTileYellow);
			createBlock(Materials.tinyTileClay);
			createBlock(Materials.tinyTileConcrete);
			createBlock(Materials.tinyTileQuartz);
			createBlock(Materials.tinyTileSlate);
			
			createStairs(Materials.tinyTileBlue);
			createStairs(Materials.tinyTileBrown);
			createStairs(Materials.tinyTileCyan);
			createStairs(Materials.tinyTileGreen);
			createStairs(Materials.tinyTileGrey);
			createStairs(Materials.tinyTileLightBlue);
			createStairs(Materials.tinyTileLightGrey);
			createStairs(Materials.tinyTileLime);
			createStairs(Materials.tinyTileMagenta);
			createStairs(Materials.tinyTileOrange);
			createStairs(Materials.tinyTilePink);
			createStairs(Materials.tinyTilePurple);
			createStairs(Materials.tinyTileRed);
			createStairs(Materials.tinyTileWhite);
			createStairs(Materials.tinyTileYellow);
			createStairs(Materials.tinyTileClay);
			createStairs(Materials.tinyTileConcrete);
			createStairs(Materials.tinyTileQuartz);
			createStairs(Materials.tinyTileSlate);
		}
		if (Options.enableSmallTile) {
			createBlock (Materials.smallTileBlue);
			createBlock (Materials.smallTileBrown);
			createBlock (Materials.smallTileCyan);
			createBlock (Materials.smallTileGreen);
			createBlock (Materials.smallTileGrey);
			createBlock (Materials.smallTileLightBlue);
			createBlock (Materials.smallTileLightGrey);
			createBlock (Materials.smallTileLime);
			createBlock (Materials.smallTileMagenta);
			createBlock (Materials.smallTileOrange);
			createBlock (Materials.smallTilePink);
			createBlock (Materials.smallTilePurple);
			createBlock (Materials.smallTileRed);
			createBlock (Materials.smallTileWhite);
			createBlock (Materials.smallTileYellow);
			createBlock (Materials.smallTileClay);
			createBlock (Materials.smallTileConcrete);
			createBlock (Materials.smallTileQuartz);
			createBlock (Materials.smallTileSlate);

			
			createStairs (Materials.smallTileBlue);
			createStairs (Materials.smallTileBrown);
			createStairs (Materials.smallTileCyan);
			createStairs (Materials.smallTileGreen);
			createStairs (Materials.smallTileGrey);
			createStairs (Materials.smallTileLightBlue);
			createStairs (Materials.smallTileLightGrey);
			createStairs (Materials.smallTileLime);
			createStairs (Materials.smallTileMagenta);
			createStairs (Materials.smallTileOrange);
			createStairs (Materials.smallTilePink);
			createStairs (Materials.smallTilePurple);
			createStairs (Materials.smallTileRed);
			createStairs (Materials.smallTileWhite);
			createStairs (Materials.smallTileYellow);
			createStairs (Materials.smallTileClay);
			createStairs (Materials.smallTileConcrete);
			createStairs (Materials.smallTileQuartz);
			createStairs (Materials.smallTileSlate);
		}
		
		if (Options.enableLargeTile) {
			createBlock (Materials.largeTileBlue);
			createBlock (Materials.largeTileBrown);
			createBlock (Materials.largeTileCyan);
			createBlock (Materials.largeTileGreen);
			createBlock (Materials.largeTileGrey);
			createBlock (Materials.largeTileLightBlue);
			createBlock (Materials.largeTileLightGrey);
			createBlock (Materials.largeTileLime);
			createBlock (Materials.largeTileMagenta);
			createBlock (Materials.largeTileOrange);
			createBlock (Materials.largeTilePink);
			createBlock (Materials.largeTilePurple);
			createBlock (Materials.largeTileRed);
			createBlock (Materials.largeTileWhite);
			createBlock (Materials.largeTileYellow);
			createBlock (Materials.largeTileClay);
			createBlock (Materials.largeTileConcrete);
			createBlock (Materials.largeTileQuartz);
			createBlock (Materials.largeTileSlate);

			
			createStairs (Materials.largeTileBlue);
			createStairs (Materials.largeTileBrown);
			createStairs (Materials.largeTileCyan);
			createStairs (Materials.largeTileGreen);
			createStairs (Materials.largeTileGrey);
			createStairs (Materials.largeTileLightBlue);
			createStairs (Materials.largeTileLightGrey);
			createStairs (Materials.largeTileLime);
			createStairs (Materials.largeTileMagenta);
			createStairs (Materials.largeTileOrange);
			createStairs (Materials.largeTilePink);
			createStairs (Materials.largeTilePurple);
			createStairs (Materials.largeTileRed);
			createStairs (Materials.largeTileWhite);
			createStairs (Materials.largeTileYellow);
			createStairs (Materials.largeTileClay);
			createStairs (Materials.largeTileConcrete);
			createStairs (Materials.largeTileQuartz);
			createStairs (Materials.largeTileSlate);

		}
		if (Options.enableSlate) {
			createBlock(Materials.slate);
			createSlab(Materials.slate);
			createDoubleSlab(Materials.slate);
			createStairs(Materials.slate);
			createWall(Materials.slate);
			createOre(Materials.slate);
		}
		if (Options.enableSlate) {
			createBlock(Materials.concrete);
			createSlab(Materials.concrete);
			createDoubleSlab(Materials.concrete);
			createStairs(Materials.concrete);
			createWall(Materials.concrete);


		}		


		initDone = true;
	}
}
