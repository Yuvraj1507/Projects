import random
import time

# Function to simulate GPS data (random latitude and longitude)
def get_location():
    latitude = random.uniform(12.0, 15.0)  # Random latitude between 12 and 15
    longitude = random.uniform(77.0, 80.0)  # Random longitude between 77 and 80
    return latitude, longitude

# Function to display the current location (latitude and longitude)
def display_location(latitude, longitude):
    print(f"Current Location: Latitude: {latitude}, Longitude: {longitude}")

# Function to simulate sending the location (e.g., SMS)
def send_location_sms(latitude, longitude):
    message = f"Current Location: Latitude: {latitude}, Longitude: {longitude}"
    print(f"Simulating sending SMS: {message}")
    # You could integrate Twilio for real SMS functionality here.

# Main loop for continuous location tracking
while True:
    latitude, longitude = get_location()  # Simulate GPS data
    display_location(latitude, longitude)  # Display the coordinates
    send_location_sms(latitude, longitude)  # Simulate sending location via SMS
    time.sleep(5)  # Simulate a 5-second interval for updating location
