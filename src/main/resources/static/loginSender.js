function sendLoginForm() {

var login = null;
var password = null;

var login = document.getElementByName("login");
var password = document.getElementByName("password");

if(login == null || password == null) {}

form.submit();

}

const send_button = document.getElementById
            ("send_data");


        function postData(path, params, method) {

            // Create form
            const hidden_form = document.createElement('form');

            // Set method to post by default
            hidden_form.method = method || 'post';

            // Set path
            hidden_form.action = path;

            for (const key in params) {
                if (params.hasOwnProperty(key)) {
                    const hidden_input = document.createElement
                        ('input');
                    hidden_input.type = 'hidden';
                    hidden_input.name = key;
                    hidden_input.value = params[key];

                    hidden_form.appendChild(hidden_input);
                }
            }

            document.body.appendChild(hidden_form);
            hidden_form.submit();
        }


        send_button.addEventListener('click', () => {

            // Call postData function
            postData('https://...com/posts',
                { title: 'foo', body: 'bar', userId: 1 });
        });