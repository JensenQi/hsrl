package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlowtorchSaboteur_56226 : Card() {
    override val id = 56226
    override val name = "喷灯破坏者"
    override val description = "<b>战吼：</b>你对手的下一个英雄技能的法力值消耗为（3）点。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "在他加入团队之前，我们一直用的是胶带。"
    override val artist = "Ekaterina Shapovalova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e83b069af0eed72a2b8fc59379c8e2d7bfa9a2ddf904dbe48c9e963b97a0b6a9.png"
}
