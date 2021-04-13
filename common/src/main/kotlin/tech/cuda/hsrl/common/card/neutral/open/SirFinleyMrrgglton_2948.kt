package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SirFinleyMrrgglton_2948 : Card() {
    override val id = 2948
    override val name = "芬利·莫格顿爵士"
    override val description = "<b>战吼：发现</b>一个新的基础英雄技能。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "除了正常的官方用语外，他还精通14种鱼人方言。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68ab2e3654fba5fb8c6f01c50aac9f974f8362816fab2f0011b8446ec8ddd4dc.png"
}
