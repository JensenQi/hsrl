package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MossyHorror_46667 : Card() {
    override val id = 46667
    override val name = "苔藓恐魔"
    override val description = "<b>战吼：</b>消灭所有其他攻击力小于或等于2的随从。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "听说这位异乡怪客来自一个叫恐魔园的地方。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/67fab4b28349fbabc569d83280bd1bef01498aeb19b59d6200ce5acb9b25d8ae.png"
}
