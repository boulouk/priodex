package edu.uci.ics.configuration;

public class Broker {
	private String host;
	private int port;
	
	public Broker(String host, int port) {
		this.host = host;
		this.port = port;
	}
	
	public String getHost() {
		return (host);
	}
	
	public int getPort() {
		return (port);
	}

}
