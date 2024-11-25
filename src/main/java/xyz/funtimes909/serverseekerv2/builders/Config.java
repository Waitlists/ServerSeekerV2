package xyz.funtimes909.serverseekerv2.builders;

import com.google.gson.annotations.SerializedName;

public class Config {
    @SerializedName("connection_timeout")
    private int connectionTimeout;
    private String token;
    @SerializedName("postgres_url")
    private String postgresUrl;
    @SerializedName("postgres_user")
    private String postgresUser;
    @SerializedName("postgres_password")
    private String postgresPassword;
    @SerializedName("ignore_bots")
    private boolean ignoreBots;
    @SerializedName("ip_lookups")
    private boolean ipLookups;
    @SerializedName("player_tracking")
    private boolean playerTracking;
    @SerializedName("masscan_conf")
    private String masscanConfigLocation;
    @SerializedName("masscan_output")
    private String masscanOutput;

    // Getters
    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public String getToken() {
        return token;
    }

    public String getPostgresUrl() {
        return postgresUrl;
    }

    public String getPostgresUser() {
        return postgresUser;
    }

    public String getPostgresPassword() {
        return postgresPassword;
    }

    public boolean getIgnoreBots() {
        return ignoreBots;
    }

    public boolean getIpLookups() {
        return ipLookups;
    }

    public boolean getPlayerTracking() {
        return playerTracking;
    }

    public String getMasscanConfigLocation() {
        return masscanConfigLocation;
    }

    public String getMasscanOutput() {
        return masscanOutput;
    }
}
