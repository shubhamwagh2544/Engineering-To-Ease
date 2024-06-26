const teams = [
    { name: 'Team 1', members: ['Paul', 'Lisa'] },
    { name: 'Team 2', members: ['Laura', 'Tim'] },
];

function* getMembers(members) {
    for (let i = 0; i < members.length; i++) {
        yield members[i];
    }
}

function* getTeams(teams) {
    for (let i = 0; i < teams.length; i++) {
        // ✨ SOMETHING IS MISSING HERE ✨              // yield * getMembers(teams[i].members)
    }
}

const obj = getTeams(teams);
obj.next(); // { value: "Paul", done: false }
obj.next(); // { value: "Lisa", done: false }


/*
In order to iterate over the members in each element in the teams array, we need to pass teams[i].members to the getMembers generator function. The generator function returns a generator object. In order to iterate over each element in this generator object, we need to use yield*.

If we would've written yield, return yield, or return, the entire generator function would've gotten returned the first time we called the next method.
*/