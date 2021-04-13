package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnimatedBroomstick_59029 : Card() {
    override val id = 59029
    override val name = "活化扫帚"
    override val description = "<b>突袭，战吼：</b>使你的其他随从获得<b>突袭</b>。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“哇哦，是层云1000型！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a7762bcb3583c0799cd1612102e0598c66d40370f423c8cf76b24dc91a984b4.png"
}
