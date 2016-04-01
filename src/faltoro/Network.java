package faltoro;



abstract class Network {

	protected GameState gamestate;
	
	Network(GameState gs) {
		gamestate=gs;
	}
	
	abstract void connect(String ip);

	abstract void disconnect();

	abstract void send(GameState gs);
}
