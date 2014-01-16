package org.hive2hive.core.model;

import java.security.PublicKey;

import org.hive2hive.core.TimeToLiveStore;
import org.hive2hive.core.network.data.NetworkContent;

/**
 * Raw data part of a file that is added to the DHT.
 * 
 * @author Nico, Seppi
 */
public class UserPublicKey extends NetworkContent {

	private static final long serialVersionUID = 1L;
	private final PublicKey publicKey;

	public UserPublicKey(PublicKey publicKey) {
		if (publicKey == null)
			throw new IllegalArgumentException("Public key can't be null.");
		this.publicKey = publicKey;
	}

	public PublicKey getPublicKey() {
		return publicKey;
	}

	@Override
	public int getTimeToLive() {
		return TimeToLiveStore.getInstance().getUserProfile();
	}
}
