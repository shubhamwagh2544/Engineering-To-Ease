// create a circle on click on webpage (click being center)
// at max two circles, else remove all
// if these two circles intersect each other, print something

document.addEventListener('click', (e) => {
    const x = e.clientX;
    const y = e.clientY;

    console.log('x = ', x, " ::  y = ", y);

    circleCoordiantes.push({ x, y })

    // create a circle
    const circle = document.createElement('div');
    circle.classList.add('circle')

    const radius = "100px"

    circle.style.top = x - 100 + "px";
    circle.style.left = y - 100 + "px";

    circle.style.width = radius;
    circle.style.height = radius;

    document.body.appendChild(circle)

    // check if <= 2
    const totalCircles = document.querySelectorAll('.circle');
    if (totalCircles.length > 2) {
        totalCircles.forEach((circle) => {
            document.body.removeChild(circle)
        })
    }

    // check intersection
    if (totalCircles.length === 2) {
        logIfIntersectingCircles();
    }
})

const circleCoordiantes = [];

function logIfIntersectingCircles() {
    const circle1 = circleCoordiantes[0];
    const circle2 = circleCoordiantes[1];

    const x1 = circle1.x;
    const y1 = circle1.y;

    const x2 = circle2.x;
    const y2 = circle1.y;

    const radius = 100;

    // find distance between two circles
    const distance = Math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

    // Check if circles intersect
    if (distance <= 2 * radius) {
        console.log('Circles intersect!');
    }

}