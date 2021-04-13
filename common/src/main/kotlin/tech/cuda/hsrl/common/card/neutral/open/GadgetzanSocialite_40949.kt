package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GadgetzanSocialite_40949 : Card() {
    override val id = 40949
    override val name = "加基森名媛"
    override val description = "<b>战吼：</b> 恢复 2点生命值。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "她们无论走到哪，都是舆论的焦点，媒体的宠儿。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e31844a4be30b42067fe548c131b002ccbb3fdd4686b84d19aebd54d4bd27c99.png"
}
