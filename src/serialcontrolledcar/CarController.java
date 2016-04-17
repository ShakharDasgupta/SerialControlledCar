/*
 * Copyright (C) 2016 Shakhar Dasgupta<sdasgupt@oswego.edu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package serialcontrolledcar;

/**
 *
 * @author Shakhar Dasgupta<sdasgupt@oswego.edu>
 */
public class CarController {
    
    private static final byte STOP = 0;
    private static final byte FORWARD_SLOW = 1;
    private static final byte FORWARD_MEDIUM = 2;
    private static final byte FORWARD_FAST = 3;
    private static final byte BACKWARD_SLOW = 4;
    private static final byte BACKWARD_MEDIUM = 5;
    private static final byte BACKWARD_FAST = 6;
    private static final byte LED1R_OFF = 7;
    private static final byte LED1R_ON = 8;
    private static final byte LED1G_OFF = 9;
    private static final byte LED1G_ON = 10;
    private static final byte LED1B_OFF = 11;
    private static final byte LED1B_ON = 12;
    private static final byte LED2R_OFF = 13;
    private static final byte LED2R_ON = 14;
    private static final byte LED2G_OFF = 15;
    private static final byte LED2G_ON = 16;
    private static final byte LED2B_OFF = 17;
    private static final byte LED2B_ON = 18;
    
    private final SerialWriter serialWriter;
    private final String port;
    
    public CarController(String port) {
        this.serialWriter = new SerialWriter(port);
        this.port = port;
    }
    
    public void turnOffLED1Red() {
        serialWriter.write(LED1R_OFF);
    }
    
    public void turnOnLED1Red() {
        serialWriter.write(LED1R_ON);
    }
    
    public void turnOffLED1Green() {
        serialWriter.write(LED1G_OFF);
    }
    
    public void turnOnLED1Green() {
        serialWriter.write(LED1G_ON);
    }
    public void turnOffLED1Blue() {
        serialWriter.write(LED1B_OFF);
    }
    
    public void turnOnLED1Blue() {
        serialWriter.write(LED1B_ON);
    }
    
    public void turnOffLED2Red() {
        serialWriter.write(LED2R_OFF);
    }
    
    public void turnOnLED2Red() {
        serialWriter.write(LED2R_ON);
    }
    
    public void turnOffLED2Green() {
        serialWriter.write(LED2G_OFF);
    }
    
    public void turnOnLED2Green() {
        serialWriter.write(LED2G_ON);
    }
    public void turnOffLED2Blue() {
        serialWriter.write(LED2B_OFF);
    }
    
    public void turnOnLED2Blue() {
        serialWriter.write(LED2B_ON);
    }
    
    public void stop() {
        serialWriter.write(STOP);
    }
    
    public void goForwardSlow() {
        serialWriter.write(FORWARD_SLOW);
    }
    
    public void goForwardMedium() {
        serialWriter.write(FORWARD_MEDIUM);
    }
    
    public void goForwardFast() {
        serialWriter.write(FORWARD_FAST);
    }
    
    public void goBackwardSlow() {
        serialWriter.write(BACKWARD_SLOW);
    }
    
    public void goBackwardMedium() {
        serialWriter.write(BACKWARD_MEDIUM);
    }
    
    public void goBackwardFast() {
        serialWriter.write(BACKWARD_FAST);
    }
}
