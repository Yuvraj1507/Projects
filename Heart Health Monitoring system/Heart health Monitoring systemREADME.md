# Heart Health Monitoring System

This project is a real-time health monitoring system designed to track heart rate, body temperature, and GPS location of a patient. The system uses Arduino and several sensors to monitor the user's health data and send alerts in case of an emergency.

## Components Used
- **Arduino Uno**
- **Pulse Sensor** (Heart rate sensor)
- **DHT11 Sensor** (Temperature sensor)
- **GPS Module** (e.g., NEO-6M)
- **GSM Module** (SIM800L)
- **LCD Display** (16x2 I2C)
- **Buzzer** (for emergency alert)
- **External Power Supply**

## Features
- **Heart Rate Monitoring**: Measures the user's heart rate using a pulse sensor.
- **Temperature Monitoring**: Monitors the body temperature using a DHT11 sensor.
- **Location Tracking**: Tracks the geographical location using a GPS module.
- **Emergency Alert System**: Sends SMS alerts via GSM if the health data is critical.

## How to Use
1. Connect the sensors to the Arduino as per the wiring diagram.
2. Upload the provided code to the Arduino using the Arduino IDE.
3. Monitor the LCD display for real-time data (Heart Rate, Temperature, Location).
4. The GSM module will send SMS alerts if critical values are detected.

## Libraries Used
- **TinyGPS++**: For GPS data processing.
- **DHT Sensor Library**: For reading temperature data.
- **LiquidCrystal I2C**: For displaying data on the LCD.

## License
This project is open-source and available under the MIT License.
