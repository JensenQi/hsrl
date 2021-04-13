package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwordOfTheFallen_62926 : Card() {
    override val id = 62926
    override val name = "逝者之剑"
    override val description = "在你的英雄攻击后，从你的牌库中施放一个 <b>奥秘</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "藏起来的奥秘不够精彩，不如全都侃出来。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e1ae578313b07207568ce6243a6e3c0a868a92dac765f7314558a740d1cfea25.png"
}
