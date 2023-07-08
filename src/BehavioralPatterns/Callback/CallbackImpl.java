package BehavioralPatterns.Callback;

class CallbackImpl implements Callback {
    @Override
    public void onComplete(String result) {
        System.out.println("Processing complete. Result: " + result);
    }
}
