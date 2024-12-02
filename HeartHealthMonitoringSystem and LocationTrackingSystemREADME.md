# Heart Health Monitoring and Location Tracking System

This project integrates heart health monitoring and real-time location tracking using **Arduino Uno**. It monitors heart rate, triggers alerts for abnormal heart rates, and sends location updates via **SMS** using a **GSM module**. The location is tracked using a **GPS module** and displayed on an **LCD**.
HARDWARE ~
## Components Used:
- **Arduino Uno**
- **Pulse Sensor** (Heart Rate Sensor)
- **NEO-6M GPS Module**
- **SIM800L GSM Module**
- **16x2 LCD Display with I2C**
- **Buzzer** (for alerts) 

## ### Wiring the Components:
1. **Heart Rate Sensor** (Pulse Sensor):
   - VCC → 5V on Arduino
   - GND → GND on Arduino
   - Signal → Analog pin A0 on Arduino

2. **GPS Module** (NEO-6M):
   - VCC → 5V on Arduino
   - GND → GND on Arduino
   - TX → Pin 4 on Arduino (RX)
   - RX → Pin 3 on Arduino (TX)

3. **GSM Module** (SIM800L):
   - VCC → External 5V Power Supply (ensure stable 5V)
   - GND → GND on Arduino
   - TX → Pin 7 on Arduino
   - RX → Pin 8 on Arduino

4. **LCD Display** (16x2 with I2C):
   - VCC → 5V on Arduino
   - GND → GND on Arduino
   - SDA → Pin A4 on Arduino
   - SCL → Pin A5 on Arduino

5. **Buzzer** (for alerts):
   - VCC → 5V on Arduino
   - GND → GND on Arduino
   - Signal → Pin 9 on Arduino

SOFTWARE ~
## Features
- **Simulated Health Data**: Simulates heart rate, body temperature, and location (latitude and longitude) updates.
- **Real-Time Dashboard**: The frontend updates every 5 seconds without page refresh.
- **Alerts**: Displays alerts for abnormal health metrics (e.g., low heart rate, high fever).
- **Backend API**: Flask server provides health data through an API endpoint (`/health_data`).
- **Multi-Threading**: Health data is updated in the background using threads.

 ## Files:
- 'heart_rate_monitor.py': Simulates heart rate monitoring and alerting.
- 'location_monitor.py': Simulates GPS location tracking.
- 'app.py': Flask Web Server
- 'dashboard.html': Frontend <Frontend dashboard to display health data>
- 'view_data.html': Display all the stored health data records from the database.
- 'Plotly.js': To visualize the heart rate and body temperature data and real-time line graphs.
- 'health_data.db': SQLite database used to store such as heart rate, body temperature, and GPS coordinates) for tracking and analysis over time.
- 'pySerial': Python to communicate with Arduino via Serial Communication or other interfaces.

PYTHON CODE TO READ DATA FROM ARDUINO
import serial
import time

# Open serial connection to Arduino (adjust the port and baud rate)
arduino = serial.Serial('COM3', 9600)  # Change 'COM3' to your Arduino's port

time.sleep(2)  # Give Arduino some time to initialize

while True:
    # Read a line from Arduino
    data = arduino.readline().decode('utf-8').strip()
    
    # Process the incoming data (assuming Arduino sends heart rate and GPS data)
    if data.startswith("Heart Rate:"):
        heart_rate = data.split(":")[1]
        print(f"Heart Rate: {heart_rate} BPM")
    
    elif data.startswith("Lat:"):
        latitude = data.split(":")[1]
        print(f"Latitude: {latitude}")
    
    elif data.startswith("Lon:"):
        longitude = data.split(":")[1]
        print(f"Longitude: {longitude}")
    
    time.sleep(1)  # Adjust delay as necessary


## How to Set Up:
1. Connect the components as described in the wiring guide above.
2. Upload the heart_rate_monitor.ino code to the Arduino.
3. Test the system by monitoring the LCD display and checking if SMS alerts are sent when the heart rate is critical or location is updated.

## Note:
This project requires an external 5V power supply for the GSM module.

