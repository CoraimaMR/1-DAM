const heroTitle = document.querySelector(".hero-title");
const heroText = document.querySelector(".hero-text");

// Cambiando contenido con JavaScript
if (heroTitle && heroText) {
  heroTitle.textContent = "¡Bienvenido a nuestra tienda de videojuegos!";
  heroText.textContent =
    "Encuentra los mejores títulos para todas las plataformas. ¡Explora nuestro catálogo y disfruta de tus juegos favoritos!";
}

// Cambiando estilos con JavaScript
if (heroTitle) {
  heroTitle.style.color = "#ff6600";
  heroTitle.style.fontSize = "2.5em";
}

const pageTitle = document.querySelector(".page-title");

if (pageTitle) {
  const infoMessage = document.createElement("p");

  infoMessage.textContent = "¡Nuevos lanzamientos disponibles ahora!";
  infoMessage.classList.add("info-message");
  infoMessage.style.color = "#007acc";
  infoMessage.style.fontSize = "1.2em";
  pageTitle.appendChild(infoMessage);

  pageTitle.after(infoMessage);
}

// MENU DE HAMBURGUESAA

const header = document.querySelector("header");
const menuButton = document.querySelector(".menu-button");

if (menuButton && header) {
  menuButton.addEventListener("click", () => {
    const menuIsOpen = header.classList.toggle("nav-open");

    if (menuIsOpen) {
      header.classList.remove("nav-open");
    } else {
      header.classList.add("nav-open");
    }
  });
  // header.classList.toggle("active ");
}
