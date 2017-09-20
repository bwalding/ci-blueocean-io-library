def doTheStuff() {
      
      stage("Orchestrator: Stage A") {
          sh "echo Stage A"
      }

      stage("Orchestrator: Stage B") {
          sh "echo Stage B"
      }
  }
