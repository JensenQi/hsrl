package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CabalShadowPriest_69842 : Card() {
    override val id = 69842
    override val name = "秘教暗影祭司"
    override val description = "<b>战吼：</b>获得一个攻击力小于或等于2的敌方随从的控制权。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "你绝不知道谁在为这个秘密组织效劳..."
    override val artist = "Chippy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/017c5a495ea259e1fcd23ca6e30806ad7944acb6cdf0139ee798ea5c63788521.png"
}
