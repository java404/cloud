package com.example.demo.client.general;

import java.util.Objects;

public class TargetHost {
    private final String address;
    private final int port;
    private final String username;
    private final String password;

    /** Target Host (Hippo host don't support account info). */
    public TargetHost(String address, int port) {
        this(address, port, "", "");
    }

    /** Target Host. */
    public TargetHost(String address, int port, String username, String password) {
        this.address = address;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    /** Make server url. */
    String makeServerUrl(boolean isHttps) {
        return String.format("%s://%s:%d", isHttps ? "https" : "http", this.address, this.port);
    }

    public String getAddress() {
        return address;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "TargetHost{"
                + "address='" + address + '\''
                + ", port=" + port
                + ", username='" + username + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final TargetHost that = (TargetHost) o;
        return port == that.port && address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, port);
    }
}
