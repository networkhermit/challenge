import time

if __name__ == "__main__":
    print("When’s Weekend?")

    today = time.localtime().tm_wday

    if today == 6:
        print("Today.")
    elif today == 5:
        print("Today.")
    elif today == 4:
        print("Tomorrow.")
    elif today == 3:
        print("In two days.")
    else:
        print("Too far away.")
