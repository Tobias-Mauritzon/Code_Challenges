def judgeCircle(moves):
    """
    :type moves: str
    :rtype: bool
    """
    left = 0;
    up = 0;
    
    for element in moves:
        if(element == 'L'):
            left+=1
        elif(element == 'R'):
            left-=1
        elif(element == 'U'):
            up+=1
        else:
            up-=1
    return (left == 0 and up == 0)

print(judgeCircle("UD"))   
print(judgeCircle("UDD"))   