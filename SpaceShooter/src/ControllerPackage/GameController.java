package ControllerPackage;
import ModelPackage.*;
import ViewPackage.*;

public class GameController 
{
	//main game view and main game model
	static private GameView gameView;
	static private GameModel gameModel;
	
	static public GameMainMenuListener gameMainMenuListener; //listener which gets clicks events from main menu
	static public GameInterfaceListener gameInterfaceListener; //listener which gets clicks events from game interface
	static public GameSessionListener gameSessionListener; //key listener which contains Timer and is responsible for a game session
	
	public GameController(GameView gameView, GameModel gameModel) 
	{
		//assign given view and model
		setViewAndModel(gameView, gameModel);
		
		//assign listeners
		setListeners();
	}
	
	//assigning given view and model to those in class
	public void setViewAndModel(GameView gameView, GameModel gameModel)
	{
		//setting main view and main model;
		GameController.gameView = gameView;
		GameController.gameModel = gameModel;
	}
	
	//setting and assigning all listeners
	public void setListeners()
	{
		//setting and assigning main menu listener
		gameMainMenuListener = new GameMainMenuListener();
		GameController.gameView.addActionListenerMainMenu(gameMainMenuListener);
		
		//setting and assigning game interface and game session listener
		gameInterfaceListener = new GameInterfaceListener();
		GameController.gameView.addActionListenerGameInterface(gameInterfaceListener);
		gameSessionListener = new GameSessionListener();
		GameController.gameView.addKeyListenerGame(gameSessionListener);
	}
	
	static public GameView getGameView()
	{
		return gameView;
	}
	static public GameModel getGameModel()
	{
		return gameModel;
	}
}
