import random
import time

# Function to simulate heart rate measurement (randomized)
def get_heart_rate():
    # Simulate heart rate (in beats per minute)
    return random.randint(60, 150)  # Example: random heart rate between 60 and 150 bpm

# Function to display the current heart rate
def display_heart_rate(heart_rate):
    print(f"Current Heart Rate: {heart_rate} bpm")

# Function to check heart rate against critical thresholds
def check_heart_rate(heart_rate):
    lower_threshold = 60
    upper_threshold = 120

    if heart_rate < lower_threshold:
        alert("Low heart rate detected!")
    elif heart_rate > upper_threshold:
        alert("High heart rate detected!")

# Function to simulate sending an alert (e.g., SMS)
def alert(message):
    print(f"ALERT: {message}")
    send_sms(message)

# Function to simulate sending an SMS
def send_sms(message):
    print(f"Simulating sending SMS with message: {message}")
    # In a real application, you could use Twilio or another API for SMS.

# Main loop for continuous heart rate monitoring
while True:
    heart_rate = get_heart_rate()  # Simulate heart rate
    display_heart_rate(heart_rate)  # Display heart rate
    check_heart_rate(heart_rate)  # Check if heart rate is within the normal range
    time.sleep(2)  # Simulate a 2-second interval for continuous monitoring
