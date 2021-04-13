package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CircusAmalgam_61428 : Card() {
    override val id = 61428
    override val name = "马戏团融合怪"
    override val description = "<b>嘲讽</b> <i>该随从具有全部随从类型。</i>"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.All
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "所有生物集于一身，有了它，谁还去看宠物乐园？！"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f151c0435aa34e2650f57dc4edb597109bdbbd53c12718c77bed6fc04b0d8a45.png"
}
