package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InnerDemon_59867 : Card() {
    override val id = 59867
    override val name = "心中的恶魔"
    override val description = "在本回合中，使你的英雄获得+8攻击力。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Legacy1635
    override val background = "各种悲情设定的重要组成部分。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f15e5dc2ada1af725c6c16d0993c5fd0149b555a9c7fb245829b7018340e0ece.png"
}
