#!/bin/bash

if [ -z $BBB_HOSTNAME ];then
	BBB_HOSTNAME=root
fi
if [ -z $BBB_IP ];then
	BBB_IP=10.42.0.127
fi
echo "HOST : $BBB_HOSTNAME"
echo "IP :$BBB_IP"
ssh $BBB_HOSTNAME@$BBB_IP
