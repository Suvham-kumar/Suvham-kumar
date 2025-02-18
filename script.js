document.addEventListener("DOMContentLoaded", function () {
    // Dark Mode Toggle
    
    const darkModeToggle = document.getElementById("darkModeToggle");
    darkModeToggle.addEventListener("click", function () {
        document.body.classList.toggle("dark-mode");
    });

    // Smooth Scrolling
    document.querySelectorAll("a").forEach(anchor => {
        anchor.addEventListener("click", function (event) {
            event.preventDefault();
            const targetId = this.getAttribute("href").substring(1);
            document.getElementById(targetId).scrollIntoView({ behavior: "smooth" });
        });
    });

    // Dynamic Project List
    const projects = ["Smart Education Platform", "Multilingual Chatbot for Museums", "SQL Query Optimization Tool", "AI Disaster Management System"];
    const projectList = document.getElementById("projectList");

    projects.forEach(project => {
        let li = document.createElement("li");
        li.textContent = project;
        projectList.appendChild(li);
    });

    document.getElementById("contactForm").addEventListener("submit", function(event) {
        event.preventDefault();
        const name = document.getElementById("name").value;
        const email = document.getElementById("email").value;
        const message = document.getElementById("formMessage");
    
        if (name === "" || email === "") {
            message.textContent = "All fields are required!";
            message.style.color = "red";
        } else {
            message.textContent = "Message sent successfully!";
            message.style.color = "green";
            this.reset();}
    });
});