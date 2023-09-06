# Use an official Node.js runtime as the base image
FROM node:14

# Set the working directory within the container
WORKDIR /app

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy all files from the current directory to the container's working directory
COPY . .

# Build the React app
RUN npm run build

# Expose the port that the app will run on
EXPOSE 3000

# Define the command to run the app
CMD ["npm", "start"]
