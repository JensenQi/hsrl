package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChargedDevilsaur_41286 : Card() {
    override val id = 41286
    override val name = "狂奔的魔暴龙"
    override val description = "<b>冲锋，战吼：</b>在本回合中无法攻击英雄。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "瞧见没，这就是让恐龙吃跳跳糖喝可乐的下场！"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/115175a198a8b34c2b9cb203a95d6ad2203c2a9a26c4a71624c8a93717c7d0f2.png"
}
