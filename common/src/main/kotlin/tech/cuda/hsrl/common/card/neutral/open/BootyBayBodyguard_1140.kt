package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BootyBayBodyguard_1140 : Card() {
    override val id = 1140
    override val name = "藏宝海湾保镖"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "你可以雇佣他们为你效命...直到有人出更高的价钱来让他们对付你。"
    override val artist = "Matt Cavotta"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bdba39db12d9f333d50d18c240f58680b4f97cfe9521f602c80a0cf4f7c5c58a.png"
}
