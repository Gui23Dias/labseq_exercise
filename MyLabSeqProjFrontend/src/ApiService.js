const API_BASE_URL = 'http://localhost:8080/labseq';

class ApiService {
    static calculateLabseqValue(index) {
        const url = `${API_BASE_URL}/${index}`;

        return fetch(url)
            .then(response => response.json())
            .then(data => data)
            .catch(error => {
                console.error('Error:', error);
                throw error;
            });
    }
}

export default ApiService;
