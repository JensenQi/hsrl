package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZaiTheIncredible_61137 : Card() {
    override val id = 61137
    override val name = "扎依，出彩艺人"
    override val description = "<b>战吼：</b> 复制你手牌中最左边和最右边的牌。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "接下来有请她的弟弟，平凡艺人扎尔。"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8cf813ce578d1ed392aba5a1198acdbd00edd24162fbe94db2b2597570ae0db8.png"
}
