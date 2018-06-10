def mergeMain(left, right, arr):
    i = 0
    j = 0
    k = 0

    # when i and k both have elements in them
    while (i < len(left) and j < len(right)):

        if left[i] <= right[j]:
            arr[k] = left[i]
            i += 1
        else:
            arr[k] = right[j]
            j += 1
        k += 1

    # when i has some more elements in int

    while i < len(left):
        arr[k] = left[i]
        i += 1
        k += 1

    while j < len(right):
        arr[k] = right[j]
        j += 1
        k += 1
    # print("The arr value is {}".format(arr))
    return arr


def mergeSort(arr):
    if len(arr) < 2:
        return "Array size is less than 2"

    mid = int(len(arr) / 2)
    left = arr[0:mid]
    right = arr[mid:len(arr)]

    mergeSort(left)
    mergeSort(right)
    return mergeMain(left, right, arr)


arr_to_sort = [6, 8, -3, 6, 5, 9, 20, -75]
out = mergeSort(arr_to_sort)
print(out)



