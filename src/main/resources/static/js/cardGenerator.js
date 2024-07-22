console.log("gwro");
$(document).ready(function() {
    $('#add-card-btn').click(function() {
        $.ajax({
            url: '/api/addCard',
            method: 'POST',
            contentType: 'application/json',
            success: function(data) {
                let cardHtml = `
                <div class="card">
                    <img src="${data.imageUrl}" alt="Car Image">
                    <div class="card-content">
                        <h2>${data.title}</h2>
                        <p>${data.description}</p>
                        <p class="price">${data.price}</p>
                    </div>
                </div>`;
                $('#card-container').append(cardHtml);
            },
            error: function(error) {
                console.error('Error adding card:', error);
            }
        });
    });
});
