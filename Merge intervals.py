
#class Interval:
#  def __init__(self, start, end):
#    self.start = start
#    self.end = end

#  def print_interval(self):
#    print("[" + str(self.start) + ", " + str(self.end) + "]", end='')

class Solution:
  def merge(self, intervals):
    mergedIntervals = []
    # TODO: Write your code here
    if len(intervals) < 2:
      return intervals

    intervals.sort(key=lambda x:x.start)
      
    start = intervals[0].start
    end = intervals[0].end

    for inter in range(1, len(intervals)):
      if(end >= intervals[inter].start):
        end = max(intervals[inter].end, end)
      else:
        mergedIntervals.append(Interval(start, end))
        start = intervals[inter].start
        end = intervals[inter].end

    mergedIntervals.append(Interval(start, end))
    return mergedIntervals
