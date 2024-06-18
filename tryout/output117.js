let config = {
    alert: setInterval(() => {
        console.log('Alert!');
    }, 1000),
};

config = null;

/*
The setInterval callback will still be called every second

Normally when we set objects equal to null, those objects get garbage collected as there is no reference anymore to that object. However, since the callback function within setInterval is an arrow function (thus bound to the config object), the callback function still holds a reference to the config object. As long as there is a reference, the object won't get garbage collected. Since this is an interval, setting config to null or delete-ing config.alert won't garbage-collect the interval, so the interval will still be called. It should be cleared with clearInterval(config.alert) to remove it from memory. Since it was not cleared, the setInterval callback function will still get invoked every 1000ms (1s).
*/