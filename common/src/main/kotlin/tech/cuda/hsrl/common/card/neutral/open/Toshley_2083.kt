package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Toshley_2083 : Card() {
    override val id = 2083
    override val name = "托什雷"
    override val description = "<b>战吼，亡语：</b> 将一张<b>零件</b>牌置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "托什雷的基地是侏儒工程师们在外域的港湾。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/db1b767a546669b7ef6990f45d72f9ba8a63ed03345290fc6b8c6ea845c6bef9.png"
}
