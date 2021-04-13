package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightAcolyte_46460 : Card() {
    override val id = 46460
    override val name = "暮光侍僧"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，则将此随从的攻击力与另一个随从交换。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "巨龙们把他留在身边只是为了将来当点心吃掉。"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d7b8e65d69d30bd1c4a97369b2ca9ab9285a4f02c9747b39a511a5b6187d519a.png"
}
