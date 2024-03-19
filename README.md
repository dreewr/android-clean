fun createToggleMapper(): ToggleMapper = object : ToggleMapper() {
    override fun map(toggle: ToggleResponse): ToggleData = object : ToggleData {
        override val id: String = "someId"
        override val state: ToggleState = if (toggle.enabled && toggle.reasonId.isNullOrEmpty()) {
            object : Enabled {}
        } else {
            object : Disabled {}
        }
    }

    override fun ToggleResponse.handleEnabledState(): Enabled = object : Enabled {}

    override fun ToggleResponse.handleDisabledState(): Disabled = object : Disabled {}
}
