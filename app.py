import random
import time
from flask import Flask, jsonify, render_template
import threading

app = Flask(__name__)

# Simulated health data
heart_rate = random.randint(60, 150)
body_temperature = random.uniform(35.0, 40.0)
latitude = random.uniform(12.0, 15.0)
longitude = random.uniform(77.0, 80.0)

# Functions to simulate heart rate, temperature, and location data
def get_heart_rate():
    return random.randint(60, 150)

def get_body_temperature():
    return random.uniform(35.0, 40.0)

def get_location():
    return random.uniform(12.0, 15.0), random.uniform(77.0, 80.0)

# Function to update health data every 5 seconds
def update_health_data():
    global heart_rate, body_temperature, latitude, longitude
    while True:
        # Simulate fetching updated values
        heart_rate = get_heart_rate()
        body_temperature = get_body_temperature()
        latitude, longitude = get_location()
        
        # Print the current values for debugging purposes
        print(f"Heart Rate: {heart_rate} bpm | Temperature: {body_temperature:.2f}°C | Location: ({latitude:.4f}, {longitude:.4f})")
        
        # Simulate a 5-second update interval
        time.sleep(5)

# Start the data update loop in a separate thread
data_thread = threading.Thread(target=update_health_data)
data_thread.daemon = True  # This makes the thread exit when the main program exits
data_thread.start()

# Route to serve the dashboard page
@app.route('/')
def index():
    return render_template('dashboard.html')

# API route to send the latest health data as JSON
@app.route('/health_data')
def health_data():
    return jsonify({
        'heart_rate': heart_rate,
        'body_temperature': body_temperature,
        'latitude': latitude,
        'longitude': longitude
    })

if __name__ == "__main__":
    app.run(debug=True)
