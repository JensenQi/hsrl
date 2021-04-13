package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BronzeGatekeeper_47781 : Card() {
    override val id = 47781
    override val name = "青铜门卫"
    override val description = "<b>磁力</b> <b>嘲讽</b>"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "我的盾，我的全身心，现在都属于你。"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/67dec23490c73d5a06c882a359f17eec55073fd03e9cc25ee25c4c8acf1f5b76.png"
}
