package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThunderLizard_41257 : Card() {
    override val id = 41257
    override val name = "雷霆蜥蜴"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，则获得<b>进化</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "什么？都已经这样了，还需要进化？"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1da1cae567d10082e865055d3eb5206d065a48a8fd1838a2c917ceabbc5f41de.png"
}
