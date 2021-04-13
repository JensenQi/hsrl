package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Undertaker_1910 : Card() {
    override val id = 1910
    override val name = "送葬者"
    override val description = "每当你召唤一个具有<b>亡语</b>的随从，便获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "在这样一个几乎每个人都能把同伴复活的世界，送葬者的工作其实很轻松。"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a011ed860a88c85f2fc22a5110a3f33c1505451bc9cbdc9803817aae012f258d.png"
}
