package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GlacialShard_41111 : Card() {
    override val id = 41111
    override val name = "冰川裂片"
    override val description = "<b>战吼：</b> <b>冻结</b>一个敌人。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "最爱榴莲味！"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c736455fe5234f79258e7a41fb34425ae800318ba723cf08e486f0d642ea612.png"
}
