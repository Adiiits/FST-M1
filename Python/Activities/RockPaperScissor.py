
while True:
    player1_ans = (input("Enter choice 1: rock, paper or scissors?")).lower()
    player2_ans = (input("Enter choice 2: rock, paper or scissors?")).lower()

    if(player1_ans == player2_ans):
        print("tie")
    elif(player1_ans=='rock'):
        if(player2_ans=='scissors'):
            print("rock win")
        else: print("paper win")  

    elif(player1_ans=="scissors"):
        if(player2_ans=="paper"):
            print("scissors win")
        else: print("rock win")  

    elif(player1_ans=="paper"):
        if(player2_ans=="rock"):
            print("paper win")
        else: print("scissiors win") 

    else: print("invalid input")  

    flag = input("want to play more-yes/no?")
    if(flag=="no"):
        raise SystemExit
    else:
        True


