package org.lessons.java.bonus;

class Creator {
    public Device create(String deviceType) {
        if (deviceType.equalsIgnoreCase("lettore dvd")) {
            return new LettoreDvd();
        } else if (deviceType.equalsIgnoreCase("playstation")) {
            return new Playstation();
        } else {
            throw new IllegalArgumentException("Tipo di dispositivo sconosciuto: " + deviceType);
        }
    }
}
