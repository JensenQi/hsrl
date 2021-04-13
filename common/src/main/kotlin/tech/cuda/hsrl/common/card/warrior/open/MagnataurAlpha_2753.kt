package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MagnataurAlpha_2753 : Card() {
    override val id = 2753
    override val name = "猛犸人头领"
    override val description = "同时对其攻击目标相邻的随从造成伤害。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Tgt
    override val background = "猛犸人体格健硕，攻击起来大开大合，凌厉无比。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8be01be6ed93a73e6f26bfea06c48337471ea396c4669e2a7eeaae409ea9efd0.png"
}
