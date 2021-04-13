package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeadlyPoison_69522 : Card() {
    override val id = 69522
    override val name = "致命药膏"
    override val description = "使你的武器获得+2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "潜行者们都小心翼翼地保守着制毒的秘密，唯恐法师们把毒药用在他们的法术之中。毒性箭？剧毒之雨？毒元素？听上去就很可怕。"
    override val artist = "Trevor Jacobs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d81d92310b8c78f11d5784a32750731775332d51bfe75718b90c6c7d11659c26.png"
}
