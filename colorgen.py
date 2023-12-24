import pyautogui
import keyboard

# Initialize start and end positions
start_position = (0, 0)
end_position = (0, 0)

# Set the logical range
logical_range = 600

# Output file name
output_file_name = "output.txt"

# Initialize color variables c1 to c10
colors = ['c0', 'c1', 'c2', 'c3', 'c4', 'c5', 'c6', 'c7', 'c8', 'c9', 'c10']
current_color_index = 0

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

def map_to_logical_rangeX(start, end, curr):
    # Map a value from the start-end range to the logical_start-logical_end range
    return int(((curr - start) * (600 / (end - start))))

def map_to_logical_rangeY(start, end, curr):
    # Map a value from the start-end range to the logical_start-logical_end range
    return int(((curr - end) * (600 / (start - end))))

def update_logical_position():
    global start_position, end_position, logical_range
    current_position = get_mouse_position()

    # Map the x and y positions to the logical range
    logical_x = map_to_logical_rangeX(start_position[0], end_position[0], current_position[0])
    logical_y = map_to_logical_rangeY(start_position[1], end_position[1], current_position[1])

    return logical_x, logical_y

def set_current_color(index):
    global current_color_index
    current_color_index = index

def get_last_line(file_path):
    try:
        with open(file_path, 'r') as file:
            lines = file.readlines()
            return lines[-1].strip() if lines else None
    except FileNotFoundError:
        return None

def print_logical_position():
    logical_pos = update_logical_position()
    current_color = colors[current_color_index]
    output_str = f"buffer = floodFill(buffer, {logical_pos[0]}, {logical_pos[1]}, myColor.{current_color});\n"

    # Check if the last line in the file is the same as the current output
    last_line = get_last_line(output_file_name)
    print(last_line)
    print(output_str)
    print(last_line == output_str)
    last_line = get_last_line(output_file_name)
    if last_line and last_line.strip() == output_str.strip():
        print("Skipping duplicate line.")
    else:
        # print(output_str)

        # Write the output to the file
        with open(output_file_name, "a") as output_file:
            output_file.write(output_str)

def main():
    try:
        while True:
            # Check if the 'g' key is pressed to set the start position
            if keyboard.is_pressed('g'):
                set_start_position()

            # Check if the 'h' key is pressed to set the end position
            if keyboard.is_pressed('h'):
                set_end_position()

            # Check if a numeric key (0-9) is pressed to set the current color
            for i in range(10):
                if keyboard.is_pressed(str(i)):
                    set_current_color(i if i != 0 else 10)
                    print("color set to ", current_color_index)

            # Check if the space bar is pressed to print the logical position
            if keyboard.is_pressed('space'):
                print_logical_position()

            # Optional: Add a delay to reduce the number of checks per second
            pyautogui.sleep(0.1)

    except KeyboardInterrupt:
        print("\nMouse cursor detection stopped.")

if __name__ == "__main__":
    main()
