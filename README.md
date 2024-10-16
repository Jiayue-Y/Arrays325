assignments

The time complexity for LegCount is expected to be less than O(n^2), with the worst scenario being O(n^2). Because even 
though it is a nested for loop, the inside loop would be terminated once the words match. Therefore, unless there is no
matching words, the time complexity would be less than O(n^2), with the best scenario case being O(2n). Its space complexity
is optimal, with the variables of count, the default String array and the array being examined.

The time complexity for MergeData could range from O(1) to O(2n), depending on the inputs. The space complexity includes
at least two integer arrays, and could also have three integer indexes depending on the situaion. 