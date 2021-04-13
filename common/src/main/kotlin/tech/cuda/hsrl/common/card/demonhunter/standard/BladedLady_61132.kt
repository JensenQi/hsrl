package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BladedLady_61132 : Card() {
    override val id = 61132
    override val name = "刀锋舞娘"
    override val description = "<b>突袭</b> 如果你的英雄的攻击力大于或等于6点，则法力值消耗为（1）点。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "哪有什么天才，她是把别人学魔法的工夫都用在练刀上的。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/de34b09648c65f52a160483567eaf3407e0465612da41fb635672e4aae54335f.png"
}
