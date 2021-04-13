package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheGlassKnight_48107 : Card() {
    override val id = 48107
    override val name = "玻璃骑士"
    override val description = "<b>圣盾</b> 每当有角色获得你的治疗时，获得<b>圣盾</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.TheWitchwood
    override val background = "她看起来很吓人，但有一颗玻璃心。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/926bec330e0ce399997e5ab1a7f6322b8f61ee497abf1b23554a0c89aa1efd5e.png"
}
