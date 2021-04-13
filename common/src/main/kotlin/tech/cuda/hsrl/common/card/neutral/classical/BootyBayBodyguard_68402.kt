package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BootyBayBodyguard_68402 : Card() {
    override val id = 68402
    override val name = "藏宝海湾保镖"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "你可以雇佣他们为你效命...直到有人出更高的价钱来让他们对付你。"
    override val artist = "Matt Cavotta"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1fe11903cf86558cd17259074804d05903c4a0a5973dcd798a926da0556e63c5.png"
}
