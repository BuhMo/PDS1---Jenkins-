job('Job-1-hijo') {
	description('Job DSL de ejemplo para el curso de Jenkins')
  	steps {
    		shell("bash jobscript.sh")
    	}
  	publishers {
		mailer('nakamakey@hotmail.com', true, true)
		mailer('pedroabmin01@gmail.com', true, true)
		slackNotifier {
			notifyAborted(true)
			notifyEveryFailure(true)
			notifyNotBuilt(false)
			notifyUnstable(false)
			notifyBackToNormal(true)
			notifySuccess(false)
			notifyRepeatedFailure(false)
			startNotification(false)
			includeTestSummary(false)
			includeCustomMessage(false)
			customMessage(null)
			sendAs(null)
			commitInfoChoice('NONE')
			teamDomain(null)
			authToken(null)
        	}
    	}
}
