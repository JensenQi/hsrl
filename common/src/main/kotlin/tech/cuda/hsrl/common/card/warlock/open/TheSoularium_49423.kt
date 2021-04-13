package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheSoularium_49423 : Card() {
    override val id = 49423
    override val name = "莫瑞甘的灵界"
    override val description = "抽三张牌。在你的回合结束时，弃掉它们。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.BoomsdayProject
    override val background = "最烂的旅游景点，没有之一。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5899f6491e0a1c32aacde456d99b16efc36932a1e79137d2dbd1a95724ad2f42.png"
}
