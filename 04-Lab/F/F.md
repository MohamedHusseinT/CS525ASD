# F 

Without Composite
Advantage: 
    - Fewer classes
    - Simpler for very small XML structures.
Disadvantage: 
    - Lots of nodes, attributes, nested nodes, etc. 
    - The code can become difficult to handle uniformly.


With Composite
    Advantage: 
        - Clean, uniform way of treating different node types. 
        - It’s flexible if your XML structures become more complex.
    Disadvantage: 
        - Leaf node still have the methods addChild() or removeChild(), which often must throw exceptions or do nothing. This can be confusing if used incorrectly in casae of transparent. In case of Safe, it can be moved to complex node class only



