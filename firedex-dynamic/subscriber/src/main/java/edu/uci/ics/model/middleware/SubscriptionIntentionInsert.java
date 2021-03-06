package edu.uci.ics.model.middleware;

import java.util.List;

public class SubscriptionIntentionInsert {
	private String identifier;
	private String host;
	
	private List<SubscriptionIntention> subscriptions;

	public SubscriptionIntentionInsert(String identifier, String host, List<SubscriptionIntention> subscriptions) {
		this.identifier = identifier;
		this.host = host;
		this.subscriptions = subscriptions;
	}
	
	public String getIdentifier() {
		return (identifier);
	}
	
	public String getHost() {
		return (host);
	}
	
	public List<SubscriptionIntention> getSubscriptions() {
		return (subscriptions);
	}

}
