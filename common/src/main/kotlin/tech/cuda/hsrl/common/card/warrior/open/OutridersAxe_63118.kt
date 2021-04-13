package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OutridersAxe_63118 : Card() {
    override val id = 63118
    override val name = "前锋战斧"
    override val description = "在你的英雄攻击并消灭一个随从后，抽一张牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“我只需要交四只斑马蹄子？那能有多难？”"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e1e237941f706147a246d8bc8358775203971dfe04bd05d588192dba8006f48c.png"
}
