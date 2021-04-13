package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BaristaLynchen_52413 : Card() {
    override val id = 52413
    override val name = "咖啡师林彻"
    override val description = "<b>战吼：</b>将你的所有其他<b>战吼</b>随从的复制置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“谢谢你，银色指挥官。”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fc2e87464a37421d1b729d6f9de25e9a6bf27c5445000cc11e49b8b56c740919.png"
}
