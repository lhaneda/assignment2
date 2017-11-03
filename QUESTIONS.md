# Program 2: Written Component

Please edit this file to include your responses to each question below. The responses don't have to be long (2-3 sentences is fine), but make sure you answer the question completely and explain your logic.

**1.)** *Have you used (or mined) a cryptocurrency before? Do you think these technologies will catch on and continue to grow, or is this yet another passing fad?*

(answer)
No, I haven't had the chance to use cryptocurrency before. As technology advances, I think that cryptocurrency will grow into our culture as physical dollar bills continue dissappear.

**2.)** *Performance Evaluation: List the block data string, difficulty, nonce found, and the execution time for five executions of your program as you varied the number of processes / machines used.*

| Execution Number | Number of Processes | Block Data String | Difficulty | Nonce      | Execution Time |
| ---------------- | ------------------- | ----------------- | ---------- | ---------- | -------------- |
| 1 (Example)      | 1                   | 'Hello World!'    | 22         | 1175568    | 2.63 s         |
| 2                |                     |                   |            |            |                |
| 3                |                     |                   |            |            |                |
| 4                |                     |                   |            |            |                |
| 5                |                     |                   |            |            |                |

Does a pattern emerge here? Why or why not?

(answer)

What is the highest throughput you were able to achieve on your own machine, as well as the Jetson cluster (in hashes per second)?

(answer)

**3.)** *When evaluating parallel programs, we use speedup and efficiency. Why are these metrics not as useful when measuring the performance of our parallel cryptocurrency miner?*

(answer) 
Because mining involves a lot of space, the speedup and efficiency may not be the best indicater for performance evaluation. 

**4.)** *What was the most difficult aspect of parallelizing your program? Was this program harder or easier to complete than the previous program? In version 2.0, what features would you add?*

(answer)

**5.)** *Our program serves as a decent approximation of the actual Bitcoin mining process. However, there is one key part missing: timestamps. An actual bitcoin block will contain the time that the block was "discovered" (successful hash inversion performed). Why is this necessary in a real cryptocurrency?*

(answer)
Timestamp is important because it allows for the security of the cryptocurrency. The timestamp is the proof that the coin existed and makes it harder for someone to copy the orginal data.
