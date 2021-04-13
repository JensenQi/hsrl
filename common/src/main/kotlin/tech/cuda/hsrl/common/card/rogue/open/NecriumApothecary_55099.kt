package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NecriumApothecary_55099 : Card() {
    override val id = 55099
    override val name = "死金药剂师"
    override val description = "<b>连击：</b>从你的牌库中抽一张<b>亡语</b>随从牌并获得其<b>亡语</b>。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "死金药剂：既无余味，也无余生。"
    override val artist = "Yewon Park"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8f25a897db1b0d767da350980df9afb7408f3948a8c5c9c786e2d9ec21622f54.png"
}
