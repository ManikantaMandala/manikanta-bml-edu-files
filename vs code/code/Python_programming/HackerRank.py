import os
import sys

#
# Complete the simpleArraySum function below.
#
def simpleArraySum(ar):
    return ar[len(ar)-1]+simpleArraySum(ar[0:len(ar)-1])
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    ar_count = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = simpleArraySum(ar)

    fptr.write(str(result) + '\n')

    fptr.close()
