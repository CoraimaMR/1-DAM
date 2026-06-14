// ========================================
// SELECCIÓN DE ELEMENTOS DEL DOM
// ========================================

// Selecciona el título y texto del héroe (sección principal)
const heroTitle = document.querySelector(".hero-title");
const heroText = document.querySelector(".hero-text");

// Selecciona el encabezado y sus componentes
const header = document.querySelector("header");
const menuButton = document.querySelector(".menu-button"); // Botón del menú hamburguesa
const cartInfo = document.querySelector(".cart-info"); // Información del carrito (clickeable)
const cartCount = document.querySelector(".cart-count"); // Número de artículos en el carrito
const navLinks = document.querySelectorAll(".nav a"); // Enlaces de navegación

// Selecciona elementos del modal del carrito
const cartModal = document.getElementById("cartModal"); // Overlay del modal
const cartModalBody = document.getElementById("cartModalBody"); // Cuerpo del modal donde va el contenido
const cartCloseBtn = document.getElementById("cartCloseBtn"); // Botón cerrar (X)

// Selecciona los botones de compra
const buyButtons = document.querySelectorAll(".buy-btn");

// Selecciona elementos de información
const stockInfo = document.querySelector(".stock-info"); // Total de juegos disponibles
const priceInfo = document.querySelector(".price-info"); // Precio total del catálogo

// Selecciona elementos del buscador
const searchInput = document.querySelector(".search"); // Campo de búsqueda
const searchBtn = document.querySelector(".search-btn"); // Botón de búsqueda
const result = document.querySelector(".search-result"); // Resultado de búsqueda

// Selecciona todas las tarjetas de juegos
const gameCards = document.querySelectorAll(".card");

// ========================================
// DATOS DEL CATÁLOGO
// ========================================

// Array de juegos disponibles con nombre y precio
const games = [
  { name: "Cyberpunk 2077", price: 14.99 },
  { name: "Elden Ring", price: 56.99 },
  { name: "Halo Infinite", price: 39.99 },
  { name: "Zelda TOTK", price: 59.99 },
];

// Array que almacena los productos agregados al carrito
let cart = [];

// ========================================
// CONTENIDO DEL HÉROE (SECCIÓN PRINCIPAL)
// ========================================

// Cambia el contenido del título y texto del héroe
if (heroTitle && heroText) {
  heroTitle.textContent = "Bienvenido a la mejor tienda gaming";
  heroText.textContent = "Compra tus juegos favoritos al mejor precio";
}

// ========================================
// MENÚ HAMBURGUESA DESPLEGABLE
// ========================================

// Añade evento al botón del menú para abrir/cerrar el desplegable
if (menuButton && header) {
  menuButton.addEventListener("click", () => {
    // Alterna la clase 'nav-open' para mostrar/ocultar el menú
    const isOpen = header.classList.toggle("nav-open");
    // Actualiza el atributo aria-expanded para accesibilidad
    menuButton.setAttribute("aria-expanded", String(isOpen));
  });
}

// Cierra el menú automáticamente al hacer clic en un enlace de navegación
navLinks.forEach((link) => {
  link.addEventListener("click", () => {
    // Remueve la clase para cerrar el menú
    header.classList.remove("nav-open");
    // Actualiza el atributo para indicar que el menú está cerrado
    menuButton.setAttribute("aria-expanded", "false");
  });
});

// ========================================
// SISTEMA DE CARRITO DE COMPRAS
// ========================================

// Inicializa el contador del carrito en 0
if (cartCount) {
  cartCount.textContent = cart.length;
}

// Añade evento a cada botón de compra
buyButtons.forEach((button, index) => {
  button.addEventListener("click", () => {
    // Obtiene el juego correspondiente del índice del botón
    const game = games[index];
    // Agrega el juego al carrito
    cart.push(game);
    // Actualiza el contador del carrito
    if (cartCount) {
      cartCount.textContent = cart.length;
    }
  });
});

// Abre la ventana modal al hacer clic en el carrito
if (cartInfo) {
  cartInfo.addEventListener("click", () => {
    showCartModal();
  });
}

// ========================================
// FUNCIÓN: MOSTRAR MODAL DEL CARRITO
// ========================================

// Crea y muestra el modal del carrito dentro de la página
function showCartModal() {
  // Comienza a construir el HTML del carrito
  let cartHTML = "";

  // Verifica si el carrito está vacío
  if (cart.length === 0) {
    cartHTML =
      '<div class="cart-empty-message">Tu carrito está vacío. ¡Compra algunos juegos!</div>';
  } else {
    // Crea una tabla para mostrar los juegos
    cartHTML =
      '<table class="cart-table"><thead><tr><th>Juego</th><th>Precio</th></tr></thead><tbody>';

    // Variable para acumular el total
    let total = 0;
    // Recorre cada juego en el carrito y lo agrega a la tabla
    cart.forEach((game) => {
      cartHTML += `<tr><td>${game.name}</td><td>€${game.price.toFixed(2)}</td></tr>`;
      total += game.price;
    });

    // Cierra la tabla
    cartHTML += "</tbody></table>";
    // Agrega el total con formato
    cartHTML += `<div class="cart-total">Total: €${total.toFixed(2)}</div>`;
    // Muestra la cantidad de artículos
    cartHTML += `<div class="cart-items-count"><strong>${cart.length} artículo(s) en el carrito</strong></div>`;
  }

  // Inserta el HTML en el cuerpo del modal
  cartModalBody.innerHTML = cartHTML;

  // Muestra el modal agregando la clase 'active'
  cartModal.classList.add("active");
}

// Función para cerrar el modal
function closeCartModal() {
  cartModal.classList.remove("active");
}

// Evento para abrir el modal al hacer clic en el carrito
if (cartInfo) {
  cartInfo.addEventListener("click", () => {
    showCartModal();
  });
}

// Evento para cerrar el modal con el botón X
if (cartCloseBtn) {
  cartCloseBtn.addEventListener("click", () => {
    closeCartModal();
  });
}

// Cierra el modal si hace clic fuera del contenedor
if (cartModal) {
  cartModal.addEventListener("click", (event) => {
    // Solo cierra si hace clic en el overlay, no en el contenedor del modal
    if (event.target === cartModal) {
      closeCartModal();
    }
  });
}

// ========================================
// INFORMACIÓN DEL CATÁLOGO
// ========================================

// Muestra la cantidad total de juegos disponibles
if (stockInfo) {
  stockInfo.textContent = `Juegos: ${games.length}`;
}

// Calcula el precio total sumando todos los juegos del catálogo
const totalPrice = games.reduce((sum, game) => sum + game.price, 0);
// Muestra el precio total en la barra de información
if (priceInfo) {
  priceInfo.textContent = `Total: ${totalPrice.toFixed(2)}€`;
}

// ========================================
// SISTEMA DE BÚSQUEDA
// ========================================

// Función para actualizar los resultados de búsqueda
function updateSearchResult(query) {
  // Normaliza el texto: quita espacios y convierte a minúsculas
  const normalized = query.trim().toLowerCase();

  // Si no existe el elemento de resultado, salir de la función
  if (!result) return;

  // Si el campo de búsqueda está vacío
  if (!normalized) {
    result.textContent = "Escribe un juego para buscar en el catálogo.";
    filterCards(""); // Muestra todas las tarjetas
    return;
  }

  // Busca coincidencias parciales en el nombre del juego
  const matches = games.filter((game) =>
    game.name.toLowerCase().includes(normalized),
  );

  // Filtra las tarjetas para mostrar solo las coincidencias
  filterCards(normalized);

  // Mensajes según los resultados
  if (matches.length === 0) {
    result.textContent = "❌ No se encontró ningún juego.";
    return;
  }

  // Si encuentra exactamente 1 juego
  if (matches.length === 1) {
    result.textContent = `✔ Encontrado: ${matches[0].name}`;
    return;
  }

  // Si encuentra más de 1 juego
  result.textContent = `✔ ${matches.length} juegos encontrados.`;
}

// Función para mostrar/ocultar tarjetas según la búsqueda
function filterCards(query) {
  // Recorre todas las tarjetas de juegos
  gameCards.forEach((card) => {
    // Obtiene el título del juego (h3) y lo convierte a minúsculas
    const title = card.querySelector("h3")?.textContent.toLowerCase() || "";
    // Muestra la tarjeta si coincide con la búsqueda o si no hay búsqueda
    if (!query || title.includes(query)) {
      card.style.display = "block";
    } else {
      card.style.display = "none"; // Oculta la tarjeta
    }
  });
}

// Añade eventos al buscador (botón y campo de texto)
if (searchBtn && searchInput) {
  // Evento al hacer clic en el botón de búsqueda
  searchBtn.addEventListener("click", () => {
    updateSearchResult(searchInput.value);
  });

  // Evento al presionar Enter en el campo de búsqueda
  searchInput.addEventListener("keydown", (event) => {
    if (event.key === "Enter") {
      event.preventDefault(); // Evita comportamiento por defecto
      updateSearchResult(searchInput.value);
    }
  });
}

// ========================================
// MENSAJE INICIAL
// ========================================

// Muestra un mensaje de instrucción cuando carga la página
if (result) {
  result.textContent =
    "Busca un título: Cyberpunk 2077, Elden Ring, Halo Infinite o Zelda TOTK.";
}
