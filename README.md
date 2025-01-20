# Concurrency Issue with Mutable ListBuffer and Parallel Collections in Scala

This repository demonstrates a common concurrency issue in Scala when using mutable `ListBuffer` with parallel collections.  The code attempts to process a `ListBuffer` in parallel, which leads to unpredictable results and potential exceptions.

## Problem

The primary problem is the use of a mutable `ListBuffer` with `par` (parallel collections).  Multiple threads concurrently accessing and modifying a mutable data structure without proper synchronization mechanisms will likely lead to data corruption and runtime errors.

## Solution

The solution involves replacing the mutable `ListBuffer` with an immutable data structure and leveraging Scala's efficient immutable collections.  This avoids concurrency issues, ensuring thread safety and predictable behavior.
