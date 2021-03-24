class Solution(object):
    def distributeCandies(self, candyType):
        """
        :type candyType: List[int]
        :rtype: int
        """


        """divide array for num of candies
        get number of types
        return the smaller of types and array length"""
        
        leng = len(candyType)/2
        
        setC = {2}
        setC.clear()
        for can in candyType:
            setC.add(can)

        cantype = len(setC)

        if cantype < leng:
            return cantype
        else:
            return leng