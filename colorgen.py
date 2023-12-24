import pyautogui
import keyboard

# Initialize start and end positions
start_position = (0, 0)
end_position = (0, 0)

# Set the logical range
logical_range = 600

def get_mouse_position():
    # Get the current mouse cursor position
    x, y = pyautogui.position()
    return x, y

def set_start_position():
    global start_position
    start_position = get_mouse_position()
    print(f"Start Position set to {start_position}")

def set_end_position():
    global end_position
    end_position = get_mouse_position()
    print(f"End Position set to {end_position}")

def map_to_logical_rangeX(value, start, end, logical_start, logical_end):
    # Map a value from the start-end range to the logical_start-logical_end range
    return int(logical_start + (logical_end - logical_start) * ((value - start) / (end - start)))

def map_to_logical_rangeY(value, start, end, logical_start, logical_end):
    # Map a value from the start-end range to the logical_start-logical_end range
    return int(logical_end - (logical_end - logical_start) * ((value - start) / (end - start))) 

def update_logical_position():
    global start_position, end_position, logical_range
    current_position = get_mouse_position()

    # Map the x and y positions to the logical range
    logical_x = map_to_logical_rangeX(current_position[0], start_position[0], end_position[0], 0, logical_range)
    logical_y = map_to_logical_rangeY(current_position[1], start_position[1], end_position[1], 0, logical_range)

    return logical_x, logical_y

def print_logical_position():
    logical_pos = update_logical_position()
    print(f"Logical Position: x={logical_pos[0]}, y={logical_pos[1]}")

def main():
    try:
        while True:
            # Check if the 'g' key is pressed to set the start position
            if keyboard.is_pressed('g'):
                set_start_position()

            # Check if the 'h' key is pressed to set the end position
            if keyboard.is_pressed('h'):
                set_end_position()

            # Check if the space bar is pressed to print the logical position
            if keyboard.is_pressed('space'):
                print_logical_position()
            
            # Optional: Add a delay to reduce the number of checks per second
            pyautogui.sleep(0.1)
            
    except KeyboardInterrupt:
        print("\nMouse cursor detection stopped.")

if __name__ == "__main__":
    main()
