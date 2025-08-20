def zero_sum_subarrays(arr):
    result = []
    prefix_sum = 0
    prefix_map = {}  # prefix_sum -> list of indices

    for i, num in enumerate(arr):
        prefix_sum += num

        # Case 1: Subarray from 0 to i
        if prefix_sum == 0:
            result.append((0, i))

        # Case 2: Subarray found from j+1 to i
        if prefix_sum in prefix_map:
            for j in prefix_map[prefix_sum]:
                result.append((j + 1, i))

        # Add current index to prefix_map
        prefix_map.setdefault(prefix_sum, []).append(i)

    return result
print(zero_sum_subarrays([1, 2, -3, 3, -1, 2]))