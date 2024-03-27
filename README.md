# Proof-of-Concept Auction Program

> **Completed for PROG2400 Final Project**
>
> Lauren MacDonald, March 2024
>
> **Languages/Concepts**: Java, Data Structures and Algorithms

## Documentation
### Description
A proof of concept program that runs in the console. In a real world application this would take user input for creating an account and bidding in auction.
This program implements the Priority Queue data structure.

This program will be written in Java and require the following:
-	A ‘profile’ for Bidders: Attributes include a unique ID, name, email, winner status (true or false).
-	A classification for Bids: Attributes include a Bidder object and bid amount value (integer).
-	A user can sign up as a Bidder and create a new profile. They may link their banking information to this account to pay for the auction items should they win with the highest bid.
-	An auction will be timed, meaning that the auction will only allow bids to be placed in a specified time frame and will be down to the second.
-	As bids are added to the auction item, the minimum bid amount will be updated. This amount will reflect the most up-to-date highest bid and the Bidders must submit an amount higher than this minimum bid amount. This minimum bid amount will be automatically updated on the screen so the Bidder can accurately determine the amount to bid.
-	If two bids of the same price are submitted to the auction in a time frame that does not allow time for the system to provide feedback of the minimum amount, the auction will have been closed in a tie.
-	When a tie is called the tied Bidders will be notified of the tie and the auction will be restarted with the minimum amount starting at the tied bid plus $1 CAD.
-	If there is not a tie, the winner will be determined by which Bidder submitted the highest bid. The winning Bidder’s winning status will be changed to ‘true’ within the system and the winner will be notified. All losers who bid in the auction will be notified of their loss.

## Screenshots
![image](https://github.com/laurenmacdonald/PROG2400_Final_Project/assets/117761702/d5a96713-09c3-42bd-afda-406f67161aa0)


![image](https://github.com/laurenmacdonald/PROG2400_Final_Project/assets/117761702/94fb6b16-0355-4782-9cc7-12aa83209de3)

