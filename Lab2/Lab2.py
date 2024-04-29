def check_state(t, s):
    t = t.replace(" ", "")
    s = s.replace(" ", "")
    t_size = len(t)
    s_size = len(s)
    if t_size == s_size:
        return True
    else:
        return False

def anagram(t, s):
    size = len(t)
    condition = check_state(t, s)
    if condition:
        for i in range(size):
            for j in range(size):
                if t[i] == s[j]:
                    break
                elif j == size - 1 and t[i] != s[j]:
                    return False
        return True
    return False

def main():
    t = input("first: ")
    s = input("next: ")
    print(anagram(t, s))

if __name__ == "__main__":
    main()
