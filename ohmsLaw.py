print("Welcome! Today you are going to do calculations using Ohm's Law.")
print("Please select what you need to calculate:")
print("1 - Voltage\n2 - Resistance\n3 - Current")

choice = int(input("Enter your choice: "))

if choice == 1:
    current = float(input("Please enter Current: "))
    resistance = float(input("Please enter Resistance: "))
    voltage = current * resistance
    print("Voltage is", voltage, "V")

elif choice == 2:
    voltage = float(input("Please enter Voltage: "))
    current = float(input("Please enter Current: "))
    resistance = voltage / current
    print("Resistance is", resistance, "Ω")

elif choice == 3:
    voltage = float(input("Please enter Voltage (V): "))
    resistance = float(input("Please enter Resistance (Ω): "))
    current = voltage / resistance
    print("Current is", current, "A")

else:
    print("Invalid choice.")
