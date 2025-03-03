import random
import os

def clear():
    os.system("cls" if os.name == "nt" else "clear")

def print_hangman(values):
    print()
    print("\t +-------+")
    print("\t |      | |")
    print("\t {}      | |".format(values[0]))
    print("\t{}{}{}     | |".format(values[1], values[2], values[3]))
    print("\t {}      | |".format(values[4]))
    print("\t{} {}     | |".format(values[5], values[6]))
    print("\t        | |")
    print("  _____________|_|___")
    print("  ```````````````````")
    print()

def print_hangman_win():
    print()
    print("\t +-------+")
    print("\t        | |")
    print("\t        | |")
    print("\t O      | |")
    print("\t/|\\     | |")
    print("\t |      | |")
    print("  _____/_\\______|_|___")
    print("  ````````````````````")
    print()

def print_word(values):
    print("\t", end="")
    print(" ".join(values))  # Fixed function to display the word correctly

def check_win(values):
    return "_" not in values  # Fixed logic to check all characters

def hangman_game(word):
    clear()

    word_display = []
    correct_letters = []
    incorrect = []
    chances = 0

    hangman_values = ['O', '/', '|', '\\', '|', '/', '\\']
    show_hangman_values = [' ', ' ', ' ', ' ', ' ', ' ', ' ']

    for char in word:
        if char.isalpha():
            word_display.append('_')
            correct_letters.append(char.upper())
        else:
            word_display.append(char)

    while True:
        print_hangman(show_hangman_values)
        print_word(word_display)
        print()
        print("Incorrect characters:", incorrect)
        print()

        inp = input("Enter a character: ").strip()
        if len(inp) != 1 or not inp.isalpha():
            clear()
            print("Wrong choice! Try again.")
            continue

        if inp.upper() in incorrect:
            clear()
            print("Already tried!")
            continue

        if inp.upper() not in correct_letters:
            incorrect.append(inp.upper())
            show_hangman_values[chances] = hangman_values[chances]
            chances += 1

            if chances == len(hangman_values):
                clear()
                print("\tGAME OVER!!!")
                print_hangman(hangman_values)
                print("The word was:", word.upper())  # Fixed print statement
                break
        else:
            for i in range(len(word)):
                if word[i].upper() == inp.upper():
                    word_display[i] = inp.upper()

        if check_win(word_display):
            clear()
            print("\tCongratulations!")
            print_hangman_win()
            print("The word is:", word.upper())
            break

    clear()

if __name__ == "__main__":
    clear()

    topics = {1: "food", 2: "Marvel characters", 3: "drinks"}

    dataset = {
        "food": ["burger", "pizza", "bread", "sushi", "kottu", "fried rice", "apple", "salad", "cake", "biscuit"],
        "Marvel characters": ["Captain America", "Hulk", "Thor", "Black Widow", "Hawkeye", "Iron Man", "Loki", "Black Panther", "Thanos", "Gamora"],
        "drinks": ["coffee", "boba tea", "nescafe", "milkshake", "water", "orange juice", "bubble tea"]
    }

    while True:
        print()
        print("----------------------------------")
        print("\t\tGAME MENU")
        print("----------------------------------")
        for key in topics:
            print("Press", key, "to select", topics[key])
        print("Press", len(topics) + 1, "to quit")
        print()

        try:
            choice = int(input("Enter your choice: "))
        except ValueError:
            clear()
            print("Wrong choice! Try again.")
            continue

        if choice > len(topics) + 1 or choice < 1:
            clear()
            print("No such topic! Try again.")
            continue

        elif choice == len(topics) + 1:
            print()
            print("Thank you for playing!")
            break

        chosen_topic = topics[choice]  # Fixed incorrect variable name

        word_to_guess = random.choice(dataset[chosen_topic])  # Fixed dictionary key lookup

        hangman_game(word_to_guess)
