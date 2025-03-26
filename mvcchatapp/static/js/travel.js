function getTravelPlan() {
    let destination = document.getElementById("destination").value;

    fetch(`/travel/${destination}`)
    .then(response => response.json())
    .then(plans => {
        let output = "";
        plans.forEach(plan => {
            output += `<p>Destination: ${plan.destination} - Places: ${plan.placesToVisit} - Hotels: ${plan.hotels} - Budget: ${plan.budget}</p>`;
        });
        document.getElementById("travel-output").innerHTML = output;
    });
}