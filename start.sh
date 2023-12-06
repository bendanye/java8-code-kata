#!/bin/bash

SCRIPT_DIR=$( dirname -- "$0"; )

DATA_FILE="$SCRIPT_DIR/time_taken.txt"

if ! test -f "$DATA_FILE"; then
    echo "start_date,time_taken_in_secs,category,notes" > $DATA_FILE
fi

START=$(date +%s)

echo "java8-code-kata Started. Please any keys to stop"
read

END=$(date +%s)
secs=$((END-START))

START_FORMATTED=$(date -r $START '+%Y-%m-%d %H:%M:%S')
echo "$START_FORMATTED,$secs,<<CATEGORY>>,NA" >> $DATA_FILE

echo "java8-code-kata Completed!"