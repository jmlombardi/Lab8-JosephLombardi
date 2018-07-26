## Joseph Lombardi
### COMP 271
### Lab 8
#### Due 07/25/2018


### Questions

##### Try using a TreeMap instead of a HashMap. Does this make any difference?

   In our case it wouldn't make any difference because we are not sorting by keys, we are only counting the total number of occurrences for the values.  Also we do not have any null keys.

##### What happens if you invoke countWords multiple times for different String iterators?

   We will keep appending to our HashMap if we are not creating a new instance of WordCounter.
##### What crucial role does the Iterator abstraction play in making WordCounter testable?
   
   We can just create a list on the fly and make it iterable and then pass it to countWords without having to actually read in any text file.