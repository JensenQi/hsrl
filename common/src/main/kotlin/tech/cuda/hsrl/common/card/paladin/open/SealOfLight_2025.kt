package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SealOfLight_2025 : Card() {
    override val id = 2025
    override val name = "光明圣印"
    override val description = "为你的英雄恢复 4点生命值，并在本回合中 获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Gvg
    override val background = "圣光赐予我力量！"
    override val artist = "Jason Chan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4c97f89f9e3a012fc8ac7b2f95a0c1efd8f8417551699567ec9426d89623dc7c.png"
}
