package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkConviction_42469 : Card() {
    override val id = 42469
    override val name = "黑暗裁决"
    override val description = "将一个随从的攻击力和生命值 变为3。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Kotf
    override val background = "在乌瑟尔的法庭上，他既是法官，也是陪审团，还是行刑者……"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/db45800e996bf2e536f2c5295dccfddef4190d9dc82d454d81dbc18e52d91495.png"
}
