names = ["jim", "pam", "sue", "tom"]

def add_name():
    new_name = input("Add a name:")
    names.append(new_name)
    print(names)
    add_name()

add_name()