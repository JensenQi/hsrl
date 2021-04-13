package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BackroomBouncer_40931 : Card() {
    override val id = 40931
    override val name = "后院保镖"
    override val description = "每当一个友方随从死亡，便获得+1 攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "你来后院做啥？前院谁来看着？"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c15876f12abab793e4b4c09b573a09a2c3d1ba32d9f865d70b6aa3f265f2ee50.png"
}
