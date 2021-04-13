package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SorcerousSubstitute_59576 : Card() {
    override val id = 59576
    override val name = "巫术替身"
    override val description = "<b>战吼：</b>如果你拥有<b>法术伤害</b>，召唤一个该随从的复制。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "我的替身的替身还是我的替身。"
    override val artist = "Agatha Zhou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb17cc361eac2c679c5fcd4e189ab9330d8e007db594f6d0a4abe8182d3a44fd.png"
}
