def find_sum(arr, target):
    index = [-1, -1]
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] + arr[j] == target:
                index[0] = j
                index[1] = i
                return index
    return None

def main():
    arr = [2, 3, 45, 2, 6, 7, 8]
    target = 4
    index = find_sum(arr, target)
    if index is not None:
        print("indexes are:", index[0], ",", index[1])
    else:
        print("No such pair found")

if __name__ == "__main__":
    main()
